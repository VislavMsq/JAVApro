package holidaysTask;

public class HardTask {
    //   medium
//     cipherCaesar(string "ABC", shift 3) -> "DEF" | A-Z 65-90 a-z 97-122
//     зсув робиться по таблиці ASCII
//     якщо ми дійшли до Zz то повертаэмось в початок Aa | (Y, 3) -> B
    public static void main(String[] args) {
        String str = "Hello Bogdan";

        String coded = cipherCaesar(str,5);
        System.out.println(coded);
        System.out.println(cipherCaesar(coded, -5));
    }

    public static String cipherCaesar(String str, int shift) {
        char[] charArray = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : charArray) {
            if (Character.toString(c).matches("\\W")) {
                stringBuilder.append(c);
            } else {
                if (Character.toString(c).matches("[A-Z]")) {
                    int e = (int) c;
                    e += shift;
                    if (e > 90) {
                        e -= 25;
                    }
                    stringBuilder.append((char) e);
                } else {
                    int e = (int) c;
                    e += shift;
                    if (e > 122) {
                        e -= 25;
                    }
                    stringBuilder.append((char) e);
                }
            }
        }
        return stringBuilder.toString();
    }
}
