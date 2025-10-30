package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Oferta> ofertas = new ArrayList<>();
        // Celulares
        ofertas.add(new Celular(1, 15000.0, true, "Samsung", "Galaxy S21", 'N', 128, 8, true));
        ofertas.add(new Celular(2, 45000.0, true, "Apple", "iPhone 12", 'N', 256, 12, true));
        ofertas.add(new Celular(3, 12000.0, true, "Xiaomi", "Redmi Note 12 Pro", 'S', 128, 8, true));
        ofertas.add(new Celular(4, 8000.0, false, "Xiaomi", "Mi 11", 'B', 128, 8, false));
        // Internet
        ofertas.add(new InternetPlano(5, 1500.0, false, "Fibra Básico", 450, false));
        ofertas.add(new InternetPlano(6, 2056.0, false, "Fibra Plus", 600, true));
        ofertas.add(new InternetPlano(7, 3500.0, true, "Fibra DGO", 550, true));
        // Plan móvil
        ofertas.add(new PlanMovil(8, 660.0, false, "40 GB", 40, 900, 200));
        ofertas.add(new PlanMovil(9, 880.0, false, "70 GB", 70, 1000, 500));
        ofertas.add(new PlanMovil(10, 1500.0, true, "Entretenimiento", 250, 1500, 800));

        Scanner sc = new Scanner(System.in);

        System.out.println("===== BIENVENIDO A TELECOM LITE =====\n");
        System.out.println("Lista de ofertas disponibles:\n");

        // Mostrar todas las ofertas
        for (Oferta o : ofertas) {
            System.out.println(o.mostrarInfo());
            System.out.println("---------------------------");
        }

        // Solicitar IDs al usuario
        System.out.print("Ingrese el ID del celular que desea comprar: ");
        int idCelular = sc.nextInt();

        System.out.print("Ingrese el ID del plan móvil que desea contratar: ");
        int idPlanMovil = sc.nextInt();

        System.out.print("Ingrese el ID del plan de internet que desea agregar: ");
        int idInternet = sc.nextInt();

        // Calcular total usando getPrecioFinal()
        double total = 0;
        for (Oferta o : ofertas) {
            if (o.getId() == idCelular || o.getId() == idPlanMovil || o.getId() == idInternet) {
                total += o.getPrecioFinal();
            }
        }

        // Mostrar total antes de confirmar
        System.out.println("\nEl monto total de su selección es: $" + total);

        // Confirmar compra
        System.out.print("¿Desea confirmar la compra? (s/n): ");
        sc.nextLine(); // limpiar buffer
        String confirmar = sc.nextLine();

        // Mostrar resumen final
        System.out.println("\n===== Resumen de compra =====");
        for (Oferta o : ofertas) {
            if (o.getId() == idCelular || o.getId() == idPlanMovil || o.getId() == idInternet) {
                String promoText = o.getAplicaPromo() ? " (descuento aplicado 20%)" : "";
                System.out.println("ID: " + o.getId() +
                        " | Precio base: $" + o.getPrice() +
                        promoText +
                        " | Precio final: $" + o.getPrecioFinal());
            }
        }

        // Mensaje final
        if (confirmar.equalsIgnoreCase("s")) {
            System.out.println("\n Compra aceptada. Total a pagar: $" + total + "\n¡Gracias por su compra!");
        } else {
            System.out.println("\n Gracias por su visita.");
        }

        sc.close();
    }
}
