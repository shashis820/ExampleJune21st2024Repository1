package com.sgtest.AssignMethods;
class Integer2DDemo
{
    void int_3_4(int x[][])
    {
        for(int i=0;i<x.length;i++)
        {
            if((i==x.length-2)||(i==(x.length-1)))
            {
                for(int j=0;j<x[i].length;j++){
                    System.out.print(x[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
public class Integer2DArray {
    public static void main(String[] args) {
        System.out.println("Third and Fourth Row of 2D Array :");
        Integer2DDemo d1=new Integer2DDemo();
        d1.int_3_4(new int[][]{{100,200,300,400},{500,600,700,800},{900,1000,2000,3000},{4000,5000,6000,7000}});
    }
}
