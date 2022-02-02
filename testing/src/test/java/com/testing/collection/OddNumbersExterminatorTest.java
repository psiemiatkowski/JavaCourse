package com.testing.collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OddNumbersExterminatorTest {

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> testNumbers = new ArrayList<>();
        testNumbers.add(11);
        testNumbers.add(25);
        testNumbers.add(30);
        testNumbers.add(42);
        testNumbers.add(7);
        //When
        List<Integer> resultList = exterminator.exterminate(testNumbers);
        //Then
        assertEquals(2, resultList.size());
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> testNumbers = new ArrayList<>();
        //When
        List<Integer> resultList = exterminator.exterminate(testNumbers);
        //Then
        assertEquals(0, resultList.size());
    }
}
