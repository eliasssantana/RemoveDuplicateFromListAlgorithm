package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListUtilsTest {

    @Test
    public void givenStringsThenRemovedDuplicates(){

        // Create an array this way
//        List<String> input = new ArrayList<>();
//        input.add("c");
//        input.add("b");
//        input.add("b");
//        input.add("d");
//        input.add("c");
//        input.add("a");

        // Create an array in another way
        List<String> input = Arrays.asList("a", "b", "b", "d", "c", "a");

        List<String> result = ListUtils.removeDuplicatesAndOrder(input);

        String expectedResult = "[a, b, c, d]";

        assertEquals(expectedResult, result.toString());
    }

    @Test
    public void givenIntegersThenRemovedDuplicates(){

        List<Integer> input = new ArrayList<>();

        input.add(3);
        input.add(3);
        input.add(4);
        input.add(1);
        input.add(7);
        input.add(1);
        input.add(2);
        input.add(1);

        List<Integer> result = ListUtils.removeDuplicatesAndOrder(input);

        String expectedResult = "[1, 2, 3, 4, 7]";

        assertEquals(expectedResult, result.toString());

    }
}
