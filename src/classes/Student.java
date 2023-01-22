package classes;

//nombre cualificado de la clase Student:
//nombre del package punto nombre de la clase: classes.Students

public class Student {

	String name;
	int age;
	String dni;
	double[] grade;
	
	//METODOS (funciones)
	void matricula() {
		System.out.printf("El estudiante " + name +	" se matricula");
		System.out.println();
	}
	
	void asisteAClase() {
		System.out.printf("El estudiante " + name + " asiste a la clase");
		System.out.println();
	}
	
	void preguntaDudas() {
		System.out.printf("El estudiante " + name + " pregunta dudas");
	}
	
}
