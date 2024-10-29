package pl.sebastianklimas;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercises {
    public List<Integer> exercise1() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = numbers.stream()
                .map(n -> n * n)
                .toList();
        return result;
    }
    public int exercise2() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        int result = names.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);
        return result;
    }
    public long exercise3() {
        List<String> sentences = Arrays.asList(
                "Java Stream API provides a fluent interface for processing sequences of elements.",
                "It supports functional-style operations on streams of elements, such as map-reduce transformations.",
                "In this exercise, you need to count the total number of words in all sentences."
        );
        long result = sentences.stream()
                .flatMap(n -> Arrays.stream(n.split(" ")))
                .distinct()
                .count();
        return result;
    }
    public String exercise4() {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        String result = words.stream()
                .filter(w -> w.length() % 2 == 0)
                .limit(2)
                .collect(Collectors.joining());
        return result;
    }
    public int exercise5() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * n)
                .sum();
        return result;
    }
    public Map<Integer, List<String>> exercise6() {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        Map<Integer, List<String>> result = words.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.toList()
                ));
        return result;
    }
}
