/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */
/**
 * @author AnkitMittal Copyright (c), AnkitMittal . All Contents are copyrighted
 *         and must not be reproduced in any form. 2 or more threads wait for
 *         each other to reach a common barrier point. When all threads have
 *         reached common barrier point (i.e. when all threads have called
 *         await() method) > - All waiting threads are released, and - Event can
 *         be triggered as well.
 * 
 */
class CyclicBarrierCustom {

	int initialParties; // total parties
	int partiesAwait; // parties yet to arrive
	Runnable cyclicBarrrierEvent;

	/**
	 * New CyclicBarrier is created where parties number of thread wait for each
	 * other to reach common barrier point, when all threads have reached common
	 * barrier point, parties number of waiting threads are released and
	 * barrierAction (event) is triggered.
	 */
	public CyclicBarrierCustom(int parties, Runnable cyclicBarrrierEvent) {
		initialParties = parties;
		partiesAwait = parties;
		this.cyclicBarrrierEvent = cyclicBarrrierEvent;
	}

	/**
	 * If the current thread is not the last to arrive(i.e. call await() method)
	 * then it waits until one of the following things happens - - The last thread
	 * to call arrive(i,.e. call await() method), or - Some other thread interrupts
	 * the current thread, or - Some other thread interrupts one of the other
	 * waiting threads, or - Some other thread times out while waiting for barrier,
	 * or - Some other thread invokes reset() method on this cyclicBarrier.
	 */
	public synchronized void await() throws InterruptedException {
		// decrements awaiting parties by 1.
		partiesAwait--;

		// If the current thread is not the last to arrive, thread will wait.
		if (partiesAwait > 0) {
			this.wait();
		}
		/*
		 * If the current thread is last to arrive, notify all waiting threads, and
		 * launch event
		 */
		else {
			/*
			 * All parties have arrive, make partiesAwait equal to initialParties, so that
			 * CyclicBarrier could become cyclic.
			 */
			partiesAwait = initialParties;

			notifyAll(); // notify all waiting threads

			cyclicBarrrierEvent.run(); // launch event
		}
	}
}