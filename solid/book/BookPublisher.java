package com.solid.book;
// 63010022 Glit Rungrojkijkul
import java.util.List;

public class BookPublisher {
    public static void main(String[] args) {
        Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        PrintToFile print = new PrintToFile(book);
        print.print();
    }
}
