package com.chandrika;

public class J_Basic_0007_Java_Comments
{
    // Simple example of comments

    // Your program begins with a call to main().
    // this is single line comment

    public static void main( String args[ ] )
    {
        System.out.println("Java Programming Examples");
    /*
        This is multiline comment
        with multiple lines
    */

    }
}

//=> Types of Comments in Java
//   There are three types of Java comments:
//
//1. Single-line Comments : As the name suggests, it is for the beginners and is in a single line Java comments.
//
//=> Syntax -   // A comment is written here
//
//class Scomment
//{
//    public static void main(String args[])
//    {
//        // Single line comment here
//        System.out.println("Single line comment above");
//    }
//}
//---------------------
//2. Multi-line Comments : Multi-line Java comments are used wherever we need to explain a procedure, single-line comments become tedious in this case as we will need to write ‘//’ at the start of every line.
//
//=> Syntax-
//
///*Comment starts
//continues
//continues
//.
//.
//.
//Comment ends*/
//
//class Scomment
//{
//    public static void main(String args[])
//    {
//        System.out.println("Multi line comments below");
//        /*Comment line 1
//          Comment line 2
//          Comment line 3*/
//    }
//}
//---------------------
//3. Documentation Comments : This kind of Java comments is utilized by large code for a programming bundle since it produces a documentation page for reference, which can be utilized for getting data about strategies, its parameters, and so forth.
//
//=> Syntax-
//
///**Comment start
// *
// *tags are used in order to specify a parameter
// *or method or heading
// *HTML tags can also be used
// *such as <h1>
// *
// *comment ends*/
//=> Example –
//
//package JavaCommentsDemo;
////Program to illustrate comments in Java
///**
// * <h1>Find sum of two numbers!</h1>
// * FindSum program finds the sum
// *and gives the output on
// *the screen.
// *
// * @author  dataflair
// */
//public class FindSum
//{
//    /**
//     * Method to find average
//     * @param numA- This is the first parameter to calculateSum method
//     * @param numB - This is the second parameter to calculateSum method
//     */
//    int numA;
//    int numB;
//    FindSum(int numA,int numB)
//    {
//        this.numA=numA;
//        this.numB=numB;
//    }
//    void calculateSum()
//    {
//        System.out.println("Sum of two numbers is "+(numA+numB));
//    }
//    static class Test
//    {
//        public static void main(String args[])
//        {
//            FindSum obj=new FindSum(10,20);
//            obj.calculateSum();
//        }
//    }
//}