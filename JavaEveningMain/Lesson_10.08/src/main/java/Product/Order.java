package Product;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Order {
    public void setStatus(Status status) {
        this.status = status;
    }

    private int id;
    private String customerName;
    private List<Product> listProd = new ArrayList<>();
    private Status status;

    public Order(int id, String customerName, Status status) {
        this.id = id;
        this.customerName = customerName;
        this.status = status;
    }

    public Order(int id, String customerName, List<Product> listProd, Status status) {
        this.id = id;
        this.customerName = customerName;
        this.listProd = listProd;
        this.status = status;
    }

    public void addProduct(Product product, int quantity) {
        product.decreaseQuantity(quantity);
        listProd.add(new Product(product.getId(), product.getName(), product.getPrice(), quantity));
    }

    public int buscketCount() {
        int count = 0;
        for (Product product : listProd) {
            count += product.getAvailableQuantity();
        }
        return count;
    }

    public void changeStatus(String newStatus) {
        switch (newStatus.toUpperCase()) {
            case "NEW" -> {
                status = Status.NEW;
                return;
            }
            case "PROCESSING" -> {
                status = Status.PROCESSING;
                return;
            }
            case "SEND" -> {
                status = Status.SEND;
                return;
            }

            case "DELIVERED" -> {
                status = Status.DELIVERED;
                return;
            }
        }
        throw new UnrealStatusException("Status %s not founded".formatted(newStatus));
    }

    public void clear() {
        listProd.clear();
    }
}
