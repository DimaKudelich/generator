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
}
