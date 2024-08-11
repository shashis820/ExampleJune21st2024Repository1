class ForSumOfOddNumber
{
	public static void main(String args[])
	{
		int sum=0;
		for (int i=1;i<=500;i++)
		{
			if (i%2!=0)
			sum+=i;
		}
		System.out.println("The Sum Of Odd Number "+sum);
	}
}
