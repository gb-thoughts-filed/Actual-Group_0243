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
        assertTrue(isValidPasswordLength(userName));
    }

    @Test(timeout = 50)
    public void testisValidPasswordChar() {
        String password = "12@45!";
        assertFalse(isValidPasswordChar(password));
    }

    @Test(timeout = 50)
    public void testisValidPasswordChar2() {
        String password = "q1w2e3";
        assertTrue(isValidPasswordChar(password));
    }
}
