import React, { useState } from "react";

function NameForm(props) {
  const [name, setName] = useState("");

  function handleSubmit(event) {
    event.preventDefault();
    props.onSubmit(name);
    setName("");
  }

  function handleNameChange(event) {
    setName(event.target.value);
  }

  return (
    <form onSubmit={handleSubmit}>
      <label>
        Name:
        <input type="text" value={name} onChange={handleNameChange} />
      </label>
      <button type="submit">Submit</button>
    </form>
  );
}

function NameList(props) {
  function handleEditClick(index) {
    const newName = prompt("Enter the new name:");
    if (newName) {
      props.onEdit(index, newName);
    }
  }

  function handleDeleteClick(index) {
    props.onDelete(index);
  }

  return (
    <ul>
      {props.names.map((name, index) => (
        <li key={index}>
          {name}
          <button onClick={() => handleEditClick(index)}>Edit</button>
          <button onClick={() => handleDeleteClick(index)}>Delete</button>
        </li>
      ))}
    </ul>
  );
}

function NameManager() {
  const [names, setNames] = useState([]);

  function handleNameSubmit(newName) {
    setNames([...names, newName]);
  }

  function handleNameEdit(index, newName) {
    const newNames = [...names];
    newNames[index] = newName;
    setNames(newNames);
  }

  function handleNameDelete(index) {
    const newNames = [...names];
    newNames.splice(index, 1);
    setNames(newNames);
  }

  return (
    <div>
      <NameForm onSubmit={handleNameSubmit} />
      <NameList
        names={names}
        onEdit={handleNameEdit}
        onDelete={handleNameDelete}
      />
    </div>
  );
}

export default NameManager;
