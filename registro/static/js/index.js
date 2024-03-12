const Estudiante=async()=>{
    try{
        const response = await fetch('http://127.0.0.1:8000/registro/registro/');
        const data = await response.json();
        let content=``;
        data.estudiante.forEach((estudiante, index)=>{
            content+=`
                <tr>
                    <td>${index}</td>
                    <td>${estudiante.name}</td>
                    <td>${estudiante.curso}</td>
                    <td>${estudiante.asignatura}</td>
                    <td>${estudiante.docente}</td>
                    <td>${estudiante.date}</td>
                    <td>${estudiante.asistencia}</td>
                </tr>
            `;
        });
        tableBody_estudiante.innerHTML = content;
    }catch(ex){
        alert(ex);
    }
};

window.addEventListener('load', async()=>{
    await Estudiante();
});