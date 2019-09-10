$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/search.feature");
formatter.feature({
  "name": "Tactics project",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Add to cart the product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Shuould enter the product name",
  "keyword": "When "
});
formatter.match({
  "location": "Search.user_Shuould_enter_the_product_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "Search.user_should_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the Travell bag",
  "keyword": "When "
});
formatter.match({
  "location": "Search.user_should_click_the_Travell_bag()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the  ADD to cart button",
  "keyword": "And "
});
formatter.match({
  "location": "Search.user_should_click_the_ADD_to_cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click checkout",
  "keyword": "And "
});
formatter.match({
  "location": "Search.user_should_click_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Should provide details in form",
  "keyword": "When "
});
formatter.match({
  "location": "Search.user_should_provide_details_in_form()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});