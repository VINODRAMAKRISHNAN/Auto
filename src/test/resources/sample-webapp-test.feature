Feature: Item1 - Validate the web site pages
  Navigate to the Test page.
  Enter the values in two text boxes. 
  Hit concatenate button to populate the result in the third textbox.
  Validate the result populated is as expected.

  Scenario Outline: JIRA001 Scenario for new ticket - Concatenate two strings in the Test page
    Given I am using app url within <browsertarget> browser to navigate to the Test page
    And I have entered <firststring> into the first text box
    And Then I have entered <secondstring> into the second text box
    When I press concatenate button
    Then the result should be <resultstring> on the third text box
	
	  @SPRINT1 @REGRESSION
    Examples: 
      | browsertarget | firststring | secondstring | resultstring |
      | chrome        | abc1        | def1         | abc1def1     |
	  
	  
  Scenario Outline: Smoke Test - Basic Navigation testing 
    Given I am using app url within <browsertarget> browser to navigate to the Test page

    @SMOKE
    Examples: 
      | browsertarget |
      | chrome        |
	  
	  
  Scenario Outline: Different scenrio for Regression - Concatenate two strings in the Test page
    Given I am using app url within <browsertarget> browser to navigate to the Test page
    And I have entered <firststring> into the first text box
    And Then I have entered <secondstring> into the second text box
    When I press concatenate button
    Then the result should be <resultstring> on the third text box

    @REGRESSION
    Examples: 
      | browsertarget | firststring | secondstring | resultstring |
      | chrome        | xyz         | pqr         | xyzpqr        |	  
	  
	  @CROSSBROWSER
    Examples: 
      | browsertarget | firststring | secondstring | resultstring |
      | chrome        | xyz         | pqr         | xyzpqr        |
	    | firefox       | xyz         | pqr         | xyzpqr        |
	  
	  
	  
