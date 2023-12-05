package core.basesyntax.service.transaction.impl;

import core.basesyntax.service.transaction.TransactionHandler;

public class PurchaseTransactionHandler implements TransactionHandler {
    @Override
    public int perform(int balance, int quantity) {
        if (balance < quantity) {
            throw new RuntimeException(
                "Can`t perform transaction PURCHASE. Not enough products on the balance"
            );
        }
        return balance - quantity;
    }
}