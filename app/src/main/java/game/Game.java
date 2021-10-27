package game;
/**
 * Game
 */
public class Game {

  String word;

  public Game(String wordForGuessing) {
    word = wordForGuessing;
  }
  public static void main(String[] args) {
    
  }

  public String getWordToGuess() {
    StringBuilder builder = new StringBuilder(word);
    Integer wordLength = word.length();
    String blanks = new String(new char[wordLength - 1]).replace("\0", "_");
    builder.replace(1, wordLength, blanks);
    String output = builder.toString();
    return output;
  }
  
}