Feature: search a product feature


  Scenario: Verify that the user can able to search a product
    Given the user navigates to the home page
    When the user enter the product name
    Then the product results should be displayed


  Scenario: Verify that the selected product is displayed on the product detail page of amazon


    Given the user is on the Amazon homepage
    When the user has searched for a product
#    And the user selects a product from the search results
    Then the user should see the product detail page

  Scenario: verify that user display product detail page
    Given the user back to Amazon homepage
    When the user search a product
    Then the user see particular product detail page
    And the user again back to another url1

  Scenario: verify that wrong text entered
#    When the user goes back to the homepage
    Given the user back to another url
    When the user enter invalid text
  #    Examples:
#      | url                      |
#      | wrong_url_1              |
#      | wrong_url_2              |
#      | https://example.com/cart |
#      | https://example.com/item |
#      | ...                      |
#   @smoke
   Scenario Outline:  verify that user enters from amazon to flipkart
    When the user goes back to the homepage
    Then the user enters "<url>"

    Examples:
      | url                      |
      | https://www.flipkart.com/            |
