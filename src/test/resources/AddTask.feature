@addTask
Feature: Add Task

  Scenario: Verify user can create new task with date & time, repeat options, add to list
    Given user on the to do list app
    When user create new task
    And user input task name on new task page
    And user choose due date "20 July 2022" on new task page
    And user choose time "1" hour "10" minutes "AM" on new task page
    And user choose other for repeat option on new task page
    And user set repeat option week on new task page
    And user choose personal for add to list on new task page
    Then user see task is successfully added