public class Student extends People implements Eatable{
	private Nim nim;
	public Student(String name, int age,Nim nim) {
		super();
		this.name = name;
		this.age = age;
		this.nim = nim;
	}
	public Nim getNim() {
		return nim;
	}
	public void setNim(Nim nim) {
		this.nim = nim;
	}
	@Override
	public void eat() {
		System.out.println("student eat");
	}
}
