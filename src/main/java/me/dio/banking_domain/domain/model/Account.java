package me.dio.banking_domain.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountId;

    @Column(unique = true)
    private long rm;

    @Column(precision = 2, scale = 13)
    private BigDecimal points;

    @Column(name = "account_limit", precision = 2, scale = 13)
    private BigDecimal accountLimit;

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public long getRm() {
        return rm;
    }

    public void setRm(long rm) {
        this.rm = rm;
    }

    public BigDecimal getPoints() {
        return points;
    }

    public void setPoints(BigDecimal points) {
        this.points = points;
    }

    public BigDecimal getAccountLimit() {
        return accountLimit;
    }

    public void setAccountLimit(BigDecimal accountLimit) {
        this.accountLimit = accountLimit;
    }
}
