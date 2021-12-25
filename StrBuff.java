public class StrBuff {
    public static void main(String[] args) {
        StringBuffer S1 = new StringBuffer("Aman");
        StringBuffer S2 = new StringBuffer(" Thakur");
        System.out.println(S1.append(S2));
        System.out.println(S1.insert(2, S2));
        // System.out.printl);
        S1.setLength(10);
        System.out.println(S1);
        S1.setCharAt(0, 'z');
        System.out.println(S1);

    }
    
}
