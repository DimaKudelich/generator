package payload.generator.dataclasses;

public class OverdraftAccount {
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
    public String imageUrl;
    public int sortIndex;
    public int contractType;
    public double overdraftLimit;
    public String accountId;
    public String contractNumberHash;
    public String overdraftAccountNumber;

    public OverdraftAccount(
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
            String imageUrl,
            int sortIndex,
            int contractType,
            double overdraftLimit,
            String accountId,
            String contractNumberHash,
            String overdraftAccountNumber
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
        this.imageUrl = imageUrl;
        this.sortIndex = sortIndex;
        this.contractType = contractType;
        this.overdraftLimit = overdraftLimit;
        this.accountId = accountId;
        this.contractNumberHash = contractNumberHash;
        this.overdraftAccountNumber = overdraftAccountNumber;
    }
}
