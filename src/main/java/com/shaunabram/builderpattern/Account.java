package com.shaunabram.builderpattern;

import org.joda.time.DateTime;

import java.math.BigDecimal;

/**
 * Immutable Account class.
 *
 * In future, JSR-354 Java Money and Currency API might be a better choice for monetary values, such as balance,
 * but is still in draft at time of writing.
 */
public final class Account {
    private final Integer id;
    private final String name;
    private final AccountType type;
    private final BigDecimal balance;
    private final DateTime openDate;
    private final Status status;

    public Account(Integer id, String name, AccountType type,
                   BigDecimal balance, DateTime openDate, Status status) {
        this.status = status;
        this.id = id;
        this.name = name;
        this.type = type;
        this.balance = balance;
        this.openDate = openDate;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public AccountType getType() {
        return type;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public DateTime getOpenDate() {
        return openDate;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", balance=" + balance +
                ", openDate=" + openDate +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        if (id != null ? !id.equals(account.id) : account.id != null) return false;
        if (balance != null ? !balance.equals(account.balance) : account.balance != null) return false;
        if (name != null ? !name.equals(account.name) : account.name != null) return false;
        if (openDate != null ? !openDate.equals(account.openDate) : account.openDate != null) return false;
        if (status != account.status) return false;
        if (type != account.type) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (balance != null ? balance.hashCode() : 0);
        result = 31 * result + (openDate != null ? openDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
