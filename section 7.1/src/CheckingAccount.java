public class CheckingAccount {
    private double balance;
    private String name;

    public CheckingAccount(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Peringatan: Jumlah penarikan tidak boleh negatif.");
        } else if (amount > balance) {
            System.out.println("Peringatan: Dana tidak mencukupi untuk penarikan.");
        } else {
            balance -= amount;
            System.out.println("Penarikan berhasil. Saldo baru: " + balance);
        }
    }

    // Getter untuk saldo (opsional)
    public double getBalance() {
        return balance;
    }
}