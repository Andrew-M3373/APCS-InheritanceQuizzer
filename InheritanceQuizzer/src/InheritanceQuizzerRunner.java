import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class InheritanceQuizzerRunner {

	public static void main(String[] args) {
		
		welcome();
		takeQuiz(fillArrayList());
		
	}
	
	public static void welcome() {
		System.out.println("Are you ready to take your 12-question quiz? Press enter to continue.");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}
	
	public static ArrayList<Question> fillArrayList() {
		ArrayList<Question> questions = new ArrayList<Question>();
		
		questions.add(new Question("Hobby x = new Hobby();\n\tx.haveFun();","A"));
		questions.add(new Question("Hobby x = new Hobby();\n\tx.wasteTime();","B"));
		questions.add(new Question("Hobby x = new Hobby();\n\tx.seeTheWorld();","E"));
		questions.add(new Question("Hobby x = new Hobby();\n\t((Flying)x).seeTheWorld();","E"));
		questions.add(new Question("Hobby x = new Flying();\n\tx.haveFun();","A"));
		questions.add(new Question("Hobby x = new Flying();\n\tx.wasteTime();","B"));
		questions.add(new Question("Hobby x = new Flying();\n\tx.seeTheWorld();","E"));
		questions.add(new Question("Hobby x = new Flying();\n\t((Flying)x).seeTheWorld();","D"));
		questions.add(new Question("Flying x = new Flying();\n\tx.haveFun();","C"));
		questions.add(new Question("Flying x = new Flying();\n\tx.wasteTime();","B"));
		questions.add(new Question("Flying x = new Flying();\n\tx.seeTheWorld();","D"));
		questions.add(new Question("Flying x = new Flying();\n\t((Flying)x).seeTheWorld();","D"));
		
		Collections.shuffle(questions);
		Collections.shuffle(questions);
		
		return questions;
	}
	
	public static void takeQuiz(ArrayList<Question> q) {
		int score = 0;
		
		for (Question a : q) {
			System.out.println("If the code runs:\n\t" + a.getQuestion() + "\nWhat will the result be?"
					+ "\n\tA. \"I'm having so much fun.\""
					+ "\n\tB. \"It may be fun, but is it useful?\""
					+ "\n\tC. \"I'm having even more fun.\""
					+ "\n\tD. \"I get to see the world from above.\""
					+ "\n\tE. error\n");
			
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine().toUpperCase();
			
			if (input.equals(a.getAnswer())) {
				score ++;
				System.out.println("Correct!\n");
			}
			else {
				System.out.println("Incorrect\n");
			}
		}
		
		DecimalFormat d = new DecimalFormat("0.00");
		System.out.println("Your final score is " + score + "/12 for a percentage of " + d.format(((double)score/12*100)) + "%.");
	}

}
