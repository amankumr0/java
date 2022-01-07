public class Problem_On_List {
    public static void main(String[] args) {
        MyLinkedList mll = new MyLinkedList();
        for(int i=0;i<10;i++){
            mll.add(i);
        }
       
        mll.print();
        mll.count();
        mll.delete(10);
        mll.print();
    }
}
