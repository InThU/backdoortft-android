using System;

public class Program
{
	public static void Main()
	{
		var timevalue = 1030; //time on screen without :
		var password = Math.Pow((9999 - timevalue), 2); //big brain math
		Console.WriteLine(password); // output
	}
}
