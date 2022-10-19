package com.solid.book;
// 63010022 Glit Rungrojkijkul
public class PrintToScreen {
    private Book book;
    
    PrintToScreen(){
        
    }
    
    PrintToScreen(Book book){
        this.book = book;
    }
    
    public void setBook(Book book){
        this.book = book;
    }
    
    public void print() {
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}
