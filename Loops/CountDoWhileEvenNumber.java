class CountDoWhileEvenNumber
{
	public static void main(String args[])
	{
		int count=0;
		int i=1;
		do
		{
			if (i%2==0)
			{
				count=count+1;
			}
			i++;
		}while (i<=250);
		System.out.println(count);
	}
}