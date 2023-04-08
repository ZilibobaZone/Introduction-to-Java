package by.epam.introductionToJava.basicsOfSoftwareCodeDevelopment;

//Решаем Basics of software code development - Линейные программы - задача #2
public class SolutionTask010102 {
	public static void main (String[] args) {
		double a = 1, b = 2, c = 3; //создаём переменные и сразу инициализируем
		double x; //создаём переменную в которой бцдет зранить ответ
		
		/*
		Math.pow(double a, double b);
		Функция позволяет возвести число a в степень b 
		
		Math.sqrt(double a);
		Функция позволяет высчитать квадрвтный кореньчисла a
	 	*/
		
		x = (b + Math.sqrt(Math.pow(b,2) + 4*a*c)) / 2 * a - Math.pow(a,3) * c + Math.pow(b,-2);
		
		System.out.print("x = " + x); //выводим ответ на консоль

	}

}
