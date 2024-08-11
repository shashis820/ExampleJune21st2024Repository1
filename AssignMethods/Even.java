package com.sgtest.AssignMethods;
class EvenNoDemo
{
    void evenNo()
    {
        int count=0;
        for(int i=1;i<=500;i++)
        {
                if(i%2==0)
            count++;
        }
        System.out.println(count);
    }
}
public class Even {
    public static void main(String[] args) {
        EvenNoDemo o=new EvenNoDemo();
        o.evenNo();
    }
}
