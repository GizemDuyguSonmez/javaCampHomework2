
public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("AAA", "BBB", 19,11111,"Kimya");
        Student student2 = new Student("CCC", "DDD", 20,22222,"Matematik" );

        Instructor instructor1 = new Instructor("EEE", "FFF", 40, "Matematik");
        Instructor instructor2 = new Instructor("GGG", "HHH", 45,"Fizik");

        StudentManager studentManager1 =  new StudentManager();
        studentManager1.attend(student1);
        studentManager1.leave(student1);

        System.out.println();

        StudentManager studentManager2 = new StudentManager();
        studentManager2.attend(student2);
        studentManager2.leave(student2);

        System.out.println();

        InstructorManager instructorManager1 = new InstructorManager();
        instructorManager1.start(instructor1);
        instructorManager1.stop(instructor1);
        instructorManager1.add(instructor2);  // kalitim yoluyla userManager sinifindaki method kullanabildi.
        instructorManager1.add(student1);
        instructorManager1.delete(instructor2);
        instructorManager1.delete(student2);

        System.out.println();

        UserManager userManager1 = new UserManager();
        userManager1.add(student1);
        userManager1.add(instructor1);
        userManager1.delete(student2);
        userManager1.delete(instructor2);

    }
}
