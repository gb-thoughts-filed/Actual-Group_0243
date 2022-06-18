import org.junit.*;
import static org.junit.Assert.*;

public class UserAccountTest {

    @Test(timeout = 50)
    public void testUserAccountConstructor() {
        UserAccount firstUser = new UserAccount("newUser", "123456789", false);
        assertEquals("newUser", firstUser.getUsername());
    }

    @Test(timeout = 50)
    public void testUserChangePassword() {
        UserAccount firstUser = new UserAccount("newUser", "123456789", false);
        String oldPass = firstUser.changePassword("myNewPass123");
        assertEquals("123456789", oldPass);
        assertEquals("myNewPass123", firstUser.getPassword());
    }


}
