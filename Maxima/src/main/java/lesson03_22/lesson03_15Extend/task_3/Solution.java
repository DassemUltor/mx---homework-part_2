package lesson03_22.lesson03_15Extend.task_3;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Solution {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(74);
        list.add(1);
        list.add(41);
        list.add(95);
        list.add(6);

        int sum = list.stream()
                .reduce(0, (x, y) -> x + y);


        log.info("Сумма всех чисел в списке: " + sum);

        log.info("Среднее значение всех чисел в списке: " + (sum / list.size()));

        long countNumbersOverTen = list.stream()
                .filter(element -> element > 10)
                .count();


        log.info("Количество чисел в списке, с значением выше 10: " + countNumbersOverTen);
    }
}
