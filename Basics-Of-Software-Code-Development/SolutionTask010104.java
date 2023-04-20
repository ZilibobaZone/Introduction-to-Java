package by.epam.introduction_to_java.basics_of_sftware_code_development;

//Решаем Basics of software code development - Линейные программы - задача #4
public class SolutionTask010104 {
	public static void main(String[] args) {
		double a = 123.456; // Создаём переменную и инициализируем данным числом
		double result; // Создаём переменную где будем хранить ответ

		// Для отделения целой части от дробной испольщуем явное приведение
		// типов (int)a

		result = (a * 1000) % 1000 + (int) a * 0.001;

		// Выводим изначальное число в консоль
		// Параметр println выводит данные в консоль и переводит курсор на следующую
		// строку после окончания вывода.
		System.out.println("Дано число " + a + " поменяем целую и дробную части. Ответ сохраним в переменную x.");

		// Выводим ответ в консоль
		System.out.println("x = " + result);

	}

}
