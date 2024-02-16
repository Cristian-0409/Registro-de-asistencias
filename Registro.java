import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Estudiante {
    private String nombre;
    private String apellido;
    // Otros campos relevantes
    
    public Estudiante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    // Getters y setters
}

class Asignatura {
    private String nombre;
    private String docente;
    // Otros campos relevantes
    
    public Asignatura(String nombre, String docente) {
        this.nombre = nombre;
        this.docente = docente;
    }
    
    // Getters y setters
}

class RegistroAsistencia {
    private Map<Estudiante, Boolean> asistencias;
    
    public RegistroAsistencia() {
        asistencias = new HashMap<>();
    }
    
    public void marcarAsistencia(Estudiante estudiante, boolean asistencia) {
        asistencias.put(estudiante, asistencia);
    }
    
    // Otros métodos para gestionar el registro de asistencias
}

