package by.epam.introduction_to_java.basics_of_sftware_code_development;

// Решаем Basics of software code development - Линейные программы - задача #5
// Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
// данное значение длительности в часах, минутах и секундах в следующей форме:
// ННч ММмин SSc.

public class SolutionTask010105 {

	public static void main(String[] args) {
		int t = 123456789;
		int h, m, s;

		h = t / 3600;
		m = t % 3600 / 60;
		s = t % 3600 % 60;

		System.out.println("Изначально дано число " + t + ", приобразуем его в формат времени.");
		System.out.println(h + "ч " + m + "мин " + s + "c");

	}

}
