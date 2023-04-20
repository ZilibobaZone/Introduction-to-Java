package by.epam.introduction_to_java.basics_of_sftware_code_development;

//Решаем Basics of software code development - Ветвление - задача #4
public class SolutionTask010204 {

	public static void main(String[] args) {
		// Даны размеры прямоугольного отверстия
		int a = 7;
		int b = 5;

		// Даны размеры кирпича
		int x = 5;
		int y = 2;
		int z = 12;

		// Проверим влазит ли кирпич в отверстие сравнив попарно его стороны с сторонами
		// отверстия
		if ((x <= a && y <= b) || (y <= a && x <= b)) {
			System.out.println("Кирпич пролазит в отверстие");
		} else if ((y <= a && z <= b) || (z <= a && y <= b)) {
			System.out.println("Кирпич пролазит в отверстие");
		} else if ((z <= a && x <= b) || (x <= a && z <= b)) {
			System.out.println("Кирпич пролазит в отверстие");
		} else {
			System.out.println("Кирпич никак не пролазит в отверстие");
		}

	}

}
