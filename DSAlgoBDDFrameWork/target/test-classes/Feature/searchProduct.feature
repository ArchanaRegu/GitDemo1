Feature: Search and place the order for products
@Landingpage
  Scenario: Search Experience for product search in both home and offers page
  Given User is on GreenCart Landing page
  When user searched with shortname "Tom" and extracted actual name of product
  Then user searched for "Tom" shortname in offers page to check if product exist
  And validate  landing page productname matches offerpage
    