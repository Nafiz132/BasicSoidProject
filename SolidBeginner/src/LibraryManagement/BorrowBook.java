package LibraryManagement;

import java.util.Scanner;

public class BorrowBook {
    String book;
    int id;
    Scanner b= new Scanner(System.in);

    public void bookBorrowing(){
        book= b.nextLine();
        id=b.nextInt();
        System.out.println("Member with Id "+id +" Borrowed a book "+book);
    }
}
