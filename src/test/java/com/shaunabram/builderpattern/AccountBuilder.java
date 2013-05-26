package com.shaunabram.builderpattern;

import org.joda.time.DateTime;
import java.math.BigDecimal;

public class AccountBuilder {

    //account fields with default values
    Integer id = 1;
    String name = "default account name";
    AccountType type = AccountType.CHECKING;
    BigDecimal balance = new BigDecimal(0);
    DateTime openDate = new DateTime(2013, 01, 01, 0, 0, 0);
    Status status = Status.ACTIVE;

    public AccountBuilder() {}

    public AccountBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public AccountBuilder unpersisted() {
        this.id = null;
        return this;
    }

    public AccountBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public AccountBuilder withType(AccountType type) {
        this.type = type;
        return this;
    }

    public AccountBuilder withBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    public AccountBuilder withNegativeBalance() {
        this.balance = new BigDecimal(-100);
        return this;
    }

    public AccountBuilder withZeroBalance() {
        this.balance = new BigDecimal(0);
        return this;
    }

    public AccountBuilder withOpenDate(DateTime openDate) {
        this.openDate = openDate;
        return this;
    }

    public AccountBuilder withStatus(Status status) {
        this.status = status;
        return this;
    }

    public Account build() {
        return new Account(id, name, type, balance, openDate, status);
    }
}
