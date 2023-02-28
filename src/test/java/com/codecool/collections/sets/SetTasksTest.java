package com.codecool.collections.sets;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetTasksTest {

    @Test
    void unionTest(){
        SetTasks stsk = new SetTasks();
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(6);
        set2.add(7);

        Set<Integer>result =stsk.twoSetUnion(set1,set2);

        System.out.println(result);
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
        assertTrue(result.contains(3));
        assertTrue(result.contains(5));
        assertTrue(result.contains(6));
        assertTrue(result.contains(7));


    }

    @Test
    void setIntersect(){
        SetTasks stsk2 = new SetTasks();
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(6);
        set2.add(7);

        Set<Integer>result =stsk2.twoSetIntersect(set1,set2);

        System.out.println(result);
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
        assertTrue(result.contains(3));
        assertFalse(result.contains(6));
    }

    @Test
    void setDifference(){
        SetTasks stsk2 = new SetTasks();
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(6);
        set2.add(7);

        Set<Integer>result =stsk2.twoSetDifference(set1,set2);

        System.out.println(result);
        assertFalse(result.contains(6));
        assertFalse(result.contains(7));
        assertTrue(result.contains(5));
        assertTrue(result.contains(4));
        assertFalse(result.contains(1));
        assertFalse(result.contains(2));
        assertFalse(result.contains(3));
    }
    @Test
    void setSymmetricDifference(){
        SetTasks stsk2 = new SetTasks();
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(6);
        set2.add(7);

        Set<Integer>result =stsk2.twoSetSymetricDifference(set1,set2);

        System.out.println(result);
        assertTrue(result.contains(6));
        assertTrue(result.contains(7));
        assertTrue(result.contains(5));
        assertTrue(result.contains(4));
        assertFalse(result.contains(1));
        assertFalse(result.contains(2));
        assertFalse(result.contains(3));
    }

    @Test
    void  letterCounterTest(){
        String test ="apple";
        String test2 ="onion ring";

        SetTasks setTasks = new SetTasks();
        setTasks.letterCounter(test);

        assertEquals("4, because (a, p, l, e)", setTasks.letterCounter(test));
        assertEquals("6, because (o, n, i, ' ', r, g)", setTasks.letterCounter(test2));

    }

}
