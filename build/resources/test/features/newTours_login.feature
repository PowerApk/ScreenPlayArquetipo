#Author: powerapk.desarrollo@gmail.com
@NewTours
Feature: NewTours Login
  As a traveler user
  I want to use NewTours Page
  to succesfull autentication in home page

  Background: Open Browser
    Given User is in NewTours Home Page

  @Login
  Scenario Outline: User Log in
    When User type User"<usuario>" and Pass"<password>"
    And User click log-in button
    Then User successful login

    Examples: 
      | usuario   | password |
      | alejo2265 | qwe123   |
      | alejooo   | adw1w23  |
