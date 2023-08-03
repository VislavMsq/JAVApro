package onlineShopWithDelivery;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class Shop {
    private List<Client> clients;
    private List<Product> products;

    public Shop() {
        this.clients = new ArrayList<>();
        this.products = new ArrayList<>();
    }

    public List<Product> available() {
        return this.products.stream()
                .filter(el -> el.getQuantity() > 0)
                .toList();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }

    public void optionalShow() {
        // https://www.examclouds.com/ru/java/java-core-russian/lesson7-tasks
    }
}

//enum Category{
//    CLIENT,
//    PRODUCT
//}
