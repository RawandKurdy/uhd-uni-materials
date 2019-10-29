public class Student extends Person {
    String college;

    Student(String name, String gender, int age, String college) {
        super(name, gender, age);
        this.college = college;
    }

    public void printColl() {
        System.out.println(this.college);
    }

    public static void main(String[] args) {
        Student akar = new Student("Akar", "Male", 19, "IT");
        akar.printName();
        akar.printColl();
    }
}

class Person {
    String name;
    int age;
    String gender;

    Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void printName() {
        System.out.println(this.name);
    }
}