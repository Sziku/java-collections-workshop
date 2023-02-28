package com.codecool.collections.sorting;

import java.util.*;

public class SortingTasks {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,6,2,1);

        Collections.sort(nums, new ReverseIntComparator());
        System.out.println(nums);

        List<Student> people = new ArrayList<>();
        people.add(new Student(5, "Z", 18));
       people.add(new Student(6, "X", 19));
       people.add(new Student(7, "X", 28));
       people.add(new Student(8, "R", 15));

       Collections.sort(people, new sortByAge());
       System.out.println(people);

       Collections.sort(people, new sortById());
       System.out.println(people);

       Collections.sort(people, new sortByNameAndId());
       System.out.println(people);
        System.out.println(sortByNameAndId(people));
    }

    public static List<Student> sortByNameAndId(List<Student> students){
        Collections.sort(students, new sortByNameAndId());
        return students;
    }
}

class ReverseIntComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}

class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age){
        this.id=id;
        this.name=name;
        this.age = age;
    }


    /*@Override
    public int compareTo(Student p) {
        return this.age=p.age;

    }*/
    @Override
    public String toString() {
        return "Person{" + id + ", " + name + ", " + age + '}';
    }
}

class sortByAge implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age- o2.age;
    }
}
class sortById implements  Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.id-o2.id;
    }
}

class sortByNameAndId implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.name.equals(o2.name)){
            return o1.id-o2.id;
        }
        return o1.name.compareTo(o2.name);
    }
}