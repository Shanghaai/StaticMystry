package com.org.sahil.StaticConcepts;

class A 
{
	static int i=10;
    public static void display() 
    {
        System.out.println("Inside static method of superclass");
    }
}

class B extends A
{
    public void show() 
    {
    	System.out.println("inside show method of B class");
        //display();
    }

    public static void display() 
    {
        System.out.println("Inside static method of B class");
    }
}

class Test {
    public static void main(String[] args) 
    {
        B b = new B();
        b.display();
        //b.show();

        A a = new A();
        a.display();
        System.out.println(a.i);
    }
}