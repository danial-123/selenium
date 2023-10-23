Feature: order the product

  Scenario: successfully ordered the product
     Given i am on the login page
     When i give the valid credentials in the input fields
     And click on the login button
     And i sort the products
     And i add the product to cart and checkout 
     Then my product is successfully ordered
     And i logout from the website
