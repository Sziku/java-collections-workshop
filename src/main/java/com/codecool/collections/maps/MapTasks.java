package com.codecool.collections.maps;

import java.util.*;

public class MapTasks {

    public Map<Character, Integer> characterCounter(String word){
        Map<Character, Integer> map = new HashMap<>();
        for(char c:word.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1 );
            }else {
                map.put(c,1);
            }
        }
        return map;
    }
    public Map<Integer, String> wordLengthMap(String[] words){
        Map<Integer, String> map = new HashMap<>();
        for(String s:words){
            if(!map.containsKey(s.length())){
                map.put(s.length(), s );
            }
        }
        return map;
    }



    public static Map<Integer, List<String>> wordLengthMultipleMap(String[] words){
        Map<Integer, List<String>> map = new HashMap<>();
        for(String s:words){
            if(!map.containsKey(s.length())){
                map.put(s.length(), new ArrayList<>());
                map.get(s.length()).add(s);
            } else {
                map.get(s.length()).add(s);
            }
        }
        System.out.println(map);
        return map;
    }

}
