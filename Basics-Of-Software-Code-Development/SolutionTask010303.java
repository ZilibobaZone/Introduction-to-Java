package by.epam.introductionToJava.basicsOfSoftwareCodeDevelopment;

//Решаем Basics of software code development - Циклы - задача #3
public class SolutionTask010303 {

	public static void main(String[] args) {
		double result;
		result = 0;
		
		//Организуем цикл for для работы с первыми 100 числами
		for (int i = 1; i <= 100; i++) {
			result = result + Math.pow(i, 2);
		}
		
		System.out.println("Сумма квадратов первых 100 чисел равна " + result);

	}

}
