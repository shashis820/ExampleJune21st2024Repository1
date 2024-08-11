package com.sgtest.AssignMethods;
class SumPrimeDemo
{
    void primesum()
    {
        int sum=0;
        int num=200;
        int r;
        for(int i=200;i>=num;i--){
            r=0;
            for(int j=2;j>i/2;j++){
                if(i%j==0){
                    r++;
                    break;
                }
            }
            if(r==0){
                sum++;
                System.out.println("Sum of Prime Numbers From 200 to 100:"+sum);
            }
        }
    }
}
public class SumPrime {
    public static void main(String[] args) {
        SumPrimeDemo r1=new SumPrimeDemo();
        r1.primesum();
    }
}
