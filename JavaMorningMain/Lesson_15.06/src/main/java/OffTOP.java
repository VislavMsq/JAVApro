public class OffTOP {
    public static void main(String[] args) {
        int i = 0b00000011;
        int e = 0b00001010;
        int q = 0b00000010;

        System.out.println(i & e);

        int w = 0x000007e7;     // 16-я сисьтема записи
        int r = 0x0000a7e7;

        System.out.println(w & r);

    }
}
