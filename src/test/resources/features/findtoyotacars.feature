Feature: Get and validate the first search result of the provided car model
  
  User navigates to gumtree website and
  chooses the make and model then
  clicks on first results 
  and validates the car model

  Scenario Outline: Car models first result check
    Given user goes to gumtree website
    When user mouseover to cars and vehicles
    Then user clicks on carsvehiclesutes
    And select "<Make>" from the make
    And select "<Model>" from the model
    And click on the search
    And read first results and check "<Model>"

    Examples: 
      | Make   | Model |
      | BMW    | X7    |
      | Toyota | RAV4  |
