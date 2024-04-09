package lesson03_22.lesson03_13Extend.task_3;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

@Slf4j
public class Solution {

    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        Scanner console = new Scanner(System.in);

        while (true) {
            String text = console.nextLine();

            if (text.equalsIgnoreCase("stop")) {
                break;
            }
            words.add(text.toLowerCase());
        }

        log.info("Содержимое коллекции words:");
        for (String word : words) {
            log.info(word + " ");
        }
    }
}
