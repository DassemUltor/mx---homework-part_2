package lesson03_22.lesson03_13Extend.task_1;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

@Slf4j
public class Solution {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook(new HashMap<>());
        phoneBook.addNumber("Alice", "+79409528512");
        phoneBook.addNumber("David", "+79817428419");
        phoneBook.addNumber("Anna", "+79097562785");
        phoneBook.addNumber("Tom", "+791169346941");

        log.info(" " + phoneBook);


        phoneBook.searchNumber("Tom");
        phoneBook.searchNumber("Robin");


        phoneBook.deleteNumber("Anna");
        phoneBook.deleteNumber("Tomas");


        log.info(" " + phoneBook);
    }
}
