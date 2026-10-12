
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {

        HashMap<String, String> names = new HashMap<>();

        names.put("matthew", "matt");
        names.put("micheal", "mix");
        names.put("arthur", "artie");

        String nickname = names.get("matthew");
        System.out.println(nickname);
        // Do the operations required here!
    }

}
