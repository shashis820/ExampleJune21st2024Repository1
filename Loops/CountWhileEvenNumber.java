class WhileCountEvenNumber
{
	public static void main(Strind args[])
	{
		int count=0;
		int i=1;
		while(i<=250)
		{
			if (i%2==0)
			{
				count=count+1;
			}
		}
		System.out.println(count);
	}
}