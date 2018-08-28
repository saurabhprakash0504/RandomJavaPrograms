
public class ProducerConsumer {

	public static void main(String[] args) {
		CustomBlockingQueue cus = new CustomBlockingQueue();
		ProducerConsumer p = new ProducerConsumer();
		p.new Producer(cus).start();
		p.new Consumer(cus).start();
	}

	class Producer extends Thread {
		CustomBlockingQueue cus;

		Producer(CustomBlockingQueue cus) {
			this.cus = cus;
		}

		public void run() {
			for (;;) {
				synchronized (cus) {
					try {
						System.out.println("producing ???? ");
						cus.put(new Object());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	}

	class Consumer extends Thread {
		CustomBlockingQueue cus;

		Consumer(CustomBlockingQueue cus) {
			this.cus = cus;
		}

		public void run() {
			for (;;) {
				synchronized (cus) {
					try {
						System.out.println("consuming >> "+cus.get());;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}

	}
}
