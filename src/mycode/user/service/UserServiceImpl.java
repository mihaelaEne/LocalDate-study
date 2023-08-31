    package mycode.user.service;

    import mycode.user.model.IUserFactory;
    import mycode.user.model.User;
    import mycode.user.model.UserFactory;

    import java.io.File;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    public class UserServiceImpl implements UserService {

        private List<User> users;
        private IUserFactory userFactory;

        public UserServiceImpl(){
            this.users=new ArrayList<>();
            this.userFactory= new UserFactory();
            this.load();
        }

        public UserServiceImpl(ArrayList<User> users){
            this.users=users;
        }

        public void load(){

            try {
                File file = new File("C:\\mycode\\OOP\\Programari\\src\\mycode\\user\\repository\\client.txt");
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    this.users.add(this.userFactory.generateUser(scanner.nextLine()));
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }

        public void afisareUser() {
            for (User user : users) {
                System.out.println(user.toString());
                System.out.println("\n");
            }
        }


        @Override
        public void add(User user) {
            this.users.add(user);
        }


        @Override
        public void remove(User user) {
            this.users.remove(user);

        }

        @Override
        public User findById(int id) {
            for(int i=0; i< users.size(); i++){
                if(users.get(i).getId()==id){
                    return users.get(i);
                }
            }
            return null;
        }

        @Override
        public List<User> getAllUsers() {
            return this.users;
        }

        public UserService findUserById(int id){
            for(int i=0; i<users.size();i++){
                if(users.get(i).getId()==id){
                    return (UserService) users.get(i);
                }
            }
            return null;
        }

    }
