package lesson03_22.lesson03_15Extend.task_1;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class Solution {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Пока");
        stringList.add("Привет");
        stringList.add("Как дела?");
        stringList.add("Ок");


        List<String> collect = stringList.stream()
                .filter((s) -> s.length() > 5)
                .sorted((s1, s2) -> s2.compareTo(s1))  // oder Comparator.reverseOrder
                .toList();
        for (String s : collect) {
            log.info(s);
        }

    }
}
