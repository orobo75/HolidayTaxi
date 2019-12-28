@sanity

  Feature: Access all ctas in FAQs Page
    Scenario: Loging to Agent page
      Given I log in to agent website
      When I click cta FAQ
      Then FAQs page should displayed

      When I click cta FAQsfeature
      Then  FAQsfeature should displayed