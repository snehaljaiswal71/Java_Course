abstract class A
{
  abstract void callme();
  public void show()
  {
    System.out.println("this is non-abstract method");
  }
}

class B extends A
{
  void callme()
  {
    System.out.println("Calling...");
  }
  public static void main(String[] args)
  {
    B b = new B();
    b.callme();
    b.show();
  }