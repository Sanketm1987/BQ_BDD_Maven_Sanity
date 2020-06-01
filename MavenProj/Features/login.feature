Feature: SanityTest
#@Scenrio1
 #Scenario: Login to SCOE
    #Given User open Chrome Browser
    #And SCOE URL is open "https://mijn.uat.tele2zakelijk.nl/Login.do"
    #And Enter Username "rohan.manjunath@tele2.com" and password as "Abcd1234"
    #When I click Login button
    #Then Login is sucessful
    #And User opens Account creation page
    #And Enter details for Account creation
    #Then Account creation should be successful
    #And enter Account to place order 
    #And Enter order details
    #Then order should be placed successful
        #
#@Scenrio2 
 #Scenario: Validate P550 order in DB 
    #Given User validate order status in DB
    #Then order should be placed successful
@Scenrio3 
 Scenario: Place P510 Hosted voice Sanity
    Given User open Chrome Browser
    And SCOE URL is open "https://mijn.int.tele2zakelijk.nl/Login.do"
    And Enter Username "rohan.manjunath@tele2.com" and password as "Abcd1234"
    When I click Login button
    Then Login is sucessful
    And User opens Account creation page
    And Enter details for Account creation
    Then Account creation should be successful
    And enter Account to place HostedVoice order 
    And Enter details for HostedVoice order
   
@Scenrio4 
 Scenario: Validate HostedVoice order in DB 
 Given User validate Hosted Voice order status in DB
 
    