public class LoginState {
    private final AccountSystem system;
    private final ValidateCredentials cred;
    private boolean running;

    public LoginState() {
        this.system = new AccountSystem();
        this.cred = new ValidateCredentials();
        this.running = true;
    }

    public boolean isRunning() {
        return running;
    }

    public void stopRunning() {
        running = false;
    }

    public AccountSystem getAccountSystem() {
        return system;
    }

    public ValidateCredentials getValidateCredentials() {
        return cred;
    }
}
