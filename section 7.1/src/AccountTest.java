
public class AccountTest {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(1000, "John Doe");

        account.withdraw(500); 
        account.withdraw(-100); 
        account.withdraw(700); 

        SavingsBond bond = new SavingsBond(24); 
        double interest = bond.calculateInterest(10000); 
        System.out.println("Bunga yang diperoleh dari Obligasi Tabungan: " + interest);
    }
}
