
public enum Score {
   
   FIRST_PLAYER_WIN("first player wins"),
   SECOND_PLAYER_WIN("second player wins"),
   DRAW("draw"); 
   
   private String name;
   
   Score(String name) {
      this.name = name;
   }
   
   public String toString() {
      return name;
   }
} 
