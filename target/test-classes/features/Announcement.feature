Feature: Sending Announcement

  Background: Login with HR credentials
    Given The user logged in

  @mus
  Scenario Outline: Verify that <FileTypeOrSize> file from local disks should be uploaded
    When     User clicks Announcement subheading from More tab
    And      User click Upload files and images after clicking upload file icon
    And      User upload "<FileName>" file
    Then     System display the uploaded "<FileName>" file under the Attached files and images section

    Examples:
      | FileTypeOrSize | FileName         |
      | txt            | test2.txt        |
      | mp3            | sample2.mp3      |
      | mp4            | sample2.mp4      |
      | 0 byte         | 0_ByteFile2      |
      | 100 Mb         | 100MbFile2.exe   |
      | No_extension   | NoExtensionFile2 |

  @mus
  Scenario: Verify that users should be added by selecting multiple contacts from Employees and Departments contact lists
    When User clicks Announcement subheading from More tab
    And User clicks Employees and departments Tab after clicking Add More
    And User select the multiple contacts from list
      | hr86@cybertekschool.com |
      | hr84@cybertekschool.com |
      | hr85@cybertekschool.com |
    Then User should be able to see selected contacts in To: input box
      | hr86@cybertekschool.com |
      | hr84@cybertekschool.com |
      | hr85@cybertekschool.com |

    @mus
    Scenario: Verify that user shouldn't be able to add contact by manually that doesn't exist Employees and Departments contact lists.
      When User clicks Announcement subheading from More tab
      And User clicks Add More and type "user1" as a contact
      And User clicks Send button
      Then User should see the warning of specify at least one person

  @mus @smoke
  Scenario: Verify that send announcement with content to at least one person
    When User clicks Announcement subheading from More tab
    And Write "anything" as a content in Announcement
    And Add "hr98@cybertekschool.com" contact by clicking to Add more
    And User clicks send
    Then User should be able to see sent Announcement "anything" on the top of the Active Stream

  @mus
  Scenario: Verify that user shouldnt be able to send announcement without content.
    When User clicks Announcement subheading from More tab
    And Add "hr98@cybertekschool.com" contact by clicking to Add more
    And User clicks send
    Then User should see the warning of message is not specified

  @mus
  Scenario: Verify that user shouldnt be able to send announcement without any contact.
    When User clicks Announcement subheading from More tab
    And Write "anything" as a content in Announcement
    And User clicks send
    Then User should see the warning of specify at least one person

  @mus
  Scenario Outline: Verify that insert videos by clicking on the video icon and entering the <VideoSource> video URL.
    When User clicks Announcement subheading from More tab
    And User clicks insert video icon
    And User enters "<VideoURL>"
    And User click Save button
    Then User should be able to see inserted video "<VideoURL>"
    Examples:
      | VideoSource | VideoURL                                    |
      | Youtube     | https://www.youtube.com/watch?v=k-7jJP7QFEM |
      | Vimeo       | https://vimeo.com/26                        |

  @mus
  Scenario: Verify that user shouldn't be able to insert videos by clicking on the video icon and entering the invalid video URL.
    When User clicks Announcement subheading from More tab
    And User clicks insert video icon
    And User enters invalid video URL "invalidvideo.com"
    Then User should see the warning Incorrect URL