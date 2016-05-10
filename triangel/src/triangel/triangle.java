package triangel;

public class triangle {

	public String triangletype(int a, int b, int c){  
		if(a>=b+c||b>=a+c||c>=a+b)
		{
			return"It is not a triangel";
		}
		else if(a==b&&b==c)
		{
			return"equilateral";
		}
		else if(a==b&&a!=c||b!=c&&a==b||a!=b&&b==c)
		{
			return"isosceles";
		}
		else
		{
			return"scalene";
		}  
    }  
}
