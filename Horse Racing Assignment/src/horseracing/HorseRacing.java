package horseracing;

import java.util.Scanner;

public class HorseRacing {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    
        HorseRacingHelper.prepareHorseRacingSimulation();
        boolean gameOver = false;
        while(!gameOver){
            HorseRacingHelper.clearConsole();

            int numHorsesInRace = (int)(Math.random()*7)+5;

            Race race = HorseRacingHelper.createRace(numHorsesInRace, HorseRacingHelper.SHORT, HorseRacingHelper.DIRT);
            race.displayRaceInfo();

            race.startRace();

            System.out.println("Race is Over");
            gameOver = playAgain(in);
        }

        
    }

    private static boolean playAgain(Scanner in) {
        System.out.print("Play Again: (y/n): ");
        String result = in.nextLine();

        if (result.equals("n"))
            return true;

        return false;

    }
}
