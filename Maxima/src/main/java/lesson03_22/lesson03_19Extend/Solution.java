package lesson03_22.lesson03_19Extend;

import lombok.extern.slf4j.Slf4j;

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

@Slf4j
class MyThread extends Thread {

    private StringBuilder sb;

    public MyThread(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        synchronized (sb) {
            for (int i = 0; i < 100; i++) {

                log.info("It is sout from Thread: " + sb);

            }
            sb.setCharAt(0, (char) (sb.charAt(0) + 1));
        }
    }
}
 