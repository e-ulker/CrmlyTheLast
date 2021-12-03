Feature: Sending Announcement

  Background: Login with HR credentials
    Given The user logged in

  @wip
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

    Scenario: Verify that user shouldn't be able to add contact by manually that doesn't exist Employees and Departments contact lists.
      When User clicks Announcement subheading from More tab
      And User clicks Add More and type "user1" as a contact
      And User clicks Send button
      Then User should see the warning of specify at least one person
