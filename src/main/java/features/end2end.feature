@Test


  Feature: End to End

    Background:
      Given User is on Orange HRM Page
      When User enter username "valid" and password "valid"
      When User click Login


    Scenario: Login User with valid Credentials
      Then User is on Home Page


    Scenario: Reset Password
      When User click on menu and Change Password
      When User enter current password "admin123"
      When User enter new Password "newPass" and confirm Password "cnfPass" and Save
      Then Validate that password its changed successfully

      Scenario: Logout
        When User click on menu and Logout
        Then User is redirected to Login Page



    Scenario: Edit Timesheet for an Employee
            When User click on PIM
            When User click on an Employee
            When User enter firstname "firstname" middlename "middlename" and lastname "lastname"
            Then User Save and Validate that Employee is updated successfully

    @AddEmployee
    Scenario: Add Candidate
      When User click on PIM
      When User click Add Employee
      When User give name "name" and middlename "name" and lastName "name" and Save
      Then Validate that Employes is Added

    @SearchEmployee
    Scenario: Search Employee
      When User click on Directory
      When User give Employee Informations and Search
      Then Emplooyee should be displayed

    @ClaimRequest
    Scenario: Create Claim Request
      When User click on Claim
      When User click on Assign Claim
      When User give Informations and Create
      Then Validate that request has been sent successfully

    @CreatePost
    Scenario: Create a Post
      When User click on Buzz
      When User post "message" and click on Post
      Then Validate that post has been sent






