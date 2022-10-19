package com.solid.book;
// 63010022 Glit Rungrojkijkul
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintToFile {
    private Book book;
    
    PrintToFile(){
        
    }
    
    PrintToFile(Book book){
        this.book = book;
    }
    
    public void setBook(Book book){
        this.book = book;
    }
    
    public void print() {
        boolean isEven = false;
        String previousPage = "";
        try {
            FileWriter fileWriter = new FileWriter(book.getTitle() + ".txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            do {
                if (isEven) {
                    previousPage = book.getCurrentPage();
                    isEven = false;
                } else {
                    printWriter.printf("%-25s : %25s%n", previousPage, book.getCurrentPage());
                    isEven = true;
                }
            } while (book.turnToNextPage());
            printWriter.close();
        } catch (IOException ex) {
            System.out.println("Cannot print this book due to IOException");
        }
    }
}

