package by.epam.introduction_to_java.algorithmization;

//Решаем Basics of software code development - Одномерные массивы - задача #6
public class SolutionTask010106 {

	public static void main(String[] args) {
		// Дана последовательность действительных чисел
		double[] a = { 1.0, -2.0, 3.0, 4.0, 0.0, 8.0, 80.0, 9.543, 0.2, 66 };
		double result = 0;

		// Суммириуем те из них порядковый номер которых являются простым числом

		for (int num = 0; num < a.length; num++) {
			if (isPrimeNum(num)) {
				result += a[num];
			}

		}

		System.out.print("Сумма всех элементов чей порядковый номер простое число равна " + result);
	}

	// В методе определяем Является ли число простым и возвращаем true или folse
	// Простое число это число которое делится только на 1 и на само себя без
	// остатка
	public static boolean isPrimeNum(int num) {
		boolean isPrime = false;
		for (int i = 2; i < num; i++) {
			if (num <= 0) {
				isPrime = false;
				break;
			}
			if (num % i == 0) {
				isPrime = false;
				break;
			}
			isPrime = true;
		}

		return isPrime;
	}

}
