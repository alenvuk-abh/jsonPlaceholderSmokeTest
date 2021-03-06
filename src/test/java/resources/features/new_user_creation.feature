Feature: Smoke Test

  This application is a free dummy API that represents actions that of a social media app.
  This test verifies that a new user is able to create their own account, make a post with said account and comment on it.
  It also checks if the user can create an album and upload a picture to it.
  The user is also able to update their posts' info and fully delete their account.


  Scenario: Validate that the user can create an account, a post, an album and a comment on the post with the ability to customize the created post
    Given user creates an account
    When user creates a post
    Then user comments on their post, creates an album and uploads a photo
    And user is able too see their posts, comments and photos
    And user updates their post
    And user deletes their account