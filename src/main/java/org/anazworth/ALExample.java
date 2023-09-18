package org.anazworth;

import java.util.ArrayList;
import java.util.Random;

public class ALExample {

    public static void ALExampleRemoveLastValue() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (list.size() < 2_000_000) {
            list.add(new Random().nextInt());
        }

        // Remove last element until empty
        while (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
    }

    public static void ALExampleRemoveRandomValue() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (list.size() < 2_000_000) {
            list.add(new Random().nextInt());
        }

        // Remove last element until empty
        while (!list.isEmpty()) {
            list.remove(new Random().nextInt(list.size()));
        }
    }
}
