package enums;

public class Main {
    public static void main(String[] args) {
        Security s1 = new Security("Nick", Permission.A);
        Security s2 = new Security("John", Permission.B);
        Security s3 = new Security("Bill", Permission.C);
        Security s4 = new Security("Den", Permission.D);

        Security[] securities = {s1, s2, s3, s4};

        for (Security s : securities){
            if (s.getPermission() == Permission.A){
                System.out.println("***");
            }
        }
    }
}
