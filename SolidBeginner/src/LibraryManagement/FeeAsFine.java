package LibraryManagement;

import java.util.Scanner;

public class FeeAsFine implements MoneyReciept{

    Scanner f= new Scanner(System.in);
    int tk;
    @Override
    public void payment() {
        tk= f.nextInt();
        System.out.println(tk+ " is received as Fine for late submission of books!");
    }
}
