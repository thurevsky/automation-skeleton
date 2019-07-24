$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestCase01.feature");
formatter.feature({
  "line": 2,
  "name": "Search",
  "description": "Just search \"Wikipedia\" on Google Search\nThen blah blah blah",
  "id": "search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TestCase01"
    }
  ]
});
formatter.before({
  "duration": 16010196499,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "Open Google on Chrome",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am on the page on URL \"https://www.google.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I should see \"Google\" on title",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.google.com/",
      "offset": 25
    }
  ],
  "location": "StepDefinitions.i_am_on_the_page_on_URL(String)"
});
formatter.result({
  "duration": 3019612714,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Google",
      "offset": 14
    }
  ],
  "location": "StepDefinitions.i_should_see_on_title(String)"
});
formatter.result({
  "duration": 17687852,
  "error_message": "java.lang.Exception\n\tat stepDefinitions.StepDefinitions.i_should_see_on_title(StepDefinitions.java:22)\n\tat ✽.Then I should see \"Google\" on title(TestCase01.feature:8)\n",
  "status": "failed"
});
formatter.scenario({
  "line": 10,
  "name": "Search Wikipedia and verify",
  "description": "",
  "id": "search;search-wikipedia-and-verify",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I fill in \"\" with \"\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "click on \"\" button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should see \"\" on title",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 11
    },
    {
      "val": "",
      "offset": 19
    }
  ],
  "location": "StepDefinitions.i_fill_in_with(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 10
    }
  ],
  "location": "StepDefinitions.click_on_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 14
    }
  ],
  "location": "StepDefinitions.i_should_see_on_title(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 694893059,
  "status": "passed"
});
});