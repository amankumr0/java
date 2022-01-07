public class MyLinkedList {

    Node head;

    public void removeAtIndex(int Index){
        Node temp = head;
        int i=0;
        while(i<Index-1){
            temp=temp.next;
            i++;
        }
        temp.next = temp.next.next;

    }

    public int sizeOf() {
        Node temp = head;
        int siz = 0;
        while (temp != null) {
            temp = temp.next;
            siz++;
        }
        return siz;
    }

    public void count() {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        System.out.println(i);
    }

    public void add(int data) {
        Node toAdd = new Node(data);
        if (head == null) {
            head = toAdd;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = toAdd;
    }

    public void deletePos(int pos) {
        int l = 2;
        Node temp = head;
        while (l < pos) {
            temp = temp.next;
            l++;
        }
        temp.next = temp.next.next;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        try {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        } catch (NullPointerException e) {
            System.err.print(" Please add some value");
        }
        System.err.println("");
    }

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }

    }
}
