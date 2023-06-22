package task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import task.enums.Currency;

import java.util.*;

/*
 - класс Хранилище
 - мапа которая хранит ---Клиент, ЛистКарт--- TreeMap
 * Add Read(валюта) Update Delete
 */
@Getter
@AllArgsConstructor
public class Storage {
    private final Map<Client, List<BankCard>> map;

    public Storage() {
//        Map<Client, List<BankCard>> map = new TreeMap<>();
        this.map = new TreeMap<>();
    }


    public boolean add(Client client) {
        if (client == null) {         // проверка на наличие
            return false;
        }
        if (this.map.containsKey(client)) {     // содержится ли клиент
            return false;                       // если зареган, то ему нельзя
        }
        this.map.putIfAbsent(client, client.getBankCards()); // putIfAbsent - если нет ключа, сделает действие, если нет, то ничего
        return true;
    }

    public void read(Currency currency) {

        // Storage -> <ClientId -> hashCode, Client >

        List<Client> list = new ArrayList<>();
        for (Map.Entry<Client, List<BankCard>> entry : this.map.entrySet()) {   // перебираем Map

//            entry.getValue().bc // -> Client || -> BankCards

            for (BankCard bc : entry.getValue()) {          // пребираем List со значениями
                if (bc.getCurrency().equals(currency)) {    // достаем currency с List и сравниваем с currency нашего Client
                    list.add(entry.getKey());              // если true - то добовляем клинта
                }
            }
        }
        System.out.println("Clients with " + currency + " ->\n" + list);
    }

    public void update(Client oldClient, Client newClient) {
        // возращаемое значение             get задает ключ, чтобы вернуть значение

        //            | name | passport | age
        // oldClient     a       111       18
        // newClient     -       222       21

        // если клиен не заполняет имя, т.е в поле остается пустым -> null
        // то оставляем старое значение
        // иначе устанавливаем через set... старое значение клиента, которое мы получили через get...
        if (newClient.getName() != null){
            oldClient.setName(newClient.getName());
        }
        if (newClient.getAge() != null){
            oldClient.setAge(newClient.getAge());
        }
        if (newClient.getNumberPassport() != null){
            oldClient.setNumberPassport(newClient.getNumberPassport());
        }
    }

    public void update(Client client, List<BankCard> bankCards) {
        client.setBankCards(bankCards);
    }

    // cl = Client("", "", BankCard bc)
    //      this.bc
    // cl.bc -> abstract List
    //


    // cl = Client("", "", List<BankCard>)
    //
    // cl.addCard(...)


}
