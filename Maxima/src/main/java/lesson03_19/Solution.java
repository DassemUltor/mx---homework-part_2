package lesson03_19;

public class Solution {


    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("a");

        MyThread firstThread = new MyThread(sb);
        MyThread secondThread = new MyThread(sb);
        MyThread thirdThread = new MyThread(sb);


        firstThread.start();
        secondThread.start();
        thirdThread.start();


    }
}

class MyThread extends Thread {

    private StringBuilder sb;

    public MyThread(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        synchronized (sb) {
            for (int i = 0; i < 100; i++) {
                System.out.println("It is sout from Thread: " + sb);
            }
        }
        sb.setCharAt(0, (char) (sb.charAt(0) + 1));
    }
}
 