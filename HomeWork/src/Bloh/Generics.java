package Bloh;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Generics {


    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        unsafeAddRawType(strings, new Integer(42));
        //ошибка при выполнении ClassCastException
        String s = strings.get(0);

        List<String> stringList = new ArrayList<>();
        //ошибка при компиляции
        //unsafeAddObjectType(stringList, new Integer(42));
    }

    private static void unsafeAddObjectType(List<Object> list, Object object) {
        list.add(object);
    }

    private static void unsafeAddRawType(List list, Object object) {
        list.add(object);
    }
}
