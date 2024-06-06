Feature: Scheduler functionality


Scenario: Check on Scheduler
Given login to Integrator
When Add scheduler for any pipe using cron scheduler
Then Sync for pipe should happen automatically
