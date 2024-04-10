package payload.generator.dataclasses;

import java.util.ArrayList;

public class Card {
    public String cardNumberMasked;
    public String cardHash;
    public String cardStatus;
    public long expireDate;
    public String owner;
    public boolean isVirtual;
    public boolean displayOnMain;
    public boolean displayBalance;
    public int sortIndex;
    public double balance;
    public boolean isMainPayProduct;
    public String currency;
    public String stateSignature;
    public boolean isAdditional;
    public String cardDepartmentName;
    public String cardDepartmentAddress;
    public int cardId;
    public boolean isCorpoCard;
    public String paySystemName;
    public int productCode;
    public String name;
    public String imageUrl;
    public String komplatStatus;
    public ArrayList<String> cardAvailableActions;
    public String contractNumber;

    public Card(
            String cardNumberMasked,
            String cardHash,
            String cardStatus,
            long expireDate,
            String owner,
            boolean isVirtual,
            boolean displayOnMain,
            boolean displayBalance,
            int sortIndex,
            double balance,
            boolean isMainPayProduct,
            String currency,
            String stateSignature,
            boolean isAdditional,
            String cardDepartmentName,
            String cardDepartmentAddress,
            int cardId, boolean isCorpoCard,
            String paySystemName,
            int productCode,
            String name,
            String imageUrl,
            String komplatStatus,
            ArrayList<String> cardAvailableActions,
            String contractNumber
    ) {
        this.cardNumberMasked = cardNumberMasked;
        this.cardHash = cardHash;
        this.cardStatus = cardStatus;
        this.expireDate = expireDate;
        this.owner = owner;
        this.isVirtual = isVirtual;
        this.displayOnMain = displayOnMain;
        this.displayBalance = displayBalance;
        this.sortIndex = sortIndex;
        this.balance = balance;
        this.isMainPayProduct = isMainPayProduct;
        this.currency = currency;
        this.stateSignature = stateSignature;
        this.isAdditional = isAdditional;
        this.cardDepartmentName = cardDepartmentName;
        this.cardDepartmentAddress = cardDepartmentAddress;
        this.cardId = cardId;
        this.isCorpoCard = isCorpoCard;
        this.paySystemName = paySystemName;
        this.productCode = productCode;
        this.name = name;
        this.imageUrl = imageUrl;
        this.komplatStatus = komplatStatus;
        this.cardAvailableActions = cardAvailableActions;
        this.contractNumber = contractNumber;
    }
}
