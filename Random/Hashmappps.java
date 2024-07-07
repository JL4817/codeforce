package Random;

import java.util.HashMap;

public class Hashmappps {

    public static void main(String[] args) {

        HashMap<String, Integer> hash = new HashMap<String, Integer>(); // first is the key, second is the actual data
                                                                        // type
        hash.put("a", 69);
        hash.put("b", 420);
        hash.put("c", 7);

        hash.size(); // returns 3

        System.out.println(hash); // {a=69, b=420, c=7}

        hash.get("c"); // 7

        hash.remove("b");

        System.out.println(hash); // {a=69, c=7}

        hash.containsValue(69); // returns true if value contains, otherwise false
        hash.containsKey("c"); // returns true if key "c" contains, otherwise false

        hash.replace("c", 8);
        System.out.println(hash); // c is now 8, not 7

    }

}
