import java.util.HashMap;

public class RegistroAsistencias {
    private HashMap<String, Asignatura> asignaturas;
    private Estudiante estudiante;

    public RegistroAsistencias(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.asignaturas = new HashMap<>();
    }

    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.put(asignatura.getNombre(), asignatura);
    }

    public void registrarAsistencia(String nombreAsignatura) {
        Asignatura asignatura = asignaturas.get(nombreAsignatura);
        if (asignatura != null) {
            asignatura.registrarAsistencia();
        } else {
            System.out.println("La asignatura no está registrada para este estudiante.");
        }
    }

    public void mostrarReporteAsistencias() {
        System.out.println("Reporte de Asistencias para el estudiante: " + estudiante.getNombre());
        for (Asignatura asignatura : asignaturas.values()) {
            System.out.println("Asignatura: " + asignatura.getNombre());
            System.out.println("Asistencias: " + asignatura.getAsistencias());
            System.out.println("Total de Clases: " + asignatura.getTotalClases());
            System.out.println("Porcentaje de Asistencias: " + asignatura.calcularPorcentajeAsistencias() + "%");
            System.out.println("------------------------");
        }
    }
}

