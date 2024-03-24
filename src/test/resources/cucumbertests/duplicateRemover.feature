
  Feature: Duplicates Remover and List Sorter

    As a user of the ListUtils class
    I want to ensure it correctly remove duplicates and sort lists
    So that I can have unique and correctly sorted values

    Scenario: Successful deduplicate and sort of a String List
      Given I provide a String List
      When the removeDuplicatesAndOrder static method is executed
      Then the result should be duplicate free and values sorted in an alphabetical order


    Scenario: Successful deduplicate and sort of an Integer List
      Given I provide a Integer List
      When the removeDuplicatesAndOrder static method is executed om the integer list
      Then the result should be duplicate free and values sorted in an ascending order
