import org.junit.*;

import java.util.Objects;

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

    @Test(timeout = 50)
    public void testLogIn() {
        AccountSystem newSystem = new AccountSystem();
        CreateUserAccount newUser = new CreateUserAccount("John", "123456789", false);
        assertNotEquals(newSystem.logIn("John", "123456789"), newUser);
    }

    @Test(timeout = 50)
    public void testCheckUsername() {
        AccountSystem newSystem = new AccountSystem();
        newSystem.createUser("John", "123456789", false);
        assertFalse(newSystem.checkUsername("Jack"));
    }

    @Test(timeout = 50)
    public void testCheckPassword() {
        AccountSystem newSystem = new AccountSystem();
        newSystem.createUser("John", "123456789", false);
        assertFalse(newSystem.checkPassword("John", "987654321"));
    }

}
