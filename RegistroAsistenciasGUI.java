import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class RegistroAsistenciasGUI extends JFrame {
    private DefaultTableModel estudiantesTableModel;
    private JTable estudiantesTable;

    public RegistroAsistenciasGUI() {
        // Configuración de la ventana principal
        setTitle("Registro de Asistencias");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Creación de la tabla de estudiantes
        estudiantesTableModel = new DefaultTableModel();
        estudiantesTableModel.addColumn("Nombre");
        estudiantesTableModel.addColumn("Apellido");
        estudiantesTable = new JTable(estudiantesTableModel);

        // Panel para la tabla de estudiantes
        JScrollPane estudiantesScrollPane = new JScrollPane(estudiantesTable);
        estudiantesScrollPane.setPreferredSize(new Dimension(400, 200));

        // Panel principal
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.add(estudiantesScrollPane, BorderLayout.CENTER);

        // Agregar panel principal a la ventana
        add(panelPrincipal);

        // Agregar datos de ejemplo
        List<Estudiante> estudiantes = obtenerEstudiantesDeEjemplo();
        for (Estudiante estudiante : estudiantes) {
            agregarEstudianteATabla(estudiante);
        }
    }

    private void agregarEstudianteATabla(Estudiante estudiante) {
        estudiantesTableModel.addRow(new Object[]{estudiante.getNombre(), estudiante.getApellido()});
    }

    private List<Estudiante> obtenerEstudiantesDeEjemplo() {
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan", "Perez"));
        estudiantes.add(new Estudiante("Maria", "Gonzalez"));
        estudiantes.add(new Estudiante("Pedro", "Rodriguez"));
        return estudiantes;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RegistroAsistenciasGUI gui = new RegistroAsistenciasGUI();
            gui.setVisible(true);
        });
    }
}

class Estudiante {
    private String nombre;
    private String apellido;

    public Estudiante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
