package me.dio.banking.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountId;

    @Column(unique = true)
    private long rm;

    @Column(precision = 13, scale = 2)
    private BigDecimal points;

    @Column(name = "account_limit", precision = 13, scale = 2)
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
