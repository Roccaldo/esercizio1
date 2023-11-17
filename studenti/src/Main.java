public class Main {
	public static void main (String[] args){
		Studenti firstStudent = new Studenti("pino", "Giallo", 789567);

		System.out.println(firstStudent.getName());
		System.out.println(firstStudent.getSurname());
		System.out.println(firstStudent.getId());
	}

}