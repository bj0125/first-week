package com.company;

public class Main {

    public static void main(String[] args) {
    	int a=3,b=5;
	/*int a=1,b=2,c;
	c=a;
	a=b;
	b=c;
    a=a+b;//a=3+5=8
    b=a-b;//b=8-5=3
    a=a-b;//a=8-5=3*/
	a=a^b;//a=3^5
	b=a^b;//b=3^5^5=3
	a=a^b;//a=3^5^3=5
	System.out.print("a="+a+",b="+b);
    }
}
