@second
Feature: This file is used to parameterize test

Scenario Outline: Check the login with multiple username and password

Given I login to website
When I enter "<uname>" and "<pass>"

Examples:
|uname    |pass    |
|girishn53|yhijo   |
|Ankita		|yegsb   |


