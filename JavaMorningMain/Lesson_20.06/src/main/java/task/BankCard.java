package task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import task.enums.Currency;
import task.enums.PaymentSystem;
import task.enums.Status;
import java.text.*;
import java.util.Date;

/*
 - класс Банковская карта
    - срок действия
    - статус
    - платежная система
    - остаток на счету
    - валюта
 */

@Getter
@Setter
@ToString
public class BankCard {
    private String name;
    private IBAN CardIBAN;                   // отличная черта для всех карт
    private Date validity;
    private Status status;                  // enum status
    private PaymentSystem paymentSystem;    // enum paymentSystem
    private double accountBalance;
    private Currency currency;              // enum currency

    /**
     * Метод преобразования строки в дату
     * @param date вводный параметр стринговой даты типа yyyy-MM-dd
     * @return new Date
     */
    public Date parseDate(String date) {
        try { // блок кода try-catch ожитает Exception для ее обработки
            //                                              конвертируем строку в дату-время
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {        // catch - ловит ошибку
            return null;
        }
    }

    // 2035-12-17

    public BankCard(String validity, Status status, PaymentSystem paymentSystem, double accountBalance, Currency currency) {
        this.validity = parseDate(validity);
        this.status = status;
        this.paymentSystem = paymentSystem;
        this.accountBalance = accountBalance;
        this.currency = currency;
        this.CardIBAN = new IBAN();
    }

//    public void update(BankCard oldCard, BankCard newCard){
//        if (newCard.g)
//    }

    /*
    public boolean pay(Storage storage, String name, String endDate, Double money) {
        Date endDateP = parseDate(endDate);
        if (!(this.name.equals(name) && this.endDate.equals(endDateP))) {
            List<BankCard> bankCards = storage.findCard(name, endDateP);
            for (BankCard bankCard : bankCards) {
                // {bohdan, vladislav}
                if (!this.equals(bankCard)) {
                    if (this.account >= money) {
                        this.account -= money; ||  this.account = this.account - money;
                        bankCard.account += money;
                    } else {
                        System.out.println("not anought money");
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }


    BC bc = new BC()
    bc.pay

     */



}

