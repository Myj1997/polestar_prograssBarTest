package com.polestarhc.study;

public class IncreaseThreadTest implements Runnable{
    private INotification notification;

    public IncreaseThreadTest(INotification notification) {
        this.notification = notification;
    }

    @Override
    public void run() {
        System.out.println("IncreaseThreadTest.run");
        if (notification != null) {
            for (int i=0; i < 100; i++) {
                notification.notificationCalled();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
