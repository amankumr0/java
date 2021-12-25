public class StrBuf {
    public static void main(String[] args) {
        StringBuffer S1 = new StringBuffer("My name is aman");
        StringBuffer S2 = new StringBuffer("  My title is Thakur");
        S1.append(S2);
        String name = "Hello guys blog ho raha h";
        System.out.println(S1);
        System.out.println(S1);
        S1.replace(5, 10, name);
        System.out.println(S1);
    }
}
