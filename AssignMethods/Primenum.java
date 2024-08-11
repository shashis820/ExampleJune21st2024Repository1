package com.sgtest.AssignMethods;
class PrimeNumDemo
{
    void primenum()
    {
        int num=50;
        int r;
        for(int i=1;i<=num;i++){
            r=0;
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                    r++;
                    break;
                }
            }
            if(r==0){
                System.out.println(i);
            }
        }
    }
}

public class Primenum {
    public static void main(String[] args) {
        System.out.println("Prime Number from 1 to 50:");
        PrimeNumDemo q1=new PrimeNumDemo();
        q1.primenum();

    }
}
