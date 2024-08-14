Feature: place the order for products
@Offerspage
  Scenario: Find Experience for product search in both home and offers page
  Given User is on GreenCart Landing page
  When user searched with shortname "Tom" and extracted actual name of product
  And Added 3 items of the selected product to the cart
  Then User proceeds to Checkout and validate the "Tom" in checkout page
  And User has ability to enter promocode and place the order