Feature: Pet Lifecycle

  Scenario: Create, Get, Update, Delete Pet
    Given I create a new pet
    When I get the pet details
    Then pet details should match
    When I update the pet status
    Then pet should be updated
    When I delete the pet
    Then pet should be deleted

#  Scenario: Inventory Analysis
#    Given I fetch the inventory
#    When I fetch pets by available status
#    Then both counts should match
