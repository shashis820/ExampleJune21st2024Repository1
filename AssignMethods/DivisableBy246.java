package com.sgtest.AssignMethods;
class DivisableDemo
{
    void num()
    {
        int count=0;
        for(int i=200;i<=400;i++)
        {
            if((i%2==0)||(i%4==0)||(i%6==0))
            {
                count++;
            }
        }
        System.out.println("Count of number Divisible by 2,4,6 :"+count);
    }
}

public class DivisableBy246 {
    public static void main(String[] args) {
        DivisableDemo v1=new DivisableDemo();
        v1.num();
    }
}
