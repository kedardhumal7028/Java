class ThreadDemo10
{
	public static void main(String a[])
	{
		System.out.println("Inside Main Method");
		
		System.out.println("Name of current thread is : "+Thread.currentThread().getName());

		System.out.println("Priority of current thread is : "+Thread.currentThread().getPriority());

	}
}