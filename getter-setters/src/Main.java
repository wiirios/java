import school.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 8);
        System.out.println(student1.getName());
        student1.setName("Sargent");
        System.out.println(student1.getName());

        Student student2 = new Student();
        student2.setName("Pablo");
        System.out.println(student2.getName());
    }
}