package assisted_project;

 class Demo{
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}

public class Encaps {
public static void main(String[] args) {
	Demo d=new Demo();
	d.setId(1);
	d.setName("Akil");
	d.setAge(21);
	System.out.println(d);
}
}
