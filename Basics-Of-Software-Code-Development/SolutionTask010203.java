package by.epam.introductionToJava.basicsOfSoftwareCodeDevelopment;

//Решаем Basics of software code development - Ветвление - задача #3
public class SolutionTask010203 {

	public static void main(String[] args) {
		//даны 3 точки в пространстве
		double x1=1,y1=2,x2=2,y2=4,x3=3,y3=6;
		
		//проверяем условие при котором три точки лежат на одной прямой 
		if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
			System.out.println ("Эти три точки расположены на одной прямой");
		}
		else System.out.println ("Эти три точки не расположены на одной прямой");
	}

}
