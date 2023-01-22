package classes;

public class Grades {

	public double[] grades; //por defecto null
	
	public int idColegio; //por defecto 0
	
	
	//METODOS (funciones)	
	static void notaMaxima(double[] cualificaciones) { // Defino la funcion PERO no la estoy usando 
    	double max = cualificaciones[0];
        for(int index = 1; index < cualificaciones.length; index++)
            if(cualificaciones[index] > max)
                max = cualificaciones[index];
        System.out.println("Nota máxima de esta Aula: " + max);
    }

    static void notaMinima(double[] cualificaciones) { //Defino la funcion PERO no la estoy usando
        double min = cualificaciones[0];
        for(int index = 1; index < cualificaciones.length; index++)
            if(cualificaciones[index] < min)
                min = cualificaciones[index];
        System.out.println("Nota mínima de esta Aula: " + min);
    }    
    
	static void printMaxMin(double[] notas, int aula) {
		System.out.printf("Aula %d: ------ %n", aula);
		notaMaxima(notas);
		notaMinima(notas);
		System.out.println("");
	}   
}
