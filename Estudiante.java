import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private List<RegistroAsistencias> registros;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.registros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarRegistro(RegistroAsistencias registro) {
        registros.add(registro);
    }

    public void mostrarReporteCompleto() {
        System.out.println("Reporte de Asistencias para el estudiante: " + nombre);
        for (RegistroAsistencias registro : registros) {
            registro.mostrarReporteAsistencias();
            System.out.println("------------------------");
        }
    }
}
