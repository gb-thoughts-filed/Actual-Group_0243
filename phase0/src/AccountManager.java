import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class AccountManager extends Login implements Map{
    public Map allUsers;

    public AccountManager(){
        super();
    }

    public boolean inSystemUsername(User obj){
        if (allUsers.containsKey(obj.username)){
            return true;
        }
        return false;
    }

    public boolean inSystemPassword(User obj){
        if (allUsers.containsKey(obj.password)){
            return true;
        }
        return false;
    }

    //should take in user input from Login
    public void creatUsername(String username){
        Login p = null;
        p.usernameStandards();
        User obj = null;
        obj.setUsername(username);
        if (inSystemUsername(obj)){
            p.invalidUsername();
        }
    }

    public void creatPassowrd(String password){
        Login p = null;
        p.passwordStandards();
        User obj = null;
        obj.setPassword(password);
        if (inSystemUsername(obj)){
            p.invalidPassword();
        }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
