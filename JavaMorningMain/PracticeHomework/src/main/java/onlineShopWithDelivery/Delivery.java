package onlineShopWithDelivery;

import lombok.Getter;
import lombok.ToString;

//            enum TypeDelivery
//            free - more > 50 -> free
//            basic - 1 $/km
//            premium - 2.5 $/km | more > 100 -> 1 $/km
@ToString

public class Delivery {
    private static final int basic = 1;
    private static final double prime = 2.5;

    public static double matchDelivery(Order order, int addressDelivery) {

//        if (order.getTypeDelivery().equals(TypeDelivery.BASIC)) {
//            if (order.getSum() >= 50) {
//                order.setTypeDelivery(TypeDelivery.FREE);
//                return 0;
//            } else {
//                return addressDelivery * Delivery.basic;
//            }
//        } else if (order.getTypeDelivery().equals(TypeDelivery.PREMIUM)) {
//            if (order.getSum()>= 200) {
//                order.setTypeDelivery(TypeDelivery.FREE);
//                return 0;
//            } else if (order.getSum() >= 100) {
//                return addressDelivery * Delivery.basic;
//            }
//        } else {
//            return addressDelivery * Delivery.prime;
//        }
//        return 0;

        switch (order.getTypeDelivery()) {
            case BASIC -> {
                double cost = order.getSum() < 50 ? addressDelivery * Delivery.basic : 0;
                if (cost == 0) {
                    order.setTypeDelivery(TypeDelivery.FREE);
                }
                return cost;
            }
            case PREMIUM -> {
                double cost = order.getSum() < 100 ? addressDelivery * Delivery.prime
                        : order.getSum() < 200 ? addressDelivery * Delivery.basic
                        : 0;
                if (cost == 0) {
                    order.setTypeDelivery(TypeDelivery.FREE);
                }
                return cost;
            }
        }
        return 0;
    }
}
