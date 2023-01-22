package classes;

/*
 * Clase principal: 
 * CONTIENE EL PUNTO DE ENTRADA A LA APLICACIÓN.
 * Puede llamarse como se quiera.
 * Aunque por convenio se suele llamar:
 * - Main
 * - App
 * - Application
 * - Driver
 */

public class Main {

    /* Este método es el método principal que TODA aplicación Java DEBE tener.
     * Es un método OBLIGATORIO. DEBER SER:
     * - público
     * - estatico
     * - void
     * - parámetro DEBE ser un array de String
     * - su nombre DEBE ser MAIN
     * Si se cumple TODO esto, VA A SER (SIEMPRE). NUESTRO PUNTO DE ENTRADA A LA APLICACIÓN
     * (la aplicación empieza a ejecutarse AQUÍ). Este método main (método principal) o 
     * punto de entrada de mi aplicación ES LLAMADO AUTOMÁTICAMENTE POR LA JVM */
	
	public static void main(String[] args) {

		double[] notas1 = {7.6, 5.5, 9.7, 4.1, 6.6, 5.1, 3.8, 8.6, 9.9, 5.0};
		double[] notas2 = {5.0, 4.5, 6.2, 4.9, 7.2, 8.4, 6.5, 3.8, 9.1, 5.7};
		double[] notas3 = {4.5, 6.8, 6.3, 7.9, 7.1, 3.7, 6.0, 9.0, 8.9, 7.3};
		
		Student student1 = new Student();
		student1.name = "Scarlet";
		student1.age = 25;
		student1.dni = "y8602018d";
		
		student1.matricula();
		student1.asisteAClase();
		student1.preguntaDudas();
		
	}

}
