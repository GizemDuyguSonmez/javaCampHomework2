public class Student extends User{
    private int schoolNo;
    private String courseName;

    public Student(){
        super();
        schoolNo = 0;
        courseName = "no name yet";
    }

    public Student(String firstName, String lastName, int age, int schoolNo, String courseName){
        super(firstName,lastName,age);
        setSchoolNo(schoolNo);
        setCourseName(courseName);
    }

    public int getSchoolNo() {
        return schoolNo;
    }

    public void setSchoolNo(int schoolNo) {
        this.schoolNo = schoolNo;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
