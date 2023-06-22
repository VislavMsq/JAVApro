package task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.Objects;

/*
 - класс Клиент
    - имя
    - возраст
    - номер паспорта
    - лист банковских карт
 */
@Getter
@Setter
@AllArgsConstructor
public class Client implements Comparable<Client>{
    private String name;
    private Integer age;
    private String numberPassport;
    private List<BankCard> bankCards;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && Objects.equals(name, client.name) && Objects.equals(numberPassport, client.numberPassport) && Objects.equals(bankCards, client.bankCards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, numberPassport, bankCards);
    }

    @Override
    public int compareTo(Client o) {
        return this.numberPassport.compareTo(o.numberPassport); // сравнили строки поля numberPassport
    }
}
