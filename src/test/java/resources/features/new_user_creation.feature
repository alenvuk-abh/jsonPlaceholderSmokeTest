Feature: Smoke Test


  Scenario: A new user flow that includes posting, commenting and album creation and deletion
    When user creates an account
    And user creates a post
    And user comments on their new post
    And user posts an album
    And user uploads a picture
    And updates their post
    Then user has created their account
    And user has uploaded a picture
    And user has deleted their account


