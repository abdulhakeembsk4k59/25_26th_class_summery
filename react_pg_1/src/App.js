import logo from './logo.svg';
import './App.css';
import React, { useState } from "react";

function App() {
  const [inputValue, setInputValue] = useState("");
  const hadleInputChange = (event) => {
    setInputValue(event.target.value);
  };

  
  return (
    <div>
      <input type="text" value={inputValue} onChange={hadleInputChange} />
      <p>{inputValue}</p>
    </div>
  );
}

export default App;
