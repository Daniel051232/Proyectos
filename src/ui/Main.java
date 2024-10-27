package ui;

import model.Arbitro;
import model.equipo;
import model.TournamentController;
import java.util.Scanner;

public class Main {
    private TournamentController controller;
    private Scanner scanner;

    public Main() {
        controller = new TournamentController();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        int option;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Registrar jugador");
            System.out.println("2. Registrar árbitro");
            System.out.println("3. Registrar equipo");
            System.out.println("4. Consultar equipo");
            System.out.println("5. Consultar fase de grupos");
            System.out.println("6. Asignar árbitro a un equipo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el salto de línea

            switch (option) {
                case 1:
                    registerPlayer();
                    break;
                case 2:
                    registerReferee();
                    break;
                case 3:
                    registerEquipo();
                    break;
                case 4:
                    consultarEquipo();
                    break;
                case 5:
                    consultarFaseGrupos();
                    break;
                case 6:
                    asignarArbitroAEquipo();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (option != 0);
    }

    private void registerPlayer() {
        System.out.print("Número del jugador: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpiar el salto de línea
        System.out.print("Nombre del jugador: ");
        String nombre = scanner.nextLine();
        System.out.print("País de origen: ");
        String paisOrigen = scanner.nextLine();
        System.out.print("Posición: ");
        String posicion = scanner.nextLine();
        System.out.print("Goles: ");
        int goles = scanner.nextInt();
        System.out.print("Asistencias: ");
        int asistencias = scanner.nextInt();
        scanner.nextLine(); 

        controller.addPlayer(numero, nombre, paisOrigen, posicion, goles, asistencias);
    }

    private void registerReferee() {
        System.out.print("ID del árbitro: ");
        String id = scanner.nextLine();
        System.out.print("Nombre del árbitro: ");
        String nombre = scanner.nextLine();
        System.out.print("País de origen: ");
        String paisOrigen = scanner.nextLine();
        System.out.print("Tipo de árbitro (Central/Asistente): ");
        String tipo = scanner.nextLine();

        controller.addReferee(id, nombre, paisOrigen, tipo);
    }

    private void registerEquipo() {
        System.out.print("Nombre del equipo: ");
        String nombre = scanner.nextLine();
        System.out.print("País de origen: ");
        String paisOrigen = scanner.nextLine();

        controller.addEquipo(nombre, paisOrigen);
    }

    private void consultarEquipo() {
        System.out.print("Nombre del equipo a consultar: ");
        String nombreEquipo = scanner.nextLine();
        equipo equipo = controller.consultarEquipo(nombreEquipo);
        if (equipo != null) {
            System.out.println("Equipo encontrado: " + equipo);
        } else {
            System.out.println("Equipo no encontrado.");
        }
    }

    private void consultarFaseGrupos() {
        controller.consultarFaseGrupos();
    }

    private void asignarArbitroAEquipo() {
        System.out.print("Nombre del equipo al que desea asignar un árbitro: ");
        String nombreEquipo = scanner.nextLine();

        System.out.print("ID del árbitro: ");
        String idArbitro = scanner.nextLine();

        for (Arbitro referee : controller.getArbitros()) {
            if (referee.getId().equals(idArbitro)) {
                controller.asignarArbitroAEquipo(nombreEquipo, referee);
                return;
            }
        }
        System.out.println("Árbitro no encontrado.");
    }

    public static void main(String[] args) {
        Main ui = new Main();
        ui.displayMenu();
    }
}
