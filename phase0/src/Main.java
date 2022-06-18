public class Main {
    public static void main(String[] args) {
        CreateUserAccount obj = new CreateUserAccount("hehee", "hahahaha", true);
        AccountSystem system = new AccountSystem();
        UserAccount users = system.addToSystem(obj);
        System.out.println(system.allUsers.isEmpty());
        System.out.println(obj.allCreatedUsers.isEmpty());
        System.out.println(users.toString());
    }
}
