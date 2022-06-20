import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class AdminManagerTest {

    @Test(timeout = 50)
    public void testPromoteAdminUser() {
        AccountSystem system = new AccountSystem();
        system.createUser("Jane23", "123456789", false);
        AdminManager manager = new AdminManager();
        manager.promoteAdminUser("Jane23");
        UserAccount user = system.logIn("Jane23", "123456789");
        assertTrue(user.getStatus());
    }

    @Test(timeout = 50)
    public void testCreateNewAdmin() {
        AdminManager manager = new AdminManager();
        AccountSystem system = new AccountSystem();
        manager.createNewAdmin("Mary123", "123456789");
        UserAccount user = system.logIn("Mary123", "123456789");
        assertTrue(user.getStatus());
    }

    @Test(timeout = 100)
    public void testDeleteUserValidUsername() {
        AdminManager manager = new AdminManager();
        AccountSystem system = new AccountSystem();
        system.createUser("John12", "123456789", false);
        assertNotNull(system.logIn("John12", "123456789"));
        manager.deleteUser("John12");
        assertNull(system.logIn("John12", "123456789"));
    }

    @Test(timeout = 50)
    public void testTemporaryBan() {
        AdminManager manager = new AdminManager();
        AccountSystem system = new AccountSystem();
        system.createUser("John12", "123456789", false);
        assertNotNull(system.logIn("John12", "123456789"));
        manager.temporaryBan("John12", LocalDateTime.of(2022, 8, 19, 17,
                15));
        assertNull(system.logIn("John12", "123456789"));
    }

    @Test(timeout = 50)
    public void testUnbanAccount() {
        AdminManager manager = new AdminManager();
        AccountSystem system = new AccountSystem();
        assertNotNull(system.logIn("Jane23", "123456789"));
        manager.temporaryBan("Jane23", LocalDateTime.of(2022, 6, 19, 20,
                0, 0));
        assertNull(system.logIn("Jane23", "123456789"));
        manager.unbanAccount("Jane23", LocalDateTime.of(2022, 6, 19, 20,
                0, 0));
        assertNotNull(system.logIn("Jane23", "123456789"));
    }

    @Test(timeout = 50)
    public void testUnbanAccountBeforeBanLength() {
        AdminManager manager = new AdminManager();
        AccountSystem system = new AccountSystem();
        manager.unbanAccount("John12",LocalDateTime.of(2022, 8, 19, 17,
                15));
        assertNull(system.logIn("John12", "123456789"));

    }



}
