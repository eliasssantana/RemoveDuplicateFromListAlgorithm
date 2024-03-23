package org.example;

import org.junit.Test;

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
}
