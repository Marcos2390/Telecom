package principal;

import java.util.ArrayList;

//import javax.crypto.spec.OAEPParameterSpec;




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

		int contador = 1;
		for (Oferta Oferta : Ofertas) {
			System.out.println("Oferta #" + contador++);
            System.out.println(Oferta.mostrarInfo());
            System.out.println("---------------------------");
        }

	
		
		//Implementar los requerimientos del enunciado
		//Utilizar estructuras de control y repetitivas según correspondOR
		}
}

