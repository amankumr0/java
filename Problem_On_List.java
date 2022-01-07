public class Problem_On_List {
    public static void main(String[] args) {
        MyLinkedList mll = new MyLinkedList();
        mll.add(1);
        System.out.print("Print ------ >" + "\t");
        mll.print();
        System.out.println("Size ----> " + mll.sizeOf());
        System.out.println("=====================================================");

        mll.print();
        mll.count();
    }
}
