package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Oferta> Ofertas = new ArrayList<>();
        Ofertas.add(new Celular(1, 15000.0, true, "Samsung", "Galaxy S21", 'N', 128, 8, true));
        Ofertas.add(new Celular(2, 45000.0, true, "Apple", "iPhone 12", 'N', 256, 12, true));
        Ofertas.add(new Celular(3, 12000.0, true, "Xiaomi", "Redmi Note 12 Pro", 'S', 128, 8, true));
        Ofertas.add(new Celular(4, 8000.0, false, "Xiaomi", "Mi 11", 'B', 128, 8, false));
        Ofertas.add(new InternetPlano(5, 1500.0, false, "Fibra basico", 450, false));
        Ofertas.add(new InternetPlano(6, 2056.0, false, "Fibra Plus", 600, true));
        Ofertas.add(new InternetPlano(7, 3500.0, true, "Fibra DGO", 550, true));
        Ofertas.add(new PlanMovil(8, 660.0, false, "40 GB", 40, 900, 200));
        Ofertas.add(new PlanMovil(9, 880.0, false, "70 GB", 70, 1000, 500));
        Ofertas.add(new PlanMovil(10, 1500.0, true, "Entretenimiento", 250, 1500, 800));

        Scanner sc = new Scanner(System.in);

        System.out.println("BIENVENIDO A TELECOM!!");
        System.out.println("1 - Lista de ofertas");
        System.out.println("2 - Salir");
        sc.nextLine();
        
        

		for (Oferta o : Ofertas) {
            System.out.println(o.mostrarInfo());
            System.out.println("---------------------------");
        }

        // ID celular
        System.out.print("Ingrese el ID del celular que desea comprar: ");
        int idCelular = sc.nextInt();

        // ID plan movil
        System.out.print("Ingrese el ID del plan móvil que desea contratar: ");
        int idPlanMovil = sc.nextInt();

        // ID plan internet
        System.out.print("Ingrese el ID del plan de internet que desea agregar: ");
        int idInternet = sc.nextInt();

        double total = 0;

        // precios
		
        for (Oferta o : Ofertas) { // total: guarda la suma de los precios de los tres productos.

            if (o.getId() == idCelular || o.getId() == idPlanMovil || o.getId() == idInternet) {
				
				/*  celularEncontrado, planMovilEncontrado, internetEncontrado:
				sirven para saber si el usuario ingresó correctamente cada ID (celular, plan móvil e internet).*/
                
				total += o.getPrice();
            }
        }

        // TOTAL
        System.out.println("\nEl monto total de su selección es: $" + total);

        // Confirmar compra

        System.out.print("¿Desea confirmar la compra? (s/n): ");
        sc.nextLine();
        String confirmar = sc.nextLine();

        if (confirmar.equalsIgnoreCase("s")) {
            System.out.println(" Compra aceptada. Total: $" + total);
        } else {
            System.out.println("Gracias por su visita.");
        }

        sc.close();
    }
}

