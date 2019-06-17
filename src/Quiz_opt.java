import java.util.Scanner;

class Quiz_opt {
    private static Scanner input = new Scanner(System.in);
    private static int correctAnswers, questionNumber = 0;
    static boolean exit = true;


    static void quizRunner() {
        correctAnswers = 0;
        for (String[] quiz : QUIZ.quiz) {
            System.out.printf("%d) %s\n\t%s\n\t%s\n\t%s\n", questionNumber += 1, quiz[0], quiz[1], quiz[2], quiz[3]);
            String answer = input.nextLine();
            if (answer.equals(quiz[4])) {
                correctAnswers += 1;
                System.out.print("Good answer!\n");
            } else {
                System.out.print("Wrong answer!\n");
            }
        }
    }

    static void exit() {
        System.out.printf("\tQuestions answered amount : %d\n", QUIZ.quiz.length);
        System.out.printf("\tCorrect answers collected : %d\n\n\n", correctAnswers);
        System.out.print("press N to exit");
        String ask = input.nextLine().toUpperCase();
        if (ask.equals("N")) {
            exit = false;
        }
        System.out.print("\n\n");
    }

}
