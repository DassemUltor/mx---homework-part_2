package lesson03_22.lesson03_13Extend.task_4;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public class Solution {

    public static void main(String[] args) {
        Set<Integer> firstSet = new HashSet<>();

        for (int i = 1; i <= 10; i++) {
            firstSet.add(i);
        }

        Set<Integer> secondSet = new HashSet<>();
        for (int i = 5; i <= 15; i++) {
            secondSet.add(i);
        }

        HashSet<Integer> intersection = new HashSet<>(firstSet);
        intersection.retainAll(secondSet);
        log.info("Пересечение множеств: " + intersection);

        HashSet<Integer> union = new HashSet<>(firstSet);
        union.addAll(secondSet);
        log.info("Объединение множеств: " + union);


        HashSet<Integer> difference = new HashSet<>(firstSet);
        difference.removeAll(secondSet);
        log.info("Разность первого множества и второго: " + difference);


    }
}
