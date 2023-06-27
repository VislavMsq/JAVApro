public class Test {
    public static void main(String[] args) {
        m1((s)-> {
            System.out.println("***");
            System.out.println("$$$");
            System.out.println(s);
        });
    }
    public static void m1(Inter inter){
        System.out.println("@@@");
        inter.get("s");
    }
    @FunctionalInterface
    interface Inter{
        void get(String s);
    }
}
