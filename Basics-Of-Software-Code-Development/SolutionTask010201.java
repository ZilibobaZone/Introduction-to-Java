package by.epam.introduction_to_java.basics_of_sftware_code_development;

// Решаем Basics of software code development - Ветвление - задача #1
// Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
// он прямоугольным.

public class SolutionTask010201 {
	public static void main(String[] args) {
		// Даны два произвольных угла
		double a = 90;
		double b = 10;

		// Проверим возможно ли существование такого треугольника
		if ((180 - a - b) > 0) {
			System.out.println("Такой треугольник может существовать");

			// Если такой треугольник существует то проверим прямоугольный ли он
			if (a == 90 || b == 90 || (180 - a - b) == 90) {
				System.out.println("Такой треугольник прямоугольный");
			} else {
				System.out.println("Такой треугольник не прямоугольный");
			}

		} else {
			System.out.println("Такой треугольник не может существовать"); // Выведем сообщение если такой треугольник
																		   // не может существовать
		}

	}

}
