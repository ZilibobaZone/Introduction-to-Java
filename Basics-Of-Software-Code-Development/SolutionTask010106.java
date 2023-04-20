package by.epam.introduction_to_java.basics_of_sftware_code_development;

//Решаем Basics of software code development - Линейные программы - задача #6
public class SolutionTask010106 {

	public static void main(String[] args) {

		// Дана произвольная точка с координатами х и у
		int x = 8;
		int y = 3;
		// Создадим переменную z для хранения ответа.
		boolean result;

		// Проведём логическое сравнение подходит ли наша точка под условие
		result = x > -4 && x < 4 && y > -3 && y < 4;

		// Выводим ответ
		// true - если наша точка принадлежит закрашенной облости
		// false - если не принадлежит
		System.out.print(result);

	}

}
