package by.epam.introduction_to_java.basics_of_sftware_code_development;

// Решаем Basics of software code development - Линейные программы - задача #1
// Найдите значение функции: z = ( (a – 3 ) * b / 2) + c

public class SolutionTask010101 {

	public static void main(String[] args) {
		int result; // создаём переменную
		int a; // создаём переменную
		a = 2; // иницыализируем переменную
		int b = 3, c = 4; // создаём переменную и сразу инициализируем

		result = ((a - 3) * b / 2) + c;

		System.out.print("z = " + result); // выводим ответ на консоль

	}

}
