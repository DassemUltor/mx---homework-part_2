package lesson03_22.lesson03_13Extend.task_1;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

@Slf4j
public class PhoneBook {
    private HashMap<String, String> book;

    public PhoneBook(HashMap<String, String> book) {
        this.book = book;
    }

    public void searchNumber(String name) {
        log.warn(book.getOrDefault(name, "Такой записи в книге нет."));
    }

    public void addNumber(String name, String number) {
        book.put(name, number);
        log.info("Добавлен новый контакт: " + name + " " + number);
    }

    public void deleteNumber(String name) {
        if (book.containsKey(name)) {
            book.remove(name);
            log.warn("Запись с именем " + name + " удалена!");

        } else {
            log.warn("Такой записи в книге нет.");
        }
    }

    @Override
    public String toString() {
        return "PhoneBook{"
                + book +
                '}';
    }
}
