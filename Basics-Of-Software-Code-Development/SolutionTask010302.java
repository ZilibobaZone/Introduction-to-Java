package by.epam.introduction_to_java.basics_of_sftware_code_development;

//Решаем Basics of software code development - Циклы - задача #2
public class SolutionTask010302 {

	public static void main(String[] args) {
		// дан отрезок [a,b] и шаг h
		double a = -2;
		double b = 5;
		double h = 1.5;

		// создадим временную переменную для расчёта функции
		double tempX;

		// высчитаем значение функции
		for (tempX = a; tempX <= b; tempX = tempX + h) {
			if (tempX > 2) {
				System.out.println("При х равном " + tempX + " у равен " + tempX);
			} else {
				System.out.println("При х равном " + tempX + " у равен " + (-tempX));
			}

		}

	}

}
