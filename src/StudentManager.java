public class StudentManager extends UserManager{

    public void attend(Student student){
        System.out.println(student.getFirstName() +" "+ student.getLastName() + " adli ogrenci " + student.getCourseName() + " kursuna katildi." );
    }

    public void leave(Student student){
        System.out.println(student.getFirstName() +" " + student.getLastName() + " adli ogrenci "+ student.getCourseName() + " kursundan ayrildi.");
    }
}
