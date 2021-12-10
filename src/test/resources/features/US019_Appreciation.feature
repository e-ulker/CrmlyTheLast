Feature:Sending Appreciation


  Background:
    Given  user should be able to login as "humanResource" successfully

  #First Scenario:
  @REM-1030
  Scenario: user should open Appreciation window
    When the user clickss the MORE button
    And the user clickss the Appreciation button
    Then Appreciation window is displayed


    #TC01
  @REM-1039
  Scenario Outline: Verify that <FileTypeOrSize> file from local disks should be uploaded
    When     User clicks Appreciation subheading from More tabb
    And      User click Upload files and images after clicking upload file iconn
    And      User upload "<FileName>" filee
    Then     System display the uploaded "<FileName>" file under the Attached files and images sectionn

    Examples:
      | FileTypeOrSize | FileName         |
      | txt            | test2.txt        |
      | mp3            | sample2.mp3      |
      | mp4            | sample2.mp4      |
      | 0 byte         | 0_ByteFile2      |
      | 100 Mb         | 100MbFile2.exe   |
      | No_extension   | NoExtensionFile2 |




    #TC03
    @REM-1040
  Scenario: Verify that file name should be same and display after uploading the file.
    When User clicks Appreciation subheading from More tabb
    And User click Upload files and images after clicking upload file iconn
    And User upload "test2.txt" filee
    Then System display the name of uploaded file as "test2.txt"


    #TC04
    @REM-1041
  Scenario: Verify that users should be added by selecting multiple contacts from Employees and Departments contact lists
    When User clicks Appreciation subheading from More tabb
    And User clicks Employees and departments Tab after clicking Add Moree
    And User select the multiple contacts from listt
      | hr86@cybertekschool.com |
      | hr84@cybertekschool.com |
      | hr85@cybertekschool.com |
    Then User should be able to see selected contacts in To: input boxx
      | hr86@cybertekschool.com |
      | hr84@cybertekschool.com |
      | hr85@cybertekschool.com |



    #TC05
    @REM-1042
  Scenario Outline: Verify that attach a link that have link text & link URL by clicking on the link icon.
    When User clicks Appreciation subheading from More tabb
    And User clicks link icon
    And User enters link text "<LinkText>" and link URL "<LinkURL>"
    And User clicks Save button
    Then User should see attached link which has only Link URL or LinkText and URL "<LinkText>" "<LinkURL>"
    Examples:
      | LinkText | LinkURL                  |
      | google   | https://www.google.com/  |
      |          | https://www.google.com/  |
      | hotmail  | https://www.hotmail.com/ |





  #TC08
    @REM-1045
  Scenario: Verify that user shouldn't be able to insert videos by clicking on the video icon and entering the invalid video URL.
    When User clicks Appreciation subheading from More tabb
    And User clicks insert video iconn
    And User enters invalid videoo URL "invalidvideo.com"
    Then User should see the warning Incorrectt URL



  #TC09
    @REM-1046
  Scenario: Verify that send appreciation with content to at least one person
    When User clicks Appreciation subheading from More tabb
    And Write "anything" as a content in Appreciationn
    And Add "hr98@cybertekschool.com" contact by clicking to Add moree
    And User clicks sendd
    Then User should be able to see sent Appreciation "anything" on the top of the Active Streamm


    #TC010
    @REM-1047
  Scenario: Verify that user shouldnt be able to send appreciation without content.
    When User clicks Appreciation subheading from More tabb
    And Add "hr98@cybertekschool.com" contact by clicking to Add moree
    And User clicks sendd
    Then User should see the warning of message is not specifiedd


#TC011
    @REM-1048
  Scenario: Verify that user shouldnt be able to send appreciation without any contact.
    When User clicks Appreciation subheading from More tabb
    And Write "anything" as a content in Appreciationn
    And User clicks sendd
    Then User should see the warning of specify at least one personn



