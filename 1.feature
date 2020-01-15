Feature: As a user, I should able to book a study room. 

	#{color:#FF0000}*User Story:*{color} 
	#
	#As a user, I should able to book a study room. 
	#
	# 
	#
	#{color:#FF0000}*AC1:*{color} 
	#
	#Verify that team lead is able to book a room. 
	@CT10-98
	Scenario: team lead should book a study room 
		Given user in login page
		When user enter credentials and click the login button
		Then user will be in homepage
		Then user choose a room
		And user successfully make a reservation