package com.chandrikabijore;

public class J_Basic_0003_AreaOfTriangle
{
    public static void main(String[] args) 
    {
        double area, a, b, c, s;

        a = 8;
        b = 6;
        c = 10;
        s = a + b + c / 2;

        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of Triangle is : " + area);
    }
}


