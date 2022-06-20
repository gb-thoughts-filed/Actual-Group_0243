import org.junit.*;
import static org.junit.Assert.*;
public class CreateUserAccountTest {
    @Test(timeout = 50)
    public void testCreatePassword() {
        CreateUserAccount newUser = new CreateUserAccount("John", "123456789", false);
        assertTrue(newUser.createPassword("myNewPass23"));
        assertEquals("myNewPass23", newUser.getNewPassword());
    }

    @Test(timeout = 50)
    public void testUniqueUsernameWithNotUniqueInput() {
        CreateUserAccount firstUser = new CreateUserAccount("Mary123", "251207M12",
                false);
        firstUser.createUserAccount();
        assertFalse(firstUser.uniqueUsername("Mary123"));
    }

    @Test(timeout = 50)
    public void testUniqueUsernameWithUniqueInput() {
        CreateUserAccount firstUser = new CreateUserAccount("Mary123", "251207M12",
                false);
        firstUser.createUserAccount();
        assertTrue(firstUser.uniqueUsername("Jake01"));
    }

    @Test(timeout = 50)
    public void testCreateUserAccountMethodValidInput() {
        CreateUserAccount firstUser = new CreateUserAccount("Jane24", "251207M12",
                false);
        UserAccount newUser = firstUser.createUserAccount();
        assertNotNull(newUser);
        assertEquals("Jane24", newUser.getUsername());
        assertEquals("251207M12", newUser.getPassword());
    }

    @Test(timeout = 50)
    public void testCreateUserAccountMethodInvalidInput() {
        CreateUserAccount firstUser = new CreateUserAccount("Mary123", "251207M12",
                false);
        firstUser.createUserAccount();
        CreateUserAccount secondUser = new CreateUserAccount("Mary123", "251207M12",
                false);
        assertNull(secondUser.createUserAccount());
    }
}
