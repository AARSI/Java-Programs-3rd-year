
class ThreadA implements Runnable {
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("Thread a started...");
		try{Thread.sleep(500);}
		catch(InterruptedException e)
		{System.out.println(e);
		}
		}
	}

}
