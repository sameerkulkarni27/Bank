package account;

/**
 * This class represents a card in an account, which is stored in the bank.
 */
public class Card {
  /**
   * The money (double) in this card
   */
  private double money;
  /**
   * Name of person owning card
   */
  private String name;
  /**
   * The company that made the card
   */
  private String company;
  /**
   * Type of card: debit, credit, gift
   */
  private CardType type;
  /**
   * Credit card number: XXXX XXXX XXXX XXXX
   */
  private String number;
  /**
   * Date of card: XX/XX
   */
  private String expirationDate;
  /**
   * 3 digit code
   */
  private int CVV;

  /**
   * Three types of cards: debit, credit, gift
   */
  public enum CardType {
    DEBIT, CREDIT;
  }

  public Card(String number, String name, String expirationDate, int CVV) {
    this.number = number;
    this.name = name;
    this.expirationDate = expirationDate;
    this.CVV = CVV;
  }
}
