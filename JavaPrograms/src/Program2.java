
public class Program2 {

	public static void main(String[] args) 
	{
		
		String name="Kartik Ganiger";
		String [] words=name.split(" ");
		String reverseString="";
		for(String word:words)
		{
			int count=word.length();
			String reversed="";
			for(int i=count-1; i>=0; i--)
			{
				reversed=reversed+word.charAt(i);
			}
			reverseString=reverseString+reversed+" ";
			
		}
		
		System.out.println(reverseString);

}
}