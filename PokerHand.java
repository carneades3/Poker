
public enum PokerHand {
   HIGH_CARD("high card"),
   ONE_PAIR("one pair"),
   TWO_PAIRS("two pairs"),
   THREE_OF_KIND("three of kind"),
   STRAIGHT("straight"),
   FLUSH("flush"),
   FULL_HOUSE("full house"),
   FOUR_OF_KIND("four of kind"),
   STRAIGHT_FLUSH("straight flush");
   
   private String name;
   
   PokerHand(String name) {
      this.name = name;
   }
   
   public String toString() {
      return name;
   }
} 
