class ForCountOddNumber
{
	public static void main(String args[])
	{
		int count=0;
		for(int i=250;i<=500;i++)
		{
			if (i%3==0)
			{
				count=count+1;
			}
		}
		System.out.println(count);
	}
}
		
