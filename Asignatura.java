public class Asignatura {
    private String nombre;
    private int asistencias;
    private int totalClases;

    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.asistencias = 0;
        this.totalClases = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void registrarAsistencia() {
        asistencias++;
        totalClases++;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public int getTotalClases() {
        return totalClases;
    }

    public double calcularPorcentajeAsistencias() {
        if (totalClases == 0) {
            return 0.0;
        }
        return ((double) asistencias / totalClases) * 100;
    }
}
