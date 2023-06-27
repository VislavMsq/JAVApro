public class Test95 {
    public static void main(String[] args) {
        m2(Test95 :: getRef);
    }

    public static void getRef(){
        System.out.println("***");
        System.out.println("@@@");
    }

    public static void m2(Tern tern){
        System.out.println("*****");
        tern.get();
    }
}
@FunctionalInterface
interface Tern{
    void get();
}