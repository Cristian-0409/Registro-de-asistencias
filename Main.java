import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, String> usuariosRegistrados = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menú de inicio
        System.out.println("Bienvenido");
        System.out.println("1. Iniciar sesión");
        System.out.println("2. Registrarse");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        
        switch(opcion) {
            case 1:
                iniciarSesion(scanner);
                break;
            case 2:
                registrarse(scanner);
                break;
            default:
                System.out.println("Opción inválida");
        }
    }
    
    private static void iniciarSesion(Scanner scanner) {
        System.out.print("Ingrese su nombre de usuario: ");
        String usuario = scanner.next();
        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.next();
        
        if (usuariosRegistrados.containsKey(usuario) && usuariosRegistrados.get(usuario).equals(contrasena)) {
            System.out.println("Inicio de sesión exitoso");
            // Aquí puedes implementar la lógica para acceder al sistema
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos");
        }
    }
    
    private static void registrarse(Scanner scanner) {
        System.out.print("Ingrese un nombre de usuario: ");
        String usuario = scanner.next();
        System.out.print("Ingrese una contraseña: ");
        String contrasena = scanner.next();
        
        if (usuariosRegistrados.containsKey(usuario)) {
            System.out.println("El nombre de usuario ya está en uso");
        } else {
            usuariosRegistrados.put(usuario, contrasena);
            System.out.println("Registro exitoso");
        }
    }
}
