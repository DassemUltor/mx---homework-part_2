package lesson03_22.lesson03_15Extend.task_2;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class Main {


    public static void main(String[] args) {

        Book book1 = new Book("Ведьмак", 1999);
        Book book2 = new Book("Полари", 2016);
        Book book3 = new Book("Малазанская книга павших", 1998);
        Book book4 = new Book("Подсказчик", 2015);

        List<Book> bookShelf = new ArrayList<>();
        bookShelf.add(book1);
        bookShelf.add(book2);
        bookShelf.add(book3);
        bookShelf.add(book4);

        List<String> books = bookShelf.stream()
                .filter(element -> element.getYear() > 2000)
                .map(element -> element.getName())
                .toList();

        log.info(" " + books);


    }
}
