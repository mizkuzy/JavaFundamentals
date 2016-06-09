package Bloh;

import java.util.Set;

public class Generics2 {
    public static void main(String[] args) {

    }

    static int numElementsInCommon(Set s1, Set s2){
        int result = 0;
        for (Object o1 :
                s1) {
            if (s2.contains(o1))
                result++;
        }
        return result;
    }

    static int numElementsInCommonWilCard(Set<?> s1, Set<?> s2){
        int result = 0;
        for (Object o1 :
                s1) {
            if (s2.contains(o1))
                result++;
        }
        return result;
    }
}
