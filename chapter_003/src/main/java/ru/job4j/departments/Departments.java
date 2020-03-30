package ru.job4j.departments;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                 tmp.add(start + el);
            }
        }
        List<String> result = new ArrayList<>(tmp);
        Collections.sort(result);
        for(int index = 1; index != result.size(); index++) {
            result.set(index, result.get(index - 1) + "/" + result.get(index));
        }
        return result;
    }

    public static List<String> sortDesc(List<String> orgs) {
        List<String> result = Departments.fillGaps(orgs);
        result.sort(new DepDescComp());
        return result;
    }
}