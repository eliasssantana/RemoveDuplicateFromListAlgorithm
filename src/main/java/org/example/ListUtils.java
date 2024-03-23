package org.example;


import org.jetbrains.annotations.NotNull;

import java.util.*;

public class ListUtils {

    public static <E extends Comparable<E>> @NotNull ArrayList<E> removeDuplicatesAndOrder(List<E> list ){

        Set<E> set = new LinkedHashSet<>(list);

        ArrayList<E> arrayList = new ArrayList<>(set);

        Collections.sort(arrayList);
        return arrayList;
    }
}
