import org.junit.*;
import static org.junit.Assert.*;

public class ValidateCredentialsTest extends ValidateCredentials{
    @Test(timeout = 50)
    public void testisValidPasswordLength() {
        String password = "1234567891234";
        assertFalse(isValidPasswordLength(password));
    }
}
