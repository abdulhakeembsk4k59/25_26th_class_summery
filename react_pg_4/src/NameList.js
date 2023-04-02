import React, { useState, useEffect } from 'react';

function Names() {
const [names, setNames] = useState([]);

useEffect(() => {
const fetchNames = async () => {
const response = await fetch('http://localhost:9809/names', {
method: 'GET',
headers: {
'Content-Type': 'application/json'
},
mode: 'cors'
});
const data = await response.json();
setNames(data);
};
fetchNames();
}, []);

return (
<div>
<h1>List of Names</h1>
<ul>
{names.map((name, index) => (
<li key={index}>{name}</li>
))}
</ul>
</div>
);
}

export default Names;