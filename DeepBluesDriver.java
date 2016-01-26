
public class DeepBluesDriver
{
	
	static int rollNum = 100000;
	
	public static void main(String[] args)
	{
			int a = 0,
				b = 0,
				c = 0,
				d = 0;
		
		for (int i = 0; i < rollNum; i++)
		{
			switch (DeepBlues.getChoice())
			{
				case 1:
					a++;
					break;
					
				case 2:
					b++;
					break;
					
				case 3:
					c++;
					break;
					
				default:
					d++;
			}
			//end switch
		}	
		//end for
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
	//end main
}
//end class