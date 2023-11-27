 //* ***IMPORTANT NOTES*** */

        //lambda expression can only be used with  FUNCTIONAL INTERFACE , interface is like a blue print of class it contains "abstract methods" and "static constants". 
        // and a "functional interface" is a interface that contains only one abstract method.
        // abstract method is a class which have only method declariation and arguments, no implementation 

        //JAVA is purely object oreinted programming language, so to bring benifts of functional programming we use Lambda expressions

        // in OOPS data is stored in form of -----> class and methods
        // in functional data is stored in formof ---> function and variables


        //Ananymos function, which does not have return type, no name, dont have access modifiers
        // lambda expression is ananymos function.
        
        //Lambda expression is supported from Java 8 onwards
        /*
         * Sample Lambda example: 
         * 
         * ()->{println("hello");};
         * 
         * when there is only one argument then no need to use () this bracket also
         * with argument we don't need to provdie data type
         * when writing single line ->{} in this, then no need to of {} also
         * but if there is a return statement then we need to put {} ;
         * or code is more than 1 line
         * and if we dont even want to use "return" then remove {} and remove return just write the expression
         * like (a)->a*a;
         * 
         */

         /*
          * without functional interface we can not invoke the lambda expresssion
          */
       
        
        
        
        
        //this is a functional interface 
        @FunctionalInterface
          interface Animal
          {
            public void name();// this is a abstract method (which have no implementation only declaration)
            
          }

        @FunctionalInterface
        /**
         * Cab
         */
        interface Cab {
        
            public String toDest(String loc , String des);
        }


          class Monkey implements Animal{

            public void name()//here we override this abstract method 
            {
                System.out.println("my name is monkey ");
            }
          }//NO need of this after lambda function

public class LambdaExpression{

    public static void main(String[] args) {

       Animal m = new Monkey();
       m.name();// object is calling the method.

       //using Lambda expression
       Animal m1 = ()->{System.out.println("hello my name is monkey");};//now we don't need whole another class and its method overriding 
       m1.name();

       //for cab interface we dont need to create a diffrent class we can use lambda

       Cab c = (loc,dest)->{System.out.println("from "+loc+" to "+dest);
                            
    return "hello";};

       System.out.println( c.toDest("kanpur", "banglore"));
    }
}