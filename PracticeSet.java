class Myth extends Thread {
    public void run() {
        int j = 0;
        while (j < 100) {
            System.out.println("Good Morning");
            j++;
        }
    }
}

class Myth1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Welcome");
            i++;
        }
    }
}

public class PracticeSet {
    public static void main(String[] args) {
        Myth a = new Myth();
        Myth1 b = new Myth1();
        a.start();
        b.start();
    }

}
