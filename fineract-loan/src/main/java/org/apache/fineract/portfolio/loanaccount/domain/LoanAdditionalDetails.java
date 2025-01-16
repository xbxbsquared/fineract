package org.apache.fineract.portfolio.loanaccount.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.math.BigDecimal;

@Embeddable
@Getter
public class LoanAdditionalDetails {
    @Column(name = "goods_value", scale = 6, precision = 19)
    private BigDecimal goodsValue;

    @Column(name = "freight_charges", scale = 6, precision = 19)
    private BigDecimal freigtCharges;

    @Column(name = "other_charges", scale = 6, precision = 19)
    private BigDecimal otherCharges;

    @Column(name = "advance", scale = 6, precision = 19)
    private BigDecimal advance;

    @Column(name = "reduction_by_lender", scale = 6, precision = 19)
    private BigDecimal reductionByLender;

    @Column(name = "advance_ratio", scale = 6, precision = 19)
    private BigDecimal advanceRatio;

    @Column(name = "factoring_fees", scale = 6, precision = 19)
    private BigDecimal factoringFees;

    @Column(name = "net_invoice_value", scale = 6, precision = 19)
    private BigDecimal netinvoiceValue;

    @Column(name = "tenure", scale = 6, precision = 19)
    private BigDecimal tenure;

    @Column(name = "interest_rate", scale = 6, precision = 19)
    private BigDecimal interestRate;

    protected LoanAdditionalDetails() {
        //
    }

    public LoanAdditionalDetails(final BigDecimal goodsValue,
                                 final BigDecimal freigtCharges,
                                 final BigDecimal otherCharges,
                                 final BigDecimal advance,
                                 final BigDecimal reductionByLender,
                                 final BigDecimal advanceRatio,
                                 final BigDecimal factoringFees,
                                 final BigDecimal netinvoiceValue,
                                 final BigDecimal tenure,
                                 final BigDecimal interestRate) {
        this.goodsValue = goodsValue;
        this.freigtCharges = freigtCharges;
        this.otherCharges = otherCharges;
        this.advance = advance;
        this.reductionByLender = reductionByLender;
        this.advanceRatio = advanceRatio;
        this.factoringFees = factoringFees;
        this.netinvoiceValue = netinvoiceValue;
        this.tenure = tenure;
        this.interestRate = interestRate;
    }

}
