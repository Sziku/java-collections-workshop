package com.codecool.collections.lists;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ListTasksTest {
    @Test
    void  testRemoveElements(){
        List<String> words = new ArrayList<>();
        words.add("5");
        words.add("6");
        words.add("7");
        words.add("8");
        words.add("9");
        words.add("10");

        ListTasks sut = new ListTasks();

        sut.removeElement(words, "6");
        assertFalse(words.contains("6"));
    }
    
    @Test 
    void testRemoveElementsWithout(){
        List<String> numbers = new ArrayList<>();
        numbers.add("5");
        numbers.add("6");
        numbers.add("7");
        numbers.add("8");
        numbers.add("9");
        numbers.add("10");

        ListTasks sut = new ListTasks();
        List<String> result = sut.getListWithout(numbers, "6");
        assertTrue(numbers.contains("6"));
        assertFalse(numbers.contains("6"));

    }

}
