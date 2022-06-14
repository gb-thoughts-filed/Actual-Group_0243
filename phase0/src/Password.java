public interface Password {

    void setPassword(String password);

    void changePassword(String newPassword);

    boolean isValidPassword(String password);
}
