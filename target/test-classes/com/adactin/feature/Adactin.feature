Feature: user can book the hotel using adactin application.

Scenario: user login page

Given user launch the url of the adctin 

When user enter the username in the username field

And user ender the password in the password field

Then user should click the login and it will be navigate to the search page

Scenario: user search page 

When  user select the location in the location dropdown menu

And  user select the hotel  in the hotel dropdown menu

And user select the hoteltype  in the hoteltype dropdown menu

And user select the roomtype  in the roomtype dropdown menu

And user select the numberofrooms  in the numberofrooms dropdown menu

And user update the checkindate in the checkindate option

And user update the checkoutdate in the checkoutdate option

And user select the adultsperroom  in the adultsperroom dropdown menu

And user select the childrenperroom  in the childrenperroom dropdown menu

Then user click the search option and it will navigate to the continue page


