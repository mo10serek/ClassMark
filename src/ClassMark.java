import java.util.Random;

public class ClassMark {

	public static int[][] putMarks(int[][] classMark)
	{
		Random rnd = new Random();
		
		for (int counter = 0; counter < 4; counter++)
		{
			for (int counter2 = 0; counter2 < 6; counter2++)
			{
				classMark[counter][counter2] = rnd.nextInt(99) + 1;
			}
				
		}
		
		return classMark;
	}
	
	public static double ClassAverage(int[][] classMarks)
	{
		int classAverage;
		
		for (int counter3 = 0; counter3 < 4; counter3++)
		{
			for (int counter4 = 0; counter4 < 6; counter4++)
			{
				classAverage = classAverage + classMark[counter3][counter4];
			}
		}
		return 2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] classMark = new int[4][6];
		
		classMark = putMarks(classMark);
		
	
		
		System.out.println("student1: " + classMark[0][0] + " " + classMark[0][1] + " " + classMark[0][2] + " " + classMark[0][3]  + " "  + classMark[0][4] + " " + classMark[0][5] + " " + "student2: " + classMark[1][0] + " " + classMark[1][1] + " " + classMark[1][2] + " " + classMark[1][3] + " "  + classMark[1][4] + " " + classMark[1][5] + " " + "student3: " + classMark[2][0] + " " + classMark[2][1] + " " + classMark[2][2] + " " + classMark[2][3] + " "  + classMark[2][4] + " " + classMark[2][5] + " " + "student4: " + classMark[3][0] + " " + classMark[3][1] + " " + classMark[3][2] + " " + classMark[3][3] + " "  + classMark[3][4] + " " + classMark[3][5]);
	}

}
