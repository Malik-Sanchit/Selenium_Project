package Assignment2;

public class Person {
	   private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return this.name;
	    }

	    public int getAge() {
	        return this.age;
	    }
}

class Teacher extends Person {
    String degree;

    public String getDegree() {
        return this.degree;
    }

    public String toString() {
        return getName() + " " + getAge() + " " + getDegree();
    }

    public Teacher(String name, int age, String theDegree) {
        super(name, age); // Call Person constructor to set name and age
        this.degree = theDegree;
    }
}
