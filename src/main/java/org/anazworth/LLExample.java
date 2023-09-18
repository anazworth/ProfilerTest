package org.anazworth;

import java.util.LinkedList;
import java.util.Random;
public class LLExample {

    public static void LLExampleRemoveLastValue() {
        LinkedList<Integer> list = new LinkedList<Integer>();

        while (list.size() < 2_000_000) {
            list.add(new Random().nextInt());
        }

        // Remove last element until empty
        while (!list.isEmpty()) {
            list.removeLast();
        }
    }

    public static void LLExampleRemoveRandomVaule() {
        LinkedList<Integer> list = new LinkedList<Integer>();

        while (list.size() < 2_000_000) {
            list.add(new Random().nextInt());
        }

        // Remove last element until empty
        while (!list.isEmpty()) {
            list.remove(new Random().nextInt(list.size()));
        }
    }
}
