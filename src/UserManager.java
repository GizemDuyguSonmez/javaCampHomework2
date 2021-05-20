public class UserManager {

    public void add(User user)
    {
        System.out.println(user.getFirstName() + " "+ user.getLastName() + " adli kullanici sisteme kayit oldu. ");
    }

    public void delete(User user){
        System.out.println(user.getFirstName() + " "+ user.getLastName() + " adli kullanici sistemden silindi.");
    }

}
