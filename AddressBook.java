package com.mycompany.addressbook;

import java.io.*;
import java.util.*;

public class AddressBook {
    private Map<String, String> contacts;
    private String filename;
    
    
     public AddressBook(String filename) {
        this.filename = filename;
        this.contacts = new HashMap<>();
    }
     // Cargar contactos desde archivo CSV
    public void load() {
        contacts.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",", 2); // separa número y nombre
                if (parts.length == 2) {
                    contacts.put(parts[0].trim(), parts[1].trim());
                }
            }
        } catch (IOException e) {
            System.out.println("No se pudo cargar el archivo. Se crear uno nuevo al guardar.");
        }
    }

    // Guardar contactos en archivo CSV
    public void save() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                bw.write(entry.getKey() + "," + entry.getValue());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar los contactos: " + e.getMessage());
        }
    }

    // Mostrar contactos
    public void list() {
        if (contacts.isEmpty()) {
            System.out.println("La agenda esta vacía.");
        } else {
            System.out.println("Contactos:");
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    // Crear un nuevo contacto
    public void create(String number, String name) {
        if (contacts.containsKey(number)) {
            System.out.println("Ya existe un contacto con ese número.");
        } else {
            contacts.put(number, name);
            System.out.println("Contacto agregado.");
        }
    }

    // Borrar un contacto
    public void delete(String number) {
        if (contacts.remove(number) != null) {
            System.out.println("Contacto eliminado.");
        } else {
            System.out.println("No existe un contacto con ese número.");
        }
    } 
    
    
}
