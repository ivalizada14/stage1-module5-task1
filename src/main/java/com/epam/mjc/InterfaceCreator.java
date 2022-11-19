package com.epam.mjc;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase(){
        Predicate<List<String>> startWithUpperCase = x -> {
            for(String s : x)
            {
                if(Character.isLetter(s.charAt(0)) && Character.isUpperCase(s.charAt(0)))
                    return false;
            }
            return true;
        };
        return startWithUpperCase;

    };

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        Consumer<List<Integer>> addEvenValues = x -> {
            for(Integer i : x)
            {
                if(i%2==0)
                    x.add(i);
            }
        };
        return addEvenValues;
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        Supplier<List<String>> filterC = () -> {
            List<String> filteredStrings = new ArrayList<>();
            for(String s : values)
            {
                if(Character.isUpperCase(s.charAt(0)) &&
                s.endsWith(".") &&
                s.split(" ").length >= 2)
                    filteredStrings.add(s);
            }
            return filteredStrings;
        };
        return  filterC;
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        Function<List<String>, Map<String, Integer>> f = x ->{
            Map<String, Integer> map = new HashMap<>();
            for(String s : x)
            {
                map.put(s, s.length());
            }
            return map;
        };
        return f;
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction = (list1, list2) ->{
          List<Integer> list3 = new ArrayList<>();
          list3.addAll(list1); list3.addAll(list2);
          return list3;
        };
        return biFunction;
    }
}
