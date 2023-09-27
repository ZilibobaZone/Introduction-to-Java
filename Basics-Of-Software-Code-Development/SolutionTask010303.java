package by.epam.introduction_to_java.basics_of_sftware_code_development;

// Решаем Basics of software code development - Циклы - задача #3
// Найти сумму квадратов первых ста чисел.

public class SolutionTask010303 {

	public static void main(String[] args) {
		double result;
		result = 0;

		// Организуем цикл for для работы с первыми 100 числами
		for (int i = 1; i <= 100; i++) {
			result = result + Math.pow(i, 2);
		}

		System.out.println("Сумма квадратов первых 100 чисел равна " + result);

	}

}
