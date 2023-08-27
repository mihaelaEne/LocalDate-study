package mycode.user.model;

public class UserFactory implements IUserFactory {


    @Override
    public User generateUser(String text) {
        switch (text.split(",")[0]){
            case  "client":
                return  new Client(text);
            case "doctor":
                return new Doctor(text);
            default:
                return null;

        }
    }
}
