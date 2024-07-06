package br.com.brenoxdmoon.designpatternstest.gof.creational.abstract_factory;

import java.math.BigDecimal;

public abstract class Loan {

    protected String loanId;
    protected Integer amount;
    protected BigDecimal income;
    protected Integer installments;
    protected String type;
    private Integer rate;

    protected Loan(String loanId, Integer amount, BigDecimal income, Integer installments, String type, Integer rate) {
        this.loanId = loanId;
        this.amount = amount;
        this.income = income;
        this.installments = installments;
        this.type = type;
        this.rate = rate;
    }

    public abstract MortgageLoan create(Integer amount, BigDecimal income, Integer installments);
}
