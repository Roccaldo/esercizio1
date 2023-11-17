public class Studenti {
	public String name;
	public String surname;
	public int id;

	public Studenti(String name, String surname, int id){
		this.name = name;
		this.surname = surname;
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public String getSurname(){
		return surname;
	}
	public int getId(){
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Studenti{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", id=" + id +
				'}';
	}
}

