public class Re6 {
    public static void main(String[] args) {
        String s = "A regular expression (RegEx22 in Java) is  a pattern for searching for a string in text. In Java, \" +\n" +
                "                \"the initial     representation@gmail.com of this pattern is always a string";
        s = s.replaceAll(" {2,}"," ");
        System.out.println(s);
    }
}
