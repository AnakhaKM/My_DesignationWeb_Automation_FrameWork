Feature: Validate working functionality of MyDESIGNATION site

  Scenario: Verify user can add to cart item
    Given user opens website
    Then  verify user is on homepage
    When  user clicks on menu bar
    And   user choose on kids option
    And   user clicks on first item
    And   choose the category options
    And   user clicks on add to cart button
    Then  verify items is added on cart
