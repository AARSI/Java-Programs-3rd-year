class ThreadB implements Runnable {
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("Thread b started...");
		try{Thread.sleep(500);}
		catch(InterruptedException e)
		{System.out.println(e);
		}
		}
	}

}
