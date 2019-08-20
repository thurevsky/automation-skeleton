@TestCase01
Feature: Search
	Just search "Wikipedia" on Google Search
	Then blah blah blah

Background: Open Google on Chrome
	Given User was on the homepage

Scenario: Search Wikipedia and verify
	When User fills in "Query Text Box" with "Wikipedia"
	And User clicks on "Search" button
	Then User should see "Wikipedia - Google Search" or "Wikipedia - Penelusuran Google" on title
