package by.epam.introduction_to_java.basics_of_sftware_code_development;

// Решаем Basics of software code development - Циклы - задача #4
// Составить программу нахождения произведения квадратов первых двухсот чисел.

public class SolutionTask010304 {

	public static void main(String[] args) {
		double result;
		result = 1;

		// Организуем цикл for для работы с первыми 200 числами
		for (int i = 1; i <= 200; i++) {
			result = result * Math.pow(i, 2);
		}

		System.out.println("Произведения квадратов первых 200 чисел равна " + result);

		// Ответ будет Infinity по тому что значение которое получается в результате
		// рассчётов очень велико и не помещается в память выделенную для переменной,
		// а это 64 бита

	}

}
