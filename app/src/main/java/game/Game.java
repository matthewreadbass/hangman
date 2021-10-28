package game;
/**
 * Game
 */
public class Game {

  String word;
  Integer attempts;

  public Game(String wordForGuessing) {
    word = wordForGuessing;
    attempts = 10;
  }
  public static void main(String[] args) {
    
  }

  public String getWordToGuess() {
    StringBuilder builder = new StringBuilder(word);
    int length = word.length();
      for (int i = 0; i < length; i++) {
        if (i != 0) {
        builder.replace(i, i + 1, "_");
        }
      }
    String output = builder.toString();
    return output;
  }

    public Integer getRemainingAttempts() {
      return attempts;
    }

  // public String getWordToGuess() {
  //   StringBuilder builder = new StringBuilder(word);
  //   Integer wordLength = word.length();
  //   String blanks = new String(new char[wordLength - 1]).replace("\0", "_");
  //   builder.replace(1, wordLength, blanks);
  //   String output = builder.toString();
  //   return output;
  // }
  
}