public class SavingsBond {
    private int termMonths;
    private double interestRate;

    public SavingsBond(int termMonths) {
        this.termMonths = termMonths;
        setInterestRate();
    }

    private void setInterestRate() {
        if (termMonths >= 0 && termMonths <= 11) {
            interestRate = 0.005;
        } else if (termMonths >= 12 && termMonths <= 23) {
            interestRate = 0.01;
        } else if (termMonths >= 24 && termMonths <= 35) {
            interestRate = 0.015;
        } else if (termMonths >= 36 && termMonths <= 47) {
            interestRate = 0.02;
        } else if (termMonths >= 48 && termMonths <= 60) {
            interestRate = 0.025;
        } else {
            System.out.println("Masa tidak valid untuk Obligasi Tabungan.");
        }
    }

    public double calculateInterest(double principal) {
        return principal * interestRate;
    }
}
