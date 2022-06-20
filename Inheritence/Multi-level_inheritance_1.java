Class SuperClass
{
   public void methodA()
   {
     System.out.println("SuperClass");
   }
}
Class SubClass1 extends SuperClass
{
   public void methodB()
   {
     System.out.println("SubClass1 ");
   }
}

Class SubClass2 extends SubClass1
{
   public void methodC()
   {
     System.out.println("SubClass2");
   }
   public static void main(String args[])
   {
     SubClass2 obj = new SubClass2();
     SubClass2.methodA(); //calling super class method
     SubClass2.methodB(); //calling subclass 1 method
     SubClass2.methodC(); //calling own method
  }
}