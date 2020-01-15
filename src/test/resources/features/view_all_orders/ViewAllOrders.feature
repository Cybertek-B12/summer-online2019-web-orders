@view_all_orders
Feature: View All Orders
  As user, I want to be able to see list of orders
  as table. Table must contain information about name,
  product id, date of order, address and payment card information

  Scenario: Verify column names
    Given I am on the login page
    Then I login as tester
    And I should be able to see following columns:
      | Name        |
      | Product     |
      | #           |
      | Date        |
      | Street      |
      | City        |
      | State       |
      | Zip         |
      | Card        |
      | Card Number |
      | Exp         |