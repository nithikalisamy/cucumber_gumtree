@realestate
Feature: Check the the highest property price in the given range
  
  User going to Gumtree website and click on the real estate menu then selects the property for sale section
  Provided max amount then chooses the checks the first resuls provided

  Scenario Outline: Real estate search with max amount and select the top results
    Given user goes to gumtree website
    When user mouseover to realestate
    Then user clicks on property for sale
    And enters the "<Max>" price
    And click on GO
    And sort by most expensive option
    And read first results and check type

    Examples: 
      | Max     |
      | 1000000 |
