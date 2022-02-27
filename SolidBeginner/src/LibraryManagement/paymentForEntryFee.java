package LibraryManagement;

import java.util.Scanner;

public class paymentForEntryFee implements MoneyReciept{

    int tk;
    Scanner e = new Scanner(System.in);

    @Override
    public void payment() {
            tk=e.nextInt();
            System.out.println(tk +" TK is received for Subscription Fee ");
    }
}
