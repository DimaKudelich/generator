package payload.generator.dataclasses;

import payload.generator.dataclasses.Card;

import java.util.ArrayList;

public class CardAccount {
    public String currency;
    public long openDate;
    public String accountNumber;
    public int productCode;
    public String productName;
    public String contractNumber;
    public ArrayList<Card> cards;
    public String ibanNum;
    public int contractType;
    public boolean isOverdraft;
    public ArrayList<String> availableActions;
    public String contractNumberHash;

    public CardAccount(
            String currency,
            long openDate,
            String accountNumber,
            int productCode,
            String productName,
            String contractNumber,
            ArrayList<Card> cards,
            String ibanNum,
            int contractType,
            boolean isOverdraft,
            ArrayList<String> availableActions,
            String contractNumberHash
    ) {
        this.currency = currency;
        this.openDate = openDate;
        this.accountNumber = accountNumber;
        this.productCode = productCode;
        this.productName = productName;
        this.contractNumber = contractNumber;
        this.cards = cards;
        this.ibanNum = ibanNum;
        this.contractType = contractType;
        this.isOverdraft = isOverdraft;
        this.availableActions = availableActions;
        this.contractNumberHash = contractNumberHash;
    }
}
