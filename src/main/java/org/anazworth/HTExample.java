package org.anazworth;

import java.util.Hashtable;
import java.util.Random;

public class HTExample {

    public static void HTExampleRemoveLastValue() {
        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();

        while (table.size() < 2_000_000) {
            Integer key = new Random().nextInt();
            table.put(table.size(), key);
        }

        // Remove last element until empty
        while (!table.isEmpty()) {
            table.remove(table.size() - 1);
        }
    }

    public static void HTExampleRemoveRandomValue() {
        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();

        while (table.size() < 2_000_000) {
            Integer key = new Random().nextInt();
            table.put(table.size(), key);
        }

        // Remove last element until empty
        while (!table.isEmpty()) {
            table.remove(new Random().nextInt(table.size()));
        }
    }
}
