import org.junit.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

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

    @Test(timeout = 50)
    public void testLoginHistory() {
        UserAccount user = new UserAccount("Mary17", "123456789", false);
        user.loginHistory(LocalDateTime.of(2021, 8, 29, 12, 7, 30));
        user.loginHistory(LocalDateTime.now());
        assertEquals(2, user.getLoginHistory().size());
    }

    @Test(timeout = 50)
    public void testGetPassword() {
        UserAccount firstUser = new UserAccount("newUser", "123456789", false);
        assertEquals("123456789", firstUser.getPassword());
    }

    @Test(timeout = 50)
    public void testGetStatus() {
        UserAccount firstUser = new UserAccount("newUser", "123456789", false);
        assertFalse(firstUser.getStatus());
    }

    @Test(timeout = 50)
    public void testGetUsername() {
        UserAccount firstUser = new UserAccount("newUser", "123456789", false);
        assertEquals("newUser", firstUser.getUsername());
    }
}
