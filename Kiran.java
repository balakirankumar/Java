import java.io.*;
import java.awt.*;
class Kiran extends Thread
{
	public void run()
	{
		System.out.println("Running thread");
	}
	public static void main(String s[])
	{
		Kiran k1 = new Kiran();
		k1.start();
	}
}