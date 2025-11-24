package CSCC20Project.Payments;
public class CashPayment extends Payment {

    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void getPayment() {
        System.out.println("Cash Payment Accepted: ₱" + amount);
    }
}

