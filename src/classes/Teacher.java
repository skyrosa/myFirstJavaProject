package classes;

public class Teacher {

	String name;
	String id;
	String speciality;
	
	void imparteAsignatura() {
		System.out.printf("El profesor %s imparte la asignatura %n", name);
	}
	
	void preparaRecursos() {
		System.out.printf("El profesor %s prepara los recursos %n", name);
	}
	
}
