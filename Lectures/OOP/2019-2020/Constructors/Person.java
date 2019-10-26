package main;
// October 15th 2019
// edu@rawand.dev

public class Person {
    String firstName;
    String lastName;
    int age;

    Person(String fName, String lName, int age){
        firstName = fName;
        this.lastName = lName;
        this.age = age;
    }

    public void show(){
        System.out.println(firstName +" "+ lastName +" " + age);
    }

    public static void main(String args[]){
        Person john = new Person("John", "Brown", 40);
        john.show();
    }
}
