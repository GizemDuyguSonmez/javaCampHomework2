public class InstructorManager extends UserManager {

    public void start(Instructor instructor){
        System.out.println(instructor.getFirstName() + " "+ instructor.getLastName() + " adli egitmen " + instructor.getBranch() + " bransinda egitim vermeye basladi.");
    }

    public void stop(Instructor instructor){
        System.out.println(instructor.getFirstName() +" "+ instructor.getLastName() +" adli egitmenin " + instructor.getBranch() +" bransinda verdigi egitim sona erdi.");
    }
}
