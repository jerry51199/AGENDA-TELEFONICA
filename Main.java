
package com.mycompany.addressbook;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook agenda = new AddressBook("contacts.csv");

        agenda.load(); // cargar contactos al inicio

        int option;
        do {
            System.out.println("\n===== Menu Agenda Telefonica =====");
            System.out.println("1. Listar contactos");
            System.out.println("2. Crear contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Guardar y salir");
            System.out.print("Elige una opcion: ");
            option = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (option) {
                case 1:
                    agenda.list();
                    break;
                case 2:
                    System.out.print("Numero: ");
                    String num = sc.nextLine();
                    System.out.print("Nombre: ");
                    String name = sc.nextLine();
                    agenda.create(num, name);
                    break;
                case 3:
                    System.out.print("Numero a eliminar: ");
                    String delNum = sc.nextLine();
                    agenda.delete(delNum);
                    break;
                case 4:
                    agenda.save();
                    System.out.println("Contactos guardados. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (option != 4);

        sc.close();
    }
    
}
