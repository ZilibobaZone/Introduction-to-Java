package by.epam.introduction_to_java.basics_of_sftware_code_development;

// Решаем Basics of software code development - Ветвление - задача #5
// Вычислить значение функции:

public class SolutionTask010205 {

	public static void main(String[] args) {

		int x = 3;
		double result;

		// Проведём рассчёт согласно условию
		if (x <= 3) {
			result = Math.pow(x, 2) - 3 * x + 9;
		} else {
			result = 1 / (Math.pow(x, 3) + 6);
		}

		// Выводим ответ в консоль
		System.out.println("Ответ " + result);

	}

}
