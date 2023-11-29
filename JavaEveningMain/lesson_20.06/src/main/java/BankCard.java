import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Getter
public class BankCard {
    private int cvv;
    private Date expDate;
    private String holderName;
    private String getHolderSurname;
    private CurrencyCode currencyCode;
}

class Test1{

    private static void statusChecker(List<Security> list){

    }
    public static void main(String[] args) {
        List<BankCard> bankCard = new ArrayList<>();
        for (int i = 0; i < bankCard.size(); i++) {
            if (bankCard.get(i).getCurrencyCode() == CurrencyCode.USD) {
                System.out.println("Операция может быть ощуствеленная только в 'EUR'");
            } else if (bankCard.get(i).getExpDate() == new Date("21-05-2025")) {
                System.out.println("Вашу карту нужно продлить");
            }
        }
    }
}

