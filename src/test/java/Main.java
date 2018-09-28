import org.javalite.activejdbc.Base;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Main {

    @BeforeClass
    public void connectToDB() {
        Base.open("org.postgresql.Driver", "jdbc:postgresql://10.10.8.124:6432/store", "postgres", "postgres");
    }

    @AfterClass
    public void closeConnectToDB(){

    }

    @Test
    public void getUser() {


//        List<User> users = User.where("id = ?", "949683");
//        System.out.println(users);

        User a = User.findFirst("id = ?", 949683);
        System.out.println(a);
    }

    @Test
    public void testqwe() {

        User a = User.findById(949683);

        String email = a.get("email").toString();

        System.out.println(email);
    }

    @Test
    public void getUserEmail() {
        User a = User.findById(949683);

        String email = a.getEmail();

        System.out.println(email);
    }
}
