public class MainApp {
    public static void main(String[] args) {
        Estudiante estudianteJuan = new Estudiante("Juan");
        Estudiante estudianteMaria = new Estudiante("Maria");

        RegistroAsistencias registroJuan = new RegistroAsistencias(estudianteJuan);
        RegistroAsistencias registroMaria = new RegistroAsistencias(estudianteMaria);

        Asignatura matematicas = new Asignatura("Matemáticas");
        Asignatura historia = new Asignatura("Historia");
        Asignatura ingles = new Asignatura("Inglés");
        Asignatura ciencias = new Asignatura("Ciencias");
        Asignatura programacion = new Asignatura("Programación");

        registroJuan.agregarAsignatura(matematicas);
        registroJuan.agregarAsignatura(historia);
        registroJuan.agregarAsignatura(ingles);
        registroJuan.agregarAsignatura(ciencias);
        registroJuan.agregarAsignatura(programacion);

        registroMaria.agregarAsignatura(matematicas);
        registroMaria.agregarAsignatura(ingles);
        registroMaria.agregarAsignatura(programacion);

        // Simular asistencias
        registroJuan.registrarAsistencia("Matemáticas");
        registroJuan.registrarAsistencia("Historia");
        registroJuan.registrarAsistencia("Inglés");
        registroJuan.registrarAsistencia("Ciencias");
        registroJuan.registrarAsistencia("Programación");

        registroMaria.registrarAsistencia("Matemáticas");
        registroMaria.registrarAsistencia("Inglés");
        registroMaria.registrarAsistencia("Programación");

        // Mostrar reporte completo de asistencias para cada estudiante
        estudianteJuan.agregarRegistro(registroJuan);
        estudianteMaria.agregarRegistro(registroMaria);

        estudianteJuan.mostrarReporteCompleto();
        estudianteMaria.mostrarReporteCompleto();
    }
}


