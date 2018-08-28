/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */
/**
* @author AnkitMittal
* Copyright (c), AnkitMittal .
* All Contents are copyrighted and must not be reproduced in any form.
    CountDownLatchCustom wait until one or more threads completes certain operation.
    A CountDownLatch is initialized with a given count .
    count specifies the number of events that must occur before
    latch is released.
    Every time a event happens count is reduced by 1. Once count
    reaches 0 latch is released.
*/
class CountDownLatchCustom{
 
    private int count;
    /**
     * CountDownLatch is initialized with given count.
     * count specifies the number of events that must occur
     * before latch is released.
     */
    public CountDownLatchCustom(int count) {
           this.count=count;
    }
 
    /**
     * Causes the current thread to wait until  one of the following things happens-
                  - latch count has down to reached 0, or
                  - unless the thread is interrupted.
     */
    public synchronized void await() throws InterruptedException {
           //If count is greater than 0, thread waits.
           if(count>0)
                  this.wait();
    }
 
    /**
     *  Reduces latch count by 1.
     *  If count reaches 0, all waiting threads are released.
     */
    public synchronized void countDown() {
           //decrement the count by 1.
           count--;
           
           //If count is equal to 0, notify all waiting threads.
           if(count == 0)
                  this.notifyAll();
    }
    
}
