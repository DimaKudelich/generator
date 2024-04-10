package payload.generator.dataclasses;

import java.util.ArrayList;

public class DepositAccount {
    public String currency;
    public long openDate;
    public long endDate;
    public String accountNumber;
    public int productCode;
    public String productName;
    public double balanceAmount;
    public double interestRate;
    public String contractNumber;
    public boolean displayOnMain;
    public boolean displayBalance;
    public String ibanNum;
    public String imageUrl;
    public int sortIndex;
    public int contractType;
    public ArrayList<String> availableActions;
    public String contractNumberHash;
    public double accruedInterest;

    public DepositAccount(
            String currency,
            long openDate,
            long endDate,
            String accountNumber,
            int productCode,
            String productName,
            double balanceAmount,
            double interestRate,
            String contractNumber,
            boolean displayOnMain,
            boolean displayBalance,
            String ibanNum,
            String imageUrl,
            int sortIndex,
            int contractType,
            ArrayList<String> availableActions,
            String contractNumberHash,
            double accruedInterest
    ) {
        this.currency = currency;
        this.openDate = openDate;
        this.endDate = endDate;
        this.accountNumber = accountNumber;
        this.productCode = productCode;
        this.productName = productName;
        this.balanceAmount = balanceAmount;
        this.interestRate = interestRate;
        this.contractNumber = contractNumber;
        this.displayOnMain = displayOnMain;
        this.displayBalance = displayBalance;
        this.ibanNum = ibanNum;
        this.imageUrl = imageUrl;
        this.sortIndex = sortIndex;
        this.contractType = contractType;
        this.availableActions = availableActions;
        this.contractNumberHash = contractNumberHash;
        this.accruedInterest = accruedInterest;
    }
}
