class DataTypes{
    public static void main(String args[])
    {
         System.out.println("whole number data types.............");
        byte num1=25;
        System.out.println(num1);
        /*byte num2=245;
        System.out.println(num2);
        This will throw error as byte data type can store from -128 to 127 which is(2^(n-1) to 2^(n-1)-1) where n=8*/
      short num3=245;
      System.out.println(num3);
      /* short num4=33767;
      System.out.println(num4);
      this will throw error as short allocate 2 bytes which is 16 bits and 33767 not comes in the range of   (2^(n-1) to 2^(n-1)-1) where n=16*/
      int num5=33767;
      System.out.println(num5);
      // int data type allocates 4 bytes of memory which means 32 bits
      long num6=2456465l; //we have to add l after number in long data type
      System.out.println(num6);
       // int data type allocates 8 bytes of memory which means 64 bits
       // Real number data types
       System.out.println("Real number data types.............");
       float num7=568.36f;//we have to add f after number in float variable
       // flaot allocates 4 bytes of memory the range of a float is approximately 1.4E-45 to 3.4028235E+38.
       System.out.println(num7);
       double num8=1235.3655456432;
       // double allocates 8 bytes of memory  the range of a double is approximately 4.9E-324 to 1.7976931348623157E+308.
       System.out.println(num8);
        System.out.println("character data types.............");
       //char data types
       char charater='A';//in java char allocates 2 bytes of memory because it follows UTF(Unicode Transformation Format)
       System.out.println(charater);



     
    }
}