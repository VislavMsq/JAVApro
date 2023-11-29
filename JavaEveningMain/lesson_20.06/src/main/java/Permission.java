public enum Permission {
    TOP,
    HIGH,
    MEDIUM,
    LOW;


}



enum CurrencyCode{
    USD(SubLevel.A),
    EUR(SubLevel.C),
    RUB(SubLevel.C),
    CAD(SubLevel.B);

    private SubLevel subLevel;

    CurrencyCode(SubLevel subLevel) {
        this.subLevel = subLevel;
    }
}


class Security{
    private String name;
    private Permission permission;

    public Security(String name, Permission permission) {
        this.name = name;
        this.permission = permission;
    }
}

class Main{
    public static void main(String[] args) {
       Security p1 = new Security("Nik", Permission.MEDIUM);
       CurrencyCode[] currencyCodes;
    }
}

enum SubLevel{
    A,
    B,
    C;
}