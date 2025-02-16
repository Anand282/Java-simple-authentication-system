import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private String rollNumber;

    // Constructor
    public Student(String name, int age, String rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Getters and Setters
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

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student [Name: " + name + ", Age: " + age + ", Roll Number: " + rollNumber + "]";
    }
}
