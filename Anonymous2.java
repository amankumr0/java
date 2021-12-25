class MyGenerics<T1,T2>{
    private int val = 5;
    private int val1;
    private T1 t1;
    private T2 t2;

    public MyGenerics(int val1,T1 t1, T2 t2){
    this.val1 = val1;
    this.t1 = t1;
    this.t2= t2;
        }

        public int getVal(){
         return val;
        }
    
        public void setVal(int val){
            this.val = val1;
        }
    
        public T1 getT1(){
            return t1;
        }
        public void setT1(T1 t1){
            this.t1=t1;
        }

        public T2 getT2(){
            return t2;
        }

        public void setT2(T2 t2){
            this.t2=t2;
        }


}


public class Anonymous2 {
 public static void main(String[] args) {
MyGenerics<String,Integer> raman = new MyGenerics(80,"This is Contructor",800);
int j = raman.getVal();
int v = raman.getT2();
String str = raman.getT1();
int g = raman.val;


// String nm = raman.t1;
System.out.println(v + "    " + str + "       " + j);
// System.out.println(g + "  " + nm);  
 }   
}
