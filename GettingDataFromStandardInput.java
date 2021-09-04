import java.util.Scanner;

public class GettingDataFromStandardInput {

   private static final int abnormalTerminationCode = 1; // status code indicates abnormal termination
   private static final Scanner input               = new Scanner(System.in);
   
   public static Scanner getScanner() {
      return input;
   }
   
   public static String getString(String prompt) {
      System.out.print(prompt);
      
      return input.nextLine();
   }
   
   
   public static int getInteger(String prompt) {
      System.out.print(prompt);
      
      int     value = 0;
      
      if (false == input.hasNextInt()) {
         input.close();
         System.exit(abnormalTerminationCode);
      }
      else {
         value = input.nextInt();
      }
      
      input.nextLine(); // clear input data
      return value;
   }
   
   public static void clearNextLineOfInputData() {
      input.nextLine(); // clear input data
   }
   
   public static Integer getIntegerRejectOthersData(String prompt, boolean isInfoDisplaying) {
      System.out.print(prompt);
      
      Integer value = null;
      
      while (true == input.hasNext()) {    // return true if scanner has another token (word) in its input
         if (true == input.hasNextInt()) {
            value = input.nextInt();
            
            if (isInfoDisplaying) {
               System.out.printf("%nValue of %d entered by User was accepted. %n", value);
            }
            return value;
         }
         else if (true == input.hasNextDouble()) {
            System.err.printf("%nValue of %f entered by User is type double. ", input.nextDouble());
            System.err.printf("This is incorrect. Value must be integer type.%n");
         }
         else {
            System.err.printf("%nValue of \'%s\' entered by User is not integer type. ", input.next());
            System.err.printf("This is incorrect. Value must be integer type.%n");
         }
      }
      
      return value;   // return if End-of-transmission character was detected
   }
   
}
