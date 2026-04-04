Feature: Pet Lifecycle

  Scenario: Create, Get, Update, Delete Pet
    Given I create a new pet
    When I get the pet details
    Then pet details should match
    When I update the pet status
    Then pet should be updated
    When I delete the pet
    Then pet should be deleted

  Scenario: Inventory Analysis
    Given I fetch the inventory
    When I fetch pets by available status
    Then both counts should match

  Scenario: User Security & Error Handling (Negative Testing)

    Given I create user with invalid email
    When I fetch a non-existing user
    Then I should get 404 with user not found message

    When I login with invalid credentials
    Then login should fail without valid token

  Scenario: Cross-Endpoint Data Consistency

    Given I create a pet with category HighValueBulldog
    When I update the pet status to sold
    And I fetch the inventory for sold pets
    And I fetch pets with sold status
    Then the created pet should exist in sold pet list


