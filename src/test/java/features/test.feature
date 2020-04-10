Feature: test


Scenario: testing Nova Website
Given user is on NOVA URL HomePage
When user clicks on Academics & Programs and selects Libraries
Then user should navigate to library search Page and user should search for book titled JAVA
And user should navigate to a Results Page and user should verify if any results were returned