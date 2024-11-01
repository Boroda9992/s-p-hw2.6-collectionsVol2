import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 11, 10, 221, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Task1");
        task1();
        System.out.println("Task2");
        task2();
        System.out.println("Task3");
        task3();
        System.out.println("Task4");
        task4();
    }

    public static void task1() {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
    public static void task2() {
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        for (Integer num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.println(num);
                prevNum = num;
            }
        }
    }
    public static void task3() {
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(uniqueWords);

    }
    public static void task4() {
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : strings) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        for (int count : wordCounts.values()) {
            System.out.println(count);
        }
    }
}