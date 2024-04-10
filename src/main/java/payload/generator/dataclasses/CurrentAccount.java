package payload.generator.dataclasses;

import java.util.ArrayList;

public class CurrentAccount {
    public String currency;
    public long openDate;
    public String accountNumber;
    public int productCode;
    public String productName;
    public double balanceAmount;
    public double interestRate;
    public String contractNumber;
    public boolean displayOnMain;
    public boolean displayBalance;
    public boolean isMainPayProduct;
    public String ibanNum;
    public String imageUrl;
    public int sortIndex;
    public int contractType;
    public ArrayList<String> availableActions;
    public String contractNumberHash;
    public double accruedInterest;

    public CurrentAccount(
            String currency,
            long openDate,
            String accountNumber,
            int productCode,
            String productName,
            double balanceAmount,
            double interestRate,
            String contractNumber,
            boolean displayOnMain,
            boolean displayBalance,
            boolean isMainPayProduct,
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
        this.accountNumber = accountNumber;
        this.productCode = productCode;
        this.productName = productName;
        this.balanceAmount = balanceAmount;
        this.interestRate = interestRate;
        this.contractNumber = contractNumber;
        this.displayOnMain = displayOnMain;
        this.displayBalance = displayBalance;
        this.isMainPayProduct = isMainPayProduct;
        this.ibanNum = ibanNum;
        this.imageUrl = imageUrl;
        this.sortIndex = sortIndex;
        this.contractType = contractType;
        this.availableActions = availableActions;
        this.contractNumberHash = contractNumberHash;
        this.accruedInterest = accruedInterest;
    }
}
