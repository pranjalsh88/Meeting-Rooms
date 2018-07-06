package com.company.pranjal;


import com.company.SortedIndices;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Arrays;

public class IndexTest {

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArray() {
        String[] numbers = {};
        SortedIndices.printDecreasingOrder(numbers);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAllWords() {
        String[] numbers = {"numbers", "three", "Michael"};
        SortedIndices.printDecreasingOrder(numbers);

    }

    @Test
    public void testAllNumbersPositiveCase() {
        String[] numbers = {"1", "2", "3", "10", "100", "50"};
        SortedIndices.printDecreasingOrder(numbers);
        assertEquals(Arrays.asList(4, 5, 3, 2, 1, 0), SortedIndices.printDecreasingOrder(numbers));
    }

    @Test
    public void testMixWordsNumbers() {
        String[] numbers = {"numbers", "three","1", "2", "3", "10", "Michael",  "100", "50"};
        SortedIndices.printDecreasingOrder(numbers);
        assertEquals(Arrays.asList(7,8,5, 4, 3, 2), SortedIndices.printDecreasingOrder(numbers));
    }

    @Test
    public void testDuplicateNumbers() {
        String[] numbers = {"numbers", "1", "1", "three","100","50", "Michael", "50"};
        SortedIndices.printDecreasingOrder(numbers);
        assertEquals(Arrays.asList(4,5,7,1,2), SortedIndices.printDecreasingOrder(numbers));
    }

    @Test
    public void testAllDuplicates() {
        String[] numbers = {"1", "1", "1", "1", "1", "1"};
        SortedIndices.printDecreasingOrder(numbers);
        assertEquals(Arrays.asList(0,1,2,3,4,5), SortedIndices.printDecreasingOrder(numbers));
    }

    @Test
    public void testNegativeNumbers() {
        String[] numbers = {"-1", "10", "-101", "21", "11", "10000000"};
        SortedIndices.printDecreasingOrder(numbers);
        assertEquals(Arrays.asList(5,3,4,1,0,2), SortedIndices.printDecreasingOrder(numbers));
    }


}
