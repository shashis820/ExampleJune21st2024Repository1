package com.sgtest.AssignMethods;
class SumSquareDemo
{
    void  Square()
    {
        int sum=0;
        for(int i=1;i<=10;i++) {
            sum = sum + i * i;
        }
                System.out.println("Sum of Numbers:"+sum);
            }
        }
public class SumSquare {
    public static void main(String[] args) {
        SumSquareDemo o = new SumSquareDemo();
        o.Square();
    }
}
