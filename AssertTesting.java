
public class AssertTesting {

   public static void assertPokerHand(PokerHand pokerHand, PokerHand expectedPokerHand) {
      assert(pokerHand == expectedPokerHand) : 
                     String.format("%s != %s%n", pokerHand, expectedPokerHand);
   } 
   
   public static void assertScore(Score score, Score expectedScore) {
      assert(score == expectedScore) : 
                     String.format("%s != %s%n", score, expectedScore);
   }
   
} 
