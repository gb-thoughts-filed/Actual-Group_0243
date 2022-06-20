import org.junit.*;
import static org.junit.Assert.*;

public class ValidateCredentialsTest extends ValidateCredentials{
    @Test(timeout = 50)
    public void testisValidPasswordLength() {
        String password = "1234567891234";
        assertFalse(isValidPasswordLength(password));
    }

    @Test(timeout = 50)
    public void testisValidUserNameLength() {
        String userName = "kiddie";
        assertTrue(isValidUsernameLength(userName));
    }

    @Test(timeout = 50)
    public void testisValidPasswordCharInvalid() {
        String password = "12@45!";
        assertFalse(isValidPasswordChar(password));
    }

    @Test(timeout = 50)
    public void testisValidPasswordChar() {
        String password = "q1w2e3";
        assertTrue(isValidPasswordChar(password));
    }

    @Test(timeout = 50)
    public void testIsValidUsernameCharInvalid() {
        String username = "1@newme";
        assertFalse(isValidUsernameChar(username));
    }

    @Test(timeout = 50)
    public void testIsValidUsernameChar() {
        String username = "4Mary5";
        assertTrue(isValidUsernameChar(username));
    }
}
