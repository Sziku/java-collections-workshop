package com.codecool.collections.maps;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapTasksTest {
    MapTasks mapTasks = new MapTasks();
    @Test
    void characterCounter(){
        String test = "apple";


        Map<Character, Integer> testMap = mapTasks.characterCounter(test);

        assertEquals(1, testMap.get('a'));
        assertEquals(2, testMap.get('p'));
        assertEquals(1, testMap.get('l'));
        assertEquals(1, testMap.get('e'));
    }
    @Test
    void wordLengthMap(){
        String[] testArray = {"word", "apple", "szilvasbukta", "anna", "edda"};
        Map<Integer, String> testMap = mapTasks.wordLengthMap(testArray);

        assertEquals(testArray[0], testMap.get(testArray[0].length()));
        assertEquals(testArray[1], testMap.get(testArray[1].length()));
        assertEquals(testArray[2], testMap.get(testArray[2].length()));

    }

    @Test
    void wordLengtMultiplyhMap(){
        String[] testArray = {"word", "apple", "szilvasbukta", "anna", "edda"};
        Map<Integer, List<String>> testMap = mapTasks.wordLengthMultipleMap(testArray);

        assertEquals(Arrays.asList("word","anna","edda"), testMap.get(testArray[0].length()));
        assertEquals(Arrays.asList("apple"), testMap.get(testArray[1].length()));
        assertEquals(Arrays.asList("szilvasbukta"), testMap.get(testArray[2].length()));

    }

}
