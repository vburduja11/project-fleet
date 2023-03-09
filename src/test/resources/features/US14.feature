@B28G29-169
Feature: Default

	Background:
		#@B28G29-143
		Given the user is on the login page
		

	@B28G29-152
		Scenario Outline: US14AC1TC1 Verify  managers see default checked filters on the Campaigns page
		    Given the user logged in as "<userType>"
		    And the user navigate to "<tab>" - "<module>"
		    And user navigate to Filters and click
		    And user navigate to Manage filters and click
		    Then user should see all five options are checked by default
		
		    Examples:
		      | userType      | tab       | module    |
		      | store manager | Marketing | Campaigns |
		      | sales manager | Marketing | Campaigns |	


	@B28G29-154
		Scenario Outline: US14AC2TC2 Verify managers can uncheck any filter options
		    Given the user logged in as "<userType>"
		    And the user navigate to "<tab>" - "<module>"
		    And user navigate to Filters and click
		    And user navigate to Manage filters and click
		    Then Verify one or more options can be unchecked
		
		
		    Examples:
		      | userType      | tab       | module    |
		      | store manager | Marketing | Campaigns |
		      | sales manager | Marketing | Campaigns |