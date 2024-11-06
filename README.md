# Streams-2
Another Java Stream API learning project.

The project consists of 2 sets containing several exercises each.

## Set #1

1 - Use Stream API to square each number in the list and collect the result into a new list.
```java
    public List<Integer> exercise1() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = numbers.stream()
                .map(n -> n * n)
                .toList();
        return result;
    }
```
2 - Use Stream API to find the length of the longest name in the list
```java
    public int exercise2() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        int result = names.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);
        return result;
    }
```
3 - Use Stream API to count the total number of distinct words (case-insensitive) in all the sentences.
```java
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
```
4 - Use Stream API to find the concatenation of the first two words that have even lengths.
```java
    public String exercise4() {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        String result = words.stream()
                .filter(w -> w.length() % 2 == 0)
                .limit(2)
                .collect(Collectors.joining());
        return result;
    }
```
5 - Use Stream API to find the sum of the squares of even numbers in the list.
```java
    public int exercise5() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * n)
                .sum();
        return result;
    }
```
6 - Use Stream API to group words by their lengths and collect the result into a Map.
```java
    public Map<Integer, List<String>> exercise6() {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        Map<Integer, List<String>> result = words.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.toList()
                ));
        return result;
    }
```

## Set #2

1 - Write a Java program to calculate the average of a list of integers using streams.
```java
    public Double exercise1(List<Integer> input) {
        return input.stream()
                .mapToInt(n -> n)
                .average()
                .orElse(0.0);
    }
```
2 - Write a Java program to convert a list of strings to uppercase or lowercase using streams.
```java
    public List<String> exercise2(List<String> input, boolean upperCase) {
        return input.stream()
                .map(n -> upperCase ? n.toUpperCase() : n.toLowerCase())
                .toList();
    }
```
3 - Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
```java
    public int exercise3(List<Integer> input, boolean even) {
        return input.stream()
                .filter(n -> even ? n % 2 == 0 : n % 2 == 1)
                .mapToInt(n -> n)
                .sum();
    }
```
4 - Write a Java program to remove all duplicate elements from a list using streams.
```java
    public List<String> exercise4(List<String> input) {
        return input.stream()
                .distinct()
                .toList();
    }
```
5 - Write a Java program to count the number of strings in a list that start with a specific letter using streams.
```java
    public long exercise5(List<String> input, char firstLetter) {
        return input.stream()
                .filter(n -> n.toLowerCase().startsWith(String.valueOf(firstLetter).toLowerCase()))
                .count();
    }
```
6 - Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
```java
    public List<String> exercise6(List<String> input, boolean ascending) {
        return input.stream()
                .sorted(ascending ? Comparator.naturalOrder() : Comparator.reverseOrder())
                .toList();
    }
```
7 - Write a Java program to find the maximum and minimum values in a list of integers using streams.
```java
    public int exercise7(List<Integer> input, boolean max) {
        IntSummaryStatistics statistics = input.stream()
                .mapToInt(n -> n)
                .summaryStatistics();
        return max ? statistics.getMax() : statistics.getMin();
    }
```
8 - Write a Java program to find the second smallest and largest elements in a list of integers using streams.
```java
    public Integer exercise8(List<Integer> input, boolean smallest) {
        List<Integer> list = input.stream()
                .sorted(smallest ? Comparator.naturalOrder() : Comparator.reverseOrder())
                .limit(2)
                .toList();
        return list.get(1);
    }
```

### Exercises links
Exercise sets found at links:

Set #1: https://codefinity.com/courses/v2/190d2568-3d25-44d0-832f-da03468004c9/c0bcd017-ff39-46ec-bc93-acd569f3497d/d56d7f54-9992-491a-a50f-64ceee652f04

Set #2: https://www.w3resource.com/java-exercises/stream/index.php 
