import java.util.HashMap;

public class Nickname {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("matthew", "matt");
        map.put("michael", "mix");
        map.put("arthur", "artie");

        System.out.println(map.get("matthew"));
    }
}