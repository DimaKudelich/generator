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
}
