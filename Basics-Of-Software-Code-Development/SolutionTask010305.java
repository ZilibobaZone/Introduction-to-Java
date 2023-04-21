package by.epam.introduction_to_java.basics_of_sftware_code_development;

//Решаем Basics of software code development - Циклы - задача #5
public class SolutionTask010305 {

	public static void main(String[] args) {
		double result = 0;
		double e = 0.1; // заданное значение е
		double temp;

		// Для расчёта модуля используем метод Math.abs(x)
		for (int i = 1; i <= 5; i++) {
			temp = Math.abs(1 / Math.pow(2, i) + 1 / Math.pow(3, i));
			if (temp >= e) {
				result = result + temp;
			}
		}

		System.out.println("Ответ равен " + result);

	}

}
