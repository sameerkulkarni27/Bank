package account;

/**
 * This class represents an individual's account in the bank and contains all the information for
 * the account.
 */
public class Account {
  /**
   * Name of person with account
   */
  private String name;
  /**
   * City of person with account
   */
  private String city;
  /**
   * Address of person with account
   */
  private String address;
  /**
   * State/province of person with account
   */
  private String state;
  /**
   * Zip code of person with account
   */
  private int zipCode;
  /**
   * Country of person with account
   */
  private String country;
  /**
   * Phone number of person with account
   */
  private String phoneNumber;
  /**
   * Credit score of person with account
   */
  private static int creditScore = 700;

  public Account(String name, String city, String address, String state, int zipCode,
      String country, String phoneNumber, int creditScore) {
    this.name = name;
    this.city = city;
    this.address = address;
    this.state = state;
    this.zipCode = zipCode;
    this.country = country;
    this.phoneNumber = phoneNumber;
    Account.creditScore = creditScore;
  }

  public Account(String name, String city, String address, String state, int zipCode,
      String country, String phoneNumber) {
    this.name = name;
    this.city = city;
    this.address = address;
    this.state = state;
    this.zipCode = zipCode;
    this.country = country;
    this.phoneNumber = phoneNumber;
  }
}
