# automationPrac


This test suite contains scenario to verify summer dress added to the cart

# Framework Tools and Libraries
* **Main Programming Language**: Java
* **UI Automation**: Selenium-Webdriver
* **Supported Browsers**: chrome
* **Build tool**: Maven
* **IDE**: Intellij

The browser is Chrome.
Also, as in any Webdriver based test suite, you'll have to have [Chromedriver](https://sites.google.com/a/chromium.org/chromedriver/) available in your PATH

# Page Object Model
PageObjects are used to store the WebElements for a Web Page. A good practice is to have a separate class for every single WebPage. To avoid duplication for multiple pages which have common web page elements a Parent class can be created and the child class can then inherit.