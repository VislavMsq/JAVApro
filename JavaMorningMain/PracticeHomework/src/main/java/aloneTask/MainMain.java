package aloneTask;

public class MainMain {
    public static void main(String[] args) {
        Phone phone = new Phone(1234567,"Iphone 13",240);
        Phone phone2 = new Phone(3456792,"Iphone 14",230);
        Phone phone3 = new Phone(9672534,"Iphone 14pro",290);

        System.out.println(phone);
        System.out.println(phone2);
        System.out.println(phone3);

        phone.receiveCall("John");
        System.out.println(phone.getNumber());
    }
}
