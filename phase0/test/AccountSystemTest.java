import org.junit.*;
import static org.junit.Assert.*;

public class AccountSystemTest {

    @Test(timeout = 50)
    public void testCreateUser() {
        CreateUserAccount newUser = new CreateUserAccount("John", "123456789", false);
        UserAccount user = newUser.createUserAccount();
        if (user != null) {
            assertTrue(AccountSystem.allUsers.contains(user));
        }
    }

}
