package pl.s222738.creditcard;

import java.math.BigDecimal;

public class CreditCard {
    private BigDecimal balance;
    private BigDecimal credit;

    public CreditCard(String cardNumber) {

    }

    public void assignLimit(BigDecimal creditAmount) {
        if (isCreditAlreadyAssigned()) {
            throw new ReassignCreditExceptions();
        }
        if (isCreditBelowThreshold(creditAmount)) {
            throw new CreditBelowLimitException();
        }

        this.balance = creditAmount;
        this.credit = creditAmount;
    }

    private boolean isCreditAlreadyAssigned() {
        return credit != null;
    }

    private boolean isCreditBelowThreshold(BigDecimal creditAmount) {
        return creditAmount.compareTo(BigDecimal.valueOf(100)) < 0;
    }

    public BigDecimal getCurrentBalance() {
        return balance;
    }

    public void withdraw(BigDecimal value) {
        this.balance = balance.subtract(value);
    }
}
