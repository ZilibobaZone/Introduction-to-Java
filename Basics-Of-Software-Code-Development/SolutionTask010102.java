package by.epam.introduction_to_java.basics_of_sftware_code_development;

// Решаем Basics of software code development - Линейные программы - задача #2
// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// (b+Sqrt(b^2+4ac))/2a-a^3*c+b^(-2)

public class SolutionTask010102 {
	public static void main(String[] args) {
		double a = 1;
		double b = 2;
		double c = 3; // создаём переменные и сразу инициализируем
		double result; // создаём переменную в которой бцдет зранить ответ

		/*
		 * Math.pow(double a, double b); Функция позволяет возвести число a в степень b
		 * 
		 * Math.sqrt(double a); Функция позволяет высчитать квадрвтный кореньчисла a
		 */

		result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);

		System.out.print("x = " + result); // выводим ответ на консоль

	}

}
