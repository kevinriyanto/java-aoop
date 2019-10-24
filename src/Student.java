

public class Student extends People implements Runnable{
	private Nim nim;
	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public Nim getNim() {
		return nim;
	}

	public void setNim(Nim nim) {
		this.nim = nim;
	}
	@Override
	public void run() {
		System.out.println("student run");
	}
}
