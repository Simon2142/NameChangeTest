Feature: Login to the system #Emil 1
    Description: Login into the system
    Actor: Employee

Scenario: Employee logs in
    Given that no-one is logged in
    And an employee with an "ABCD" exists
    When an employee logs in with their "ABCD"
    Then the employee "ABCD" is logged into the system

Scenario: Employee does not exists
    Given that no-one is logged in
    And an employee has an "DCBA" that is not registered in the system
    When an employee logs in with the "DCBA"
    Then the employee is not logged into the system, and an error message "Employee ID does not exist" appears
