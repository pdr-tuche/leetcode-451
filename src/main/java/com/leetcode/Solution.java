package com.leetcode;

import java.util.*;

class Solution {
    public String frequencySort(String s) {
        List<String> letras = List.of(s.split(""));
        Map<String, Integer>letrasRepetidas = new HashMap<>();

        for(String letra : letras) {
            letrasRepetidas.put(letra, Collections.frequency(letras, letra));
        }

        List<Map.Entry<String, Integer>> sortedMap = letrasRepetidas.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .toList();

        StringBuilder res = new StringBuilder();
        for (Map.Entry<String, Integer> entry : sortedMap) {
            res.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        return res.toString();
    }

}