package main.java;

import java.util.*;

public class Agenda {
    private Map<String, Contacto> contactos;
    private int capacidad;

    public Agenda() {
        this.capacidad = 10;
        this.contactos = new HashMap<>();
    }

    public Agenda(int capacidad) {
        this.capacidad = capacidad;
        this.contactos = new HashMap<>();
    }

    private String generarKey(String nom, String ape) {
        return (nom.trim() + "|" + ape.trim()).toLowerCase();
    }

    public void añadirContacto(Contacto c) {
        if (contactos.size() >= capacidad) {
            System.out.println("Agenda llena.");
            return;
        }
        if (c.getNombre().isEmpty() || c.getApellido().isEmpty()) {
            System.out.println("Nombre y apellido son obligatorios.");
            return;
        }
        String key = generarKey(c.getNombre(), c.getApellido());
        if (contactos.containsKey(key)) {
            System.out.println("El contacto ya existe.");
        } else {
            contactos.put(key, c);
            System.out.println("Añadido con éxito.");
        }
    }

    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
            return;
        }
        contactos.values().stream()
                .sorted(Comparator.comparing(Contacto::getNombre).thenComparing(Contacto::getApellido))
                .forEach(System.out::println);
    }

    public void buscaContacto(String nombre, String apellido) {
        String key = generarKey(nombre, apellido);
        Contacto c = contactos.get(key);
        if (c != null) {
            System.out.println("Teléfono: " + c.getTelefono());
        } else {
            System.out.println("No encontrado.");
        }
    }

    public void eliminarContacto(String nombre, String apellido) {
        String key = generarKey(nombre, apellido);
        if (contactos.remove(key) != null) {
            System.out.println("Contacto eliminado.");
        } else {
            System.out.println("No existe.");
        }
    }

    public void modificarTelefono(String nombre, String apellido, String nuevoTelefono) {
        String key = generarKey(nombre, apellido);
        System.out.println("Buscando key: [" + key + "]");
        System.out.println("Keys en agenda: " + contactos.keySet());
        Contacto c = contactos.get(key);
        if (c != null) {
            c.setTelefono(nuevoTelefono);
            System.out.println("Teléfono actualizado correctamente.");
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    public int espaciosLibres() {
        return capacidad - contactos.size();
    }
}