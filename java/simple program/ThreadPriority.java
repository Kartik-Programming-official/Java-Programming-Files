class ThreadPriority{
	public static void main(String[]args){
		Thread t1= new Thread(new MyThread(),"Thread 1");
		Thread t2= new Thread(new MyThread(),"Thread 2");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}
	static class MyThread implements Runnable{
		@Override
		public void run(){
			for(int i=0;i<5;i++){
				System.out.println(Thread.currentThread().getName()+":"+i);
				try{
					Thread.sleep(500);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	}
}