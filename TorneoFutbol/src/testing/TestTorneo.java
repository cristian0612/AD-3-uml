package testing;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import negocio.Equipo;
import negocio.Futbolista;
import negocio.Partido;
import negocio.Torneo;

public class TestTorneo {

    static Scanner sc = new Scanner(System.in);
    static List<Equipo> equipos = new ArrayList<>();
    static List<Partido> partidos = new ArrayList<>();
    static Torneo torneo = null;

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- MENÚ TORNEO DE FÚTBOL ---");
            System.out.println("1. Crear Torneo");
            System.out.println("2. Registrar Equipo");
            System.out.println("3. Registrar Futbolista en un Equipo");
            System.out.println("4. Generar Partido");
            System.out.println("5. Asignar Resultado de Partido");
            System.out.println("6. Mostrar Partidos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    crearTorneo();
                    break;
                case 2:
                    registrarEquipo();
                    break;
                case 3:
                    registrarFutbolista();
                    break;
                case 4:
                    generarPartido();
                    break;
                case 5:
                    asignarResultado();
                    break;
                case 6:
                    mostrarPartidos();
                    break;
                case 0:
                    System.out.println("¡Gracias por usar el sistema!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 0);
    }

    private static void crearTorneo() {
        System.out.print("Ingrese ID del torneo: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre del torneo: ");
        String nombre = sc.nextLine();
        torneo = new Torneo(id, nombre,new Date(), null);
        torneo.crearTorneo();
    }

    private static void registrarEquipo() {
        System.out.print("ID del equipo: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre del equipo: ");
        String nombre = sc.nextLine();
        equipos.add(new Equipo(id, nombre, null));
        System.out.println("Equipo registrado.");
    }

    private static void registrarFutbolista() {
        System.out.print("Nombre del equipo donde inscribir al futbolista: ");
        String nombreEquipo = sc.nextLine();
        for (Equipo equipo : equipos) {
            if (equipo.getNombreEquipo().equalsIgnoreCase(nombreEquipo)) {
                System.out.print("ID Futbolista: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Número: ");
                double numero = sc.nextDouble();
                sc.nextLine();
                System.out.print("Posición: ");
                String posicion = sc.nextLine();
                System.out.print("Edad: ");
                int edad = sc.nextInt();
                sc.nextLine();
                Futbolista futbolista = new Futbolista(id, nombre, numero, posicion, edad);
                equipo.registrarFutbolista(futbolista);
                System.out.println("Futbolista registrado.");
                return;
            }
        }
        System.out.println("Equipo no encontrado.");
    }

    private static void generarPartido() {
        if (equipos.size() < 2) {
            System.out.println("Debe haber al menos 2 equipos para generar un partido.");
            return;
        }
        System.out.println("Equipos disponibles:");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println((i + 1) + ". " + equipos.get(i).getNombreEquipo());
        }
        System.out.print("Seleccione número del equipo local: ");
        int local = sc.nextInt() - 1;
        System.out.print("Seleccione número del equipo visitante: ");
        int visitante = sc.nextInt() - 1;
        if (local == visitante) {
            System.out.println("No puede jugar un equipo contra sí mismo.");
            return;
        }
        Partido partido = new Partido();
        partido.generarSorteo();
        partidos.add(partido);
    }

    private static void asignarResultado() {
        System.out.print("Ingrese ID del partido para asignar resultado: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Partido partido : partidos) {
            if (partido != null && partido.getIdPartido() == id) {
                System.out.print("Resultado (ej: 2-1): ");
                String resultado = sc.nextLine();
                partido.asignarResultado(resultado);
                System.out.println("Resultado asignado.");
                return;
            }
        }
        System.out.println("Partido no encontrado.");
    }

    private static void mostrarPartidos() {
        if (partidos.isEmpty()) {
            System.out.println("No hay partidos registrados.");
        } else {
            for (Partido partido : partidos) {
                partido.mostrarPartido();
            }
        }
    }
}
