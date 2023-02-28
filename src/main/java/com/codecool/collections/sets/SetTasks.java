package com.codecool.collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTasks {
    public Set<Integer> twoSetUnion(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();

        for (int num : set1) {
            result.add(num);
        }
        for (int num2 : set2) {
            result.add(num2);
        }
        return result;
    }

    public Set<Integer> twoSetIntersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();
        for (int num : set1) {
            for (int num2 : set2) {
                if (num == num2) {
                    result.add(num);
                    break;
                }
            }
        }
        return result;
    }

    public Set<Integer> twoSetDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();

        for (int num : set1) {
            int index = 0;
            for (int num2 : set2) {
                if (num == num2) {
                    break;
                }
                if (index == set2.size() - 1) {
                    result.add(num);
                }
                index++;
            }
        }

        return result;
    }

    public Set<Integer> twoSetSymetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();

        for (int num : set1) {
            int index = 0;
            for (int num2 : set2) {
                if (num == num2) {
                    break;
                }
                if (index == set2.size() - 1) {
                    result.add(num);
                }
                index++;
            }
        }
        for (int num : set2) {
            int index = 0;
            for (int num2 : set1) {
                if (num == num2) {
                    break;
                }
                if (index == set1.size() - 1) {
                    result.add(num);
                }
                index++;
            }
        }


        return result;
    }

    public String letterCounter(String word) {
        Set<Character> letters = new LinkedHashSet<>();
        for (char c : word.toCharArray()) {
            letters.add(c);
        }
        return letters.size() + ", because " + buildReason(letters);
    }

    private static String buildReason(Set<Character> letters) {
        StringBuilder lettersString = new StringBuilder("(");
        int index = 0;
        for (char c : letters) {
            if (c == ' ') {
                lettersString.append("' '");
            } else {
                lettersString.append(c);
            }

            index++;
            if (index < letters.size()) {
                lettersString.append(", ");
            }
        }
        lettersString.append(")");
        return lettersString.toString();
    }

}
