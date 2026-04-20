package main.java;

import exceptions.datosInvalidosException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        Agenda agenda = new Agenda();
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ AGENDA ---");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Modificar contacto");
            System.out.println("6. Ver espacios libres");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");

            try {
                int opcion = Integer.parseInt(sn.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Nombre: ");
                        String nom = sn.nextLine();
                        datosInvalidosException.validarNombre(nom);
                        System.out.print("Apellido: ");
                        String ape = sn.nextLine();
                        datosInvalidosException.validarApellido(ape);
                        System.out.print("Teléfono: ");
                        String tel = sn.nextLine();
                        datosInvalidosException.validarTelefono(tel);
                        agenda.añadirContacto(new Contacto(nom, ape, tel));
                        break;
                    case 2:
                        agenda.listarContactos();
                        break;
                    case 3:
                        System.out.print("Nombre: ");
                        String bNom = sn.nextLine();
                        System.out.print("Apellido: ");
                        String bApe = sn.nextLine();
                        agenda.buscaContacto(bNom, bApe);
                        break;
                    case 4:
                        System.out.print("Nombre a eliminar: ");
                        String eNom = sn.nextLine();
                        System.out.print("Apellido a eliminar: ");
                        String eApe = sn.nextLine();
                        agenda.eliminarContacto(eNom, eApe);
                        break;
                    case 5:
                        System.out.print("Nombre del contacto a modificar: ");
                        String mNom = sn.nextLine();
                        if (!agenda.existeNombre(mNom)) {
                            System.out.println("Contacto no encontrado.");
                            break;
                        }
                        System.out.print("Apellido del contacto a modificar: ");
                        String mApe = sn.nextLine();
                        System.out.print("Nuevo teléfono: ");
                        String mTel = sn.nextLine();
                        agenda.modificarTelefono(mNom, mApe, mTel);
                        break;

                    case 6:
                        System.out.println("Espacios disponibles: " + agenda.espaciosLibres());
                        break;

                    case 7:
                        salir = true;
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número válido.");
            } catch (datosInvalidosException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}