package by.epam.introduction_to_java.basics_of_sftware_code_development;

//Решаем Basics of software code development - Линейные программы - задача #5
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
