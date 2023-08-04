import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Getter
@ToString
public class Storage {
    private Map<Client, Integer> clientIntegerMap;

    public Storage(List<Client> clientList) {
        this.clientIntegerMap = new HashMap<>();
        for (Client client : clientList) {
            this.clientIntegerMap.put(client, client.getBalance());
        }
    }

    public List<Client> statusCard(Status status) {
        return this.clientIntegerMap
                .keySet().stream()
                .filter(el -> el.getBankCard().getStatus() == status)
                .toList();
    }

    public void groupClientBalance(Integer moreThan) {
        Map<Boolean, List<Client>> groupedMap = this.clientIntegerMap.entrySet()
                .stream()
                .collect(Collectors.partitioningBy(entry -> entry.getValue() > moreThan,

                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
    }

    public double avgBalanceClients() {
        return this.clientIntegerMap.values().stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }

    public void showClientAndNUmberCard() {
        this.clientIntegerMap.keySet()
                .forEach(el -> System.out.println(el.getFirstName() + " " + el.getBankCard().getNumber()));
    }

    private boolean isEndDate(String cardDate) {
        LocalDate date1 = LocalDate.now();

        String strY = Integer.toString(date1.getYear()).substring(2);
        String strM = String.format("%02d", date1.getMonth().getValue());
        String strYM = strY + strM;

        String sYM = cardDate.substring(2) + cardDate.substring(0, 2);

        return strYM.compareTo(sYM) >= 0;
    }

    public List<Client> showEndDateCard() {
        List<Client> endDate = new ArrayList<>();
        for (Client client : clientIntegerMap.keySet()) {
            String cardDate = client.getBankCard().getMM_YY();
            if (isEndDate(cardDate)) {
                endDate.add(client);
            }
        }
        return endDate;
    }

    public List<Client> sortBalance() {
        return this.clientIntegerMap.keySet().stream()
                .sorted(Comparator.comparing(Client::getBalance).reversed())
                .toList();
    }

    public Map<Boolean, List<Client>> groupByDateCard() {
        return this.clientIntegerMap.keySet().stream()
                .collect(Collectors.partitioningBy(el -> isEndDate(el.getBankCard().getMM_YY())));
    }
}
