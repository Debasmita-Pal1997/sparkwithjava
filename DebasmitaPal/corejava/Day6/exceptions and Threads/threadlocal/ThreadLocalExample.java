package com.demo.threadsdemo.threadlocal;

 class TheadLocalDemo implements Runnable {

    private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

    @Override
    public void run() {
        threadLocal.set( (int) (Math.random() * 100D) );

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        System.out.println(threadLocal.get());
    }
}

public class ThreadLocalExample {

    public static void main(String[] args) {
    	TheadLocalDemo sharedRunnableInstance = new TheadLocalDemo();

        Thread thread1 = new Thread(sharedRunnableInstance);
        Thread thread2 = new Thread(sharedRunnableInstance);

        thread1.start();
        thread2.start();

        try {
			thread1.join();
			  thread2.join(); //wait for thread 2 to terminate
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //wait for thread 1 to terminate
      
    }

}