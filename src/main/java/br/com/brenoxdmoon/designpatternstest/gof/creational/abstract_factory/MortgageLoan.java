package br.com.brenoxdmoon.designpatternstest.gof.creational.abstract_factory;

import java.math.BigDecimal;
import java.util.UUID;

public class MortgageLoan extends Loan {

    public MortgageLoan(String loanId, Integer amount, BigDecimal income, Integer installments) {
        super(loanId, amount, income, installments, "Mortgage", 10);
        if(installments > 420) throw new RuntimeException("The maximum number of installments for Mortgage Loan is 420");
        if ((income.multiply(new BigDecimal("0.25"))).compareTo(BigDecimal.valueOf((amount / installments))) < 0) throw new Error("The installment amount could not exceed 25% of monthly income");
    }

    @Override
    public MortgageLoan create(Integer amount, BigDecimal income, Integer installments) {
        this.loanId = UUID.randomUUID().toString();
        return new MortgageLoan(loanId, amount, income, installments);
    }
}
