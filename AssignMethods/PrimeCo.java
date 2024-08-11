package com.sgtest.AssignMethods;
class PrimeCount
{
    void primenum()
    {
        int count=0;
        int num=100;
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
                count++;
                System.out.println("Count of Prime Numbers:"+count);
            }
        }
    }
}
public class PrimeCo {
    public static void main(String[] args) {
        PrimeCount t1=new PrimeCount();
        t1.primenum();
    }
}
