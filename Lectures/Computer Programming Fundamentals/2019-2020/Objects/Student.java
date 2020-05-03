
public class Student {
    String group;


    public void setGroup(String g) {
        group = g;
    }

    public String getGroup() {
        return group;
    }

    public static void info() {
        System.out.println("The Class Name is Student");
    }

    public String getGroupWithMSG(){
        String g = getGroup();

        return "Student Group is " + g;
    }

    public static void main(String args[]) {

        Student john = new Student();
        john.setGroup("B");
        System.out.println(john.getGroup());
        System.out.println(john.getGroupWithMSG());

        Student.info();
    }


}