class Stack{
    private int tos;
    private int stack[];
    Stack(int size){
        stack = new int[size];
        tos = -1;
    } 
    //push a item onto the stack
    void push(int item){
        if(tos==stack.length-1)
            System.out.println("Satck is full");
        else
            stack[++tos] =item;
    }
    int pop(){
         if(tos<0){
             System.out.println("Stack underflow");
             return 0;
         }
         else
         return stack[tos--];
        }
    }
public class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack(5);
        Stack myStack2 = new Stack(8);
        for(int i=0;i<5;i++) myStack1.push(i);
        for(int j=0;j<8;j++) myStack2.push(j);
        System.out.println("Stack in myStack1 is:");
        for(int i=0;i<5;i++) System.out.println(myStack1.pop());
        System.out.println("Stack in my stack2 is:");
        for(int i=0;i<9;i++) System.out.println(myStack2.pop());
        }
}
