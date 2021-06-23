@createCampaign
Feature: Create Influencer Campaign functionalities
 

  @happyPath
  Scenario: User successfully created Influencer Campaign on Tribe website
    Given User is on Tribe Sign In page
    And User enters valid email
    And User enters valid password
    And User clicks Log In button
    And User clicks CREATE CAMPAIGN button
    When User clicks CREATE AN INFLUENCER CAMPAIGN button
    And User clicks BRAND LOGO box
   	And User uploads BRAND LOGO "Tribe_Image_1.png"
   	And User enters Brand name: "Generate Unique Brand Name"
   	And User clicks the check icon
   	And User selects Campaign objectives: "I'm launching a new product or service"
   	And User enters text in Campaign title field: "This is sample Campaign title"
   	And User uploads Cover image "Tribe_Image_2.png"
   	And User enters text in Call to action field: "This is sample Call to action"
   	And User enters text in About you field: "This is sample About you"
   	And User selects category from Category1: "Food & Drink"
   	And User clicks CONTINUE button
   	And User upload Visual Direction for board number 1 and image name "Tribe_Image_1.png"
   	And User upload Visual Direction for board number 2 and image name "Tribe_Image_2.png"
   	And User upload Visual Direction for board number 3 and image name "Tribe_Image_3.png"
   	And User enters Content we love from you: "This is sample text for content we'd love you"
   	And User enters DO's: "This is sample text for DO's"
   	And User enters Don'ts: "This is sample text for DON'Ts"
   	And User clicks plus sign for Twitter
   	And User enters hashtags in Twitter hashtag field: "#SampleTwitterHashTag"
   	And User enters Twitter url: "https://sample-twitter-url.com" 
   	And User clicks CONTINUE button
   	And User enters Estimated campaign budget: "50000"
   	And User selects Preferred gender for Creators: "All"
   	And User selects Where would you like your Creaters to be located?: "All"
   	And User selects Preferred age of your target audience?: "All"
   	And User selects What gender are you hoping to reach?: "All"
   	And User selects Where does this audience live?: "Australia"
   	And User clicks CONTINUE button
   	And User selects Start date today
   	And User selects default Campaign duration
   	And User clicks SCHEDULE CAMPAIGN button
   	And User enters Company address: "Sample Company Address"
   	And User enters Suburb/City: "Sample Suburb or City"
   	And User enters State: "Abra"
   	And User enters Zip/Postal code: "3019"
   	And User clicks SUBMIT button
   	Then User is successfully created Influencer Campaign
   	
   	@negativePath1
 Scenario: Verify error messages are displayed when user did not enter mandatory fields for Influencer Campaign Campaign Page
 		Given User is on Tribe Sign In page
    And User enters valid email
    And User enters valid password
    And User clicks Log In button
    And User clicks CREATE CAMPAIGN button
    When User clicks CREATE AN INFLUENCER CAMPAIGN button
    And User clicks BRAND LOGO box
   	And User uploads BRAND LOGO "Tribe_Image_1.png"
   	And User enters Brand name: "Generate Unique Brand Name"
   	And User clicks the check icon
   	And User clicks CONTINUE button
   	Then "Please select your campaign objective" is displayed
   	And "Please enter a campaign title" is displayed
   	And "Please include a cover image" is displayed
   	And "Please enter a call to action" is displayed
   	And "Please provide details about your product or brand" is displayed
   	And "Please select a category" is displayed
 
	@negativePath2
 Scenario: Verify error messages are displayed when user did not enter mandatory fields for Influencer Campaign Brief Page  	
   	Given User is on Tribe Sign In page
    And User enters valid email
    And User enters valid password
    And User clicks Log In button
    And User clicks CREATE CAMPAIGN button
    When User clicks CREATE AN INFLUENCER CAMPAIGN button
    And User clicks BRAND LOGO box
   	And User uploads BRAND LOGO "Tribe_Image_1.png"
   	And User enters Brand name: "Generate Unique Brand Name"
   	And User clicks the check icon
   	And User selects Campaign objectives: "I'm launching a new product or service"
   	And User enters text in Campaign title field: "This is sample Campaign title"
   	And User uploads Cover image "Tribe_Image_2.png"
   	And User enters text in Call to action field: "This is sample Call to action"
   	And User enters text in About you field: "This is sample About you"
   	And User selects category from Category1: "Food & Drink"
   	And User clicks CONTINUE button
   	And User waits for Brief page to be displayed
   	And User clicks CONTINUE button
   	Then "Please provide at least 3 moodboard images" is displayed
   	And "Please provide details" is displayed
   	And "Please provide at least one" is displayed
   	And "You’ll need to add at least one social media channel" is displayed

	@negativePath3
 Scenario: Verify error messages are displayed when user did not enter mandatory fields for Influencer Campaign Budget Page  	   	
 	  Given User is on Tribe Sign In page
    And User enters valid email
    And User enters valid password
    And User clicks Log In button
    And User clicks CREATE CAMPAIGN button
    When User clicks CREATE AN INFLUENCER CAMPAIGN button
    And User clicks BRAND LOGO box
   	And User uploads BRAND LOGO "Tribe_Image_1.png"
   	And User enters Brand name: "Generate Unique Brand Name"
   	And User clicks the check icon
   	And User selects Campaign objectives: "I'm launching a new product or service"
   	And User enters text in Campaign title field: "This is sample Campaign title"
   	And User uploads Cover image "Tribe_Image_2.png"
   	And User enters text in Call to action field: "This is sample Call to action"
   	And User enters text in About you field: "This is sample About you"
   	And User selects category from Category1: "Food & Drink"
   	And User clicks CONTINUE button
   	And User upload Visual Direction for board number 1 and image name "Tribe_Image_1.png"
   	And User upload Visual Direction for board number 2 and image name "Tribe_Image_2.png"
   	And User upload Visual Direction for board number 3 and image name "Tribe_Image_3.png"
   	And User enters Content we love from you: "This is sample text for content we'd love you"
   	And User enters DO's: "This is sample text for DO's"
   	And User enters Don'ts: "This is sample text for DON'Ts"
   	And User clicks plus sign for Twitter
   	And User enters hashtags in Twitter hashtag field: "#SampleTwitterHashTag"
   	And User enters Twitter url: "https://sample-twitter-url.com" 
   	And User clicks CONTINUE button
    And User waits for Budget page to be displayed 	
    And User clicks CONTINUE button
    Then "Please enter your campaign budget" is displayed
    And "Please select at least one gender" is displayed for Preffered gender for creators
    And "Please select location(s)" is displayed for Creators to be located
    And "Please select an age range" is displayed for target audience
    And "Please select at least one gender" is displayed for Hoping to reach
    And "Please select location(s)" is displayed for Audience live
    
@negativePath4
 Scenario: Verify error messages are displayed when user did not enter mandatory fields for Influencer Campaign Submit Page 
 		Given User is on Tribe Sign In page
    And User enters valid email
    And User enters valid password
    And User clicks Log In button
    And User clicks CREATE CAMPAIGN button
    When User clicks CREATE AN INFLUENCER CAMPAIGN button
    And User clicks BRAND LOGO box
   	And User uploads BRAND LOGO "Tribe_Image_1.png"
   	And User enters Brand name: "Generate Unique Brand Name"
   	And User clicks the check icon
   	And User selects Campaign objectives: "I'm launching a new product or service"
   	And User enters text in Campaign title field: "This is sample Campaign title"
   	And User uploads Cover image "Tribe_Image_2.png"
   	And User enters text in Call to action field: "This is sample Call to action"
   	And User enters text in About you field: "This is sample About you"
   	And User selects category from Category1: "Food & Drink"
   	And User clicks CONTINUE button
   	And User upload Visual Direction for board number 1 and image name "Tribe_Image_1.png"
   	And User upload Visual Direction for board number 2 and image name "Tribe_Image_2.png"
   	And User upload Visual Direction for board number 3 and image name "Tribe_Image_3.png"
   	And User enters Content we love from you: "This is sample text for content we'd love you"
   	And User enters DO's: "This is sample text for DO's"
   	And User enters Don'ts: "This is sample text for DON'Ts"
   	And User clicks plus sign for Twitter
   	And User enters hashtags in Twitter hashtag field: "#SampleTwitterHashTag"
   	And User enters Twitter url: "https://sample-twitter-url.com" 
   	And User clicks CONTINUE button
   	And User enters Estimated campaign budget: "50000"
   	And User selects Preferred gender for Creators: "All"
   	And User selects Where would you like your Creaters to be located?: "All"
   	And User selects Preferred age of your target audience?: "All"
   	And User selects What gender are you hoping to reach?: "All"
   	And User selects Where does this audience live?: "Australia"
   	And User clicks CONTINUE button
   	And User selects Start date today
   	And User selects default Campaign duration
   	And User clicks SCHEDULE CAMPAIGN button    
   	And User clicks SUBMIT button
   	Then "Please enter company address" is displayed
   	And "Please enter Suburb/City" is displayed
   	And "Please enter State/Region/Province" is displayed
   	And "Please enter a Zip/postal code" is displayed
    
 	