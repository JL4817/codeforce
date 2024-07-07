package Random;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HESHbrown {

    public static void main(String[] args) {

        HashSet<String> name = new HashSet<String>();

        name.add("John"); // adds John
        name.add("Fred");
        name.add("Lila");

        // To get values from HashSet

        java.util.Iterator<String> it = name.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
