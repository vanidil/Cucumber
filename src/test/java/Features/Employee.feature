Feature:
  Verify different GET operation using REST-assured
  Scenario:Verify first name of the employee
    Given I perform the GET operation for "/employees"
    When I perform GET for the id number "2"
    Then I should see the firstname as "Senthil"


  Scenario:verify POST operations
    Given I perform POST operation "/employees"

  Scenario: Verify DELETE operation
    Given I perform DELETE operation for "3"
    And I perform GET operation for "/employees/3"
    Then I should not see the body with firstName



