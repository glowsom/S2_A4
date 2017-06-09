import java.util.Scanner;
public class FourQs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner usr = new Scanner (System.in);
		TestDemo Subject = new TestDemo();
		
		System.out.print("Enter Marks for English: ");
		int EngMark = usr.nextInt();
		Subject.inputEval(EngMark);
		Subject.Grade(EngMark);
		
		System.out.print("\nEnter Marks for Math: ");
		int MathMark = usr.nextInt();
		Subject.inputEval(MathMark);
		Subject.Grade(MathMark);
		
		System.out.print("\nEnter Marks for Science: ");
		int SciMark = usr.nextInt();
		Subject.inputEval(SciMark);
		Subject.Grade(SciMark);
		
		int AvgMark = (EngMark + MathMark + SciMark)/3;
		System.out.print("\nAverage ");
		Subject.Grade(SciMark);
	}

}
