public class Login {

    public Login(){
    }

    public void newOrReturning(){
        System.out.println("Are you a new user?");
        //if yes call User to creat new user
    }

    public void usernameStandards(){
        System.out.println("Username must be between 6-10 characters long.");
    }

    public void invalidUsername(){
        System.out.println("Username is invalid");
    }

    public void passwordStandards(){
        System.out.println("Password must be between 8-15 characters long.");
    }

    public void invalidPassword(){
        System.out.println("Password is invalid");
    }


}
