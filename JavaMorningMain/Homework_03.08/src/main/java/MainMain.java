public class MainMain {
    public static void main(String[] args) {
        System.out.println(Email.parse("hwEmail.txt"));
        System.out.println(URL.findAndReplace("https://", "http://", "hwURL.txt"));
        System.out.println(Product.getMore("hwProduct.txt", 10));
    }
}
