class ConuntForEvenNumber
{
	public static void main(String args[])
	{
		int count=0;
		for(int i=1;i<=250;i++)
		{
			if (i%2==0)
			{
				count=count+1;
			}
		}
		System.out.println(count);
	}
}
		