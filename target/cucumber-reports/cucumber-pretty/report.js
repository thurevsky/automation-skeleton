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
  "duration": 7536381881,
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
  "duration": 3786764388,
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
  "duration": 29190234,
  "status": "passed"
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
  "name": "I fill in \"//input[@name\u003d\u0027q\u0027]\" with \"Wikipedia\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "click on \"//input[@name\u003d\u0027btnK\u0027]\" button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should see \"Wikipedia - Google Search\" or \"Wikipedia - Penelusuran Google\" on title",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "//input[@name\u003d\u0027q\u0027]",
      "offset": 11
    },
    {
      "val": "Wikipedia",
      "offset": 37
    }
  ],
  "location": "StepDefinitions.i_fill_in_with(String,String)"
});
formatter.result({
  "duration": 486094109,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//input[@name\u003d\u0027btnK\u0027]",
      "offset": 10
    }
  ],
  "location": "StepDefinitions.click_on_button(String)"
});
formatter.result({
  "duration": 1223155334,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Wikipedia - Google Search",
      "offset": 14
    },
    {
      "val": "Wikipedia - Penelusuran Google",
      "offset": 45
    }
  ],
  "location": "StepDefinitions.i_should_see_or_on_title(String,String)"
});
formatter.result({
  "duration": 93770032,
  "status": "passed"
});
formatter.after({
  "duration": 482835045,
  "status": "passed"
});
});