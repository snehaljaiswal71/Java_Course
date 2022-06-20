interface Moveable
{
 	int AVG-SPEED = 40;
 	void move();
}

class Vehicle implements Moveable
{
 	public void move()
 	{
  		System .out. print in ("Average speed is"+AVG-SPEED");
 	}
 	public static void main (String[] arg)
 	{
  		Vehicle vc = new Vehicle();
  		vc.move();
 	}
}