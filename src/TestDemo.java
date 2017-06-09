public class TestDemo{
	
	void inputEval(int x){ 
		//Unable to figure out how to convert from int to ASCII. converting from ASCII to CHAR instead.
		char ascii = (char)x;
		if (x<0)
			System.out.println("You Have Entered Negative Value: " + ascii );
		else if (x>0)
			System.out.println("You Have Entered Positive Value: " + ascii );
		else
			System.out.println("You Have Entered Zero: " + ascii );
	}
	
	// Using if statements to grade scores.
	void Grade (int x){
		if (x>60){
			if (x>70)
				System.out.println("Grade is A");
			else
				System.out.println("Grade is B");
		}
		else
			System.out.println("Grade is C");
	}
	
	
}
