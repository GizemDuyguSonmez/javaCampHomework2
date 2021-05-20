public class Instructor extends User{
    private String branch;

    public Instructor(){
        super();
        branch = "no define yet";
    }

    public Instructor(String firstName, String lastName, int age, String branch){
        super(firstName,lastName,age);
        setBranch(branch);
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
