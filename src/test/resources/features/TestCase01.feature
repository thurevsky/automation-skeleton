@TestCase01
Feature: Search
	Just search "Wikipedia" on Google Search
	Then blah blah blah

Background: Open Google on Chrome
	Given I am on the page on URL "https://www.google.com/"
	Then I should see "Google" on title

Scenario: Search Wikipedia and verify
	When I fill in "//input[@name='q']" with "Wikipedia"
	And click on "//input[@name='btnK']" button
	Then I should see "Wikipedia - Google Search" or "Wikipedia - Penelusuran Google" on title
