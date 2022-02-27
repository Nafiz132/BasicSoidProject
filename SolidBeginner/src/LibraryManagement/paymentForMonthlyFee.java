package LibraryManagement;

import java.util.Scanner;

public class paymentForMonthlyFee implements MoneyReciept{
    int tk;
    Scanner m = new Scanner(System.in);

    @Override
    public void payment() {
        tk= m.nextInt();
        System.out.println(tk+" TK is received for Monthly Fee");
    }
}
