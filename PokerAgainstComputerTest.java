
public class PokerAgainstComputerTest {

   public static void main(String[] args) throws Exception {
      Score gameScore;
      java.io.PrintStream printStream = System.out;
      int draws = 0;
      int humanPlayerWins = 0;
      int computerPlayerWins = 0;
      
      PokerAgainstComputer pokerAgainstComputer = new PokerAgainstComputer(printStream, false);
      
      for (int gamesCounter = 1; gamesCounter <= 10; gamesCounter++) {
         //PokerAgainstComputer pokerAgainstComputer = new PokerAgainstComputer(printStream, false);
         printStream.printf("     -------     GAME NUMBER %d %n", gamesCounter);
         pokerAgainstComputer.run();
         gameScore = pokerAgainstComputer.getGameScore();
         
         switch (gameScore) {
            case FIRST_PLAYER_WIN:
               computerPlayerWins++;
               break;
            case SECOND_PLAYER_WIN:
               humanPlayerWins++;
               break;
            case DRAW:
               draws++;
         }
         
         printStream.printf("    -------  END OF  GAME NUMBER %d %n", gamesCounter);
      }
      
      printStream.printf("%20s %15s %15s %n", "Computer's wins", "Human's wins", "Draws");
      printStream.printf("%20d %15d %15d %n", computerPlayerWins, humanPlayerWins, draws);
   }
}
