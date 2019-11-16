import java.util.HashSet;

public class Test {
	public static void main(String[] args) {
		Person person1 = new Person("zs",19);
		Person person2 = new Person("zs",20);
		HashSet<Person> set = new HashSet<Person>();
		set.add(person1);
		set.add(person2);
		System.out.println("before:  "+set);
		person2.setAge(19);
		System.out.println("after:  "+set);
		person2.setAge(21);
		set.remove(person2);
		System.out.println("remove:  "+set);
		
	}
}


class Person{
	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {
		if(obj != null){
			if(obj instanceof Person) {
				Person p = (Person) obj;
				return this.name.equals(p.getName()) &&  this.age == p.getAge(); 
			}
		}
		return false;
	}
	
	public int hashCode() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
