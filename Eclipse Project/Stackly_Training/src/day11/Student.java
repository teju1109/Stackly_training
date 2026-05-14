package day11;

	class Student {

	    String name;
	    int age;
	    Student() {
	        name = "Tejesh";
	        age = 22;
	    }
	    Student(String name, int age) {
	        this.name = name;  
	        this.age = age;
	    }
	    void display() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
	}

	public class Main
    {
	    public static void main(String[] args) {
	        Student s1 = new Student();
	        s1.display();
	        Student s2 = new Student("Teju", 21);
	        s2.display();
	    }
	}

