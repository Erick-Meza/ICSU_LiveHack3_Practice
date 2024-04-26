class Encryption extends ConsoleProgram {

  /**
   * A program the encrypts a message inputted by the user
   * 
   * @author:
   */

  public void run() {

    // Creates the formatted header above the prompts
    System.out.println("**** Encryption Program ****");

    // Initialzes variables by asking for the parameters to a method
    String strEncryptedMessage = encryptedMethod(readLine("Enter the message to encrypt: "),
        readInt("Enter the shift amount: "));

    // Outputs the encrypted message
    System.out.println("Here is your encrypted method: " + strEncryptedMessage);

  }

  /**
   * A method that will encrypt a message provided by the user
   * 
   * @param strPhase
   * @param intShift
   * @return The encrypted message
   */
  private String encryptedMethod(String strPhase, int intShift) {

    // Initializes variables
    String strResult = "";

    // Creates a for loop to encrypt each letter
    for (int i = 0; i <= strPhase.length() - 1; i++) {

      // Creates a variable to track each encrypted letter individually
      char charLetter = (char) (' ' + ((strPhase.charAt(i) - ' ' + intShift) % 95));

      // Adds each encrypted letter to a variable
      strResult += charLetter;
    }

    // Returns the encrypted message
    return strResult;
  }
}
