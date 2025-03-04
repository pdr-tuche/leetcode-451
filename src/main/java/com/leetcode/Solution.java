package com.leetcode;

import java.util.*;
import java.util.stream.Stream;

class Solution {
    public String frequencySort(String s) {
        Map<String, Integer> quantidadesAparecidas = this.getQuantidadeDeLetras(s);
        System.out.println(this.mountString(quantidadesAparecidas));
        return "ok";
    }

    protected String mountString(Map<String,Integer>frequencia){
        StringBuilder string = new StringBuilder();
        Integer maiorNumero = Collections.max(frequencia.values());
        List<String> maiorChave = frequencia.entrySet()
                .stream()
                .filter(chave -> chave.getValue().equals(maiorNumero))
                .map(Map.Entry::getKey)
                .toList();


        return "ok";
    }

    protected Map<String,Integer> getQuantidadeDeLetras(String string) {
        Map<String, Integer>quantidadesAparecidas = new HashMap<String, Integer>();

        for (int i = 0; i < string.length(); i++) {
            String letra = String.valueOf(string.charAt(i));

            if (!quantidadesAparecidas.containsKey(letra)) {
                quantidadesAparecidas.put(letra, 1);
            }else {
                Integer novaQuantidade= quantidadesAparecidas.get(letra) + 1;
                quantidadesAparecidas.put(letra, novaQuantidade);
            }
        }
        return quantidadesAparecidas;
    }
}