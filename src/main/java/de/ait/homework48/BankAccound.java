package de.ait.homework48;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccound {
    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccound.class);
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccound(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    public void deposit(double amount){
        try {
        if (amount <= 0){
            throw new InsufficientFundsException("deposit not possible",balance,amount);
        } else {
            balance = balance + amount;
            LOGGER.info("accountNumber {} -->new balance is {}. amount:{}",accountNumber, balance,amount);
        }
        }
        catch (InsufficientFundsException exception){
            LOGGER.error("wrong amount: {} exception {}",amount,exception.getMessage());
        }
    }
    public double withdraw(double amount){
        try {
            if (amount > balance){
                throw new InsufficientFundsException("withdraw not possible",balance,amount);
            } else {
                balance = balance - amount;
                LOGGER.info("accountNumber {}--> new balance is {}. amount{}",accountNumber, balance,amount);
            }
        }
        catch (InsufficientFundsException exception){
            LOGGER.error("wrong amount: {} exception {}",amount,exception.getMessage());
        }
        return 0;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
