Feature: Checking project functionality

Scenario: create new project



Given Login to the cloras application with given credentials
When Click on projects icon and click click on Add new button
And Enter project name and description and clikc on save
Then A new project is created
