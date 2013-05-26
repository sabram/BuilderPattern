package com.shaunabram.builderpattern;

public class AccountFixtures {

    //a shortcut to creating a basic Account object
    public final Account ACCOUNT = new AccountBuilder().build();

    public final Account OVERDRAWN_CHECKING_ACCOUNT = new AccountBuilder()
            .withType(AccountType.CHECKING)
            .withNegativeBalance()
            .build();

    public final Account CLOSED_SAVING_ACCOUNT = new AccountBuilder()
            .withType(AccountType.SAVING)
            .withZeroBalance()
            .withStatus(Status.CLOSED)
            .build();
}
