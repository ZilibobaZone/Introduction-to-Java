package by.epam.introduction_to_java.basics_of_sftware_code_development;

//Решаем Basics of software code development - Ветвление - задача #2
public class SolutionTask010202 {

	public static void main(String[] args) {
		// Даны 4 произвольных числа
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int minAB;
		int minCD;
		int result;

		// Найдём мин из A и B
		if (a < b) {
			minAB = a;
		} else {
			minAB = b;
		}

		// Найдём мин из C и D
		if (c < d) {
			minCD = c;
		} else {
			minCD = d;
		}

		// Находим макс из двух мин
		if (minAB > minCD) {
			result = minAB;
		} else {
			result = minCD;
		}

		// Выводим ответ в консоль
		System.out.println("Макс = " + result);
	}

}
