import org.javalite.activejdbc.*;
import org.javalite.activejdbc.annotations.DbName;
import org.javalite.activejdbc.annotations.Table;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Table("users")
public class User extends Model{

    public String getEmail(){
        return getString("email");
    }
}
