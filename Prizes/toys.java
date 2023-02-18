
package Prizes;
import java.util.ArrayList;

public class toys {
    
    Integer id;
    String toyName;
    Integer value;

    public toys(Integer id, String toyName, Integer value ){
        this.id = id;
        this.toyName = toyName;
        this.value = value;
      
    }

    @Override
public String toString() {
    // TODO Auto-generated method stub
    return String.format("%d, %s, %d", id, toyName, value);
}
}
