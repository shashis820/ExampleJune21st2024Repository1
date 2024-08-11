package com.sgtest.AssignMethods;
class TableDemo
{
    void alltables()
    {
        for(int i=1;i<=20;i++)
        {
            for(int j=1;j<=10;j++)
            {
                String str=(i +"*"+j +"="+(i*j));
                System.out.println(str);
            }
            System.out.println("**********");
        }
    }
}
public class AllTable {
    public static void main(String[] args) {
        TableDemo p1=new TableDemo();
        p1.alltables();
    }
}
