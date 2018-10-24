#Author: powerapk.desarrollo@gmail.com
@NewTours
Feature: NewTours Register
  As a traveler user
  I want register in New Tours
  to succsesfull log-in in to the page

  Background: Open Browser
    Given User is in NewTours Register Page

  @Register
  Scenario Outline: NewTours Register
    When User fill the form info <attemps>
      | nombre | apellido | phone  | email               | address1     | address2     | city       | state     | postal_cod | country | userName  | pass | conf_pass |
      | data1  | data2    | 123123 | example@test.com    | Sabaneta     | Shopos       | Medellin   | Antioquia |      10001 |      42 | vash2265  | 1234 |      1234 |
      | data3  | data4    | 123213 | badexample@test.com | nothing land | ningun lugar | cualquiera | Valle     |       6093 |      43 | alejo2265 | fjdb |       234 |
    And User sumbit on register button
    Then User successful registered

    Examples: 
      | attemps |
      |       0 |
      |       1 |
