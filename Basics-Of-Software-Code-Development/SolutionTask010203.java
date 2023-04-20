package by.epam.introduction_to_java.basics_of_sftware_code_development;

//Решаем Basics of software code development - Ветвление - задача #3
public class SolutionTask010203 {

	public static void main(String[] args) {
		// даны 3 точки в пространстве
		double x1 = 1;
		double y1 = 2;
		double x2 = 2;
		double y2 = 4;
		double x3 = 3;
		double y3 = 6;

		// проверяем условие при котором три точки лежат на одной прямой
		if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
			System.out.println("Эти три точки расположены на одной прямой");
		} else
			System.out.println("Эти три точки не расположены на одной прямой");
	}

}
