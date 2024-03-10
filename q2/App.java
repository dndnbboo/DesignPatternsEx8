package ex8.q2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Observer ob1 = new Observer();
        Observer ob2 = new Observer();
        ScoreServer server = new ScoreServer();
        Source src = new Source(server);

        src.registerObserver(ob1);
        src.registerObserver(ob2);

        Scanner in = new Scanner(System.in);
        String input="score";
        while (input != "") {
            System.out.print("Enter score : ");
            input = in.nextLine();
            if (input != "") {
                server.setScore(input);
                src.notifyObservers();
            } 
        }
    }
}

