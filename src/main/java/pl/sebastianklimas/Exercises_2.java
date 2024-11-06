package pl.sebastianklimas;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;

/*
    Exercises found at:
    https://www.w3resource.com/java-exercises/stream/index.php
*/

public class Exercises_2 {
    public Double exercise1(List<Integer> input) {
        return input.stream()
                .mapToInt(n -> n)
                .average()
                .orElse(0.0);
    }
    public List<String> exercise2(List<String> input, boolean upperCase) {
        return input.stream()
                .map(n -> upperCase ? n.toUpperCase() : n.toLowerCase())
                .toList();
    }
    public int exercise3(List<Integer> input, boolean even) {
        return input.stream()
                .filter(n -> even ? n % 2 == 0 : n % 2 == 1)
                .mapToInt(n -> n)
                .sum();
    }
    public List<String> exercise4(List<String> input) {
        return input.stream()
                .distinct()
                .toList();
    }
    public long exercise5(List<String> input, char firstLetter) {
        return input.stream()
                .filter(n -> n.toLowerCase().startsWith(String.valueOf(firstLetter).toLowerCase()))
                .count();
    }
    public List<String> exercise6(List<String> input, boolean ascending) {
        return input.stream()
                .sorted(ascending ? Comparator.naturalOrder() : Comparator.reverseOrder())
                .toList();
    }
    public int exercise7(List<Integer> input, boolean max) {
        IntSummaryStatistics statistics = input.stream()
                .mapToInt(n -> n)
                .summaryStatistics();
        return max ? statistics.getMax() : statistics.getMin();
    }
    public Integer exercise8(List<Integer> input, boolean smallest) {
        List<Integer> list = input.stream()
                .sorted(smallest ? Comparator.naturalOrder() : Comparator.reverseOrder())
                .limit(2)
                .toList();
        return list.get(1);
    }
}
