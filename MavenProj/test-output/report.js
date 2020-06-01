$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "SanityTest",
  "description": "",
  "id": "sanitytest",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario: Login to SCOE"
    },
    {
      "line": 4,
      "value": "#Given User open Chrome Browser"
    },
    {
      "line": 5,
      "value": "#And SCOE URL is open \"https://mijn.uat.tele2zakelijk.nl/Login.do\""
    },
    {
      "line": 6,
      "value": "#And Enter Username \"karthik.murugan@t-mobile.nl\" and password as \"Abcd1234\""
    },
    {
      "line": 7,
      "value": "#When I click Login button"
    },
    {
      "line": 8,
      "value": "#Then Login is sucessful"
    },
    {
      "line": 9,
      "value": "#And User opens Account creation page"
    },
    {
      "line": 10,
      "value": "#And Enter details for Account creation"
    },
    {
      "line": 11,
      "value": "#Then Account creation should be successful"
    },
    {
      "line": 12,
      "value": "#And enter Account to place order"
    },
    {
      "line": 13,
      "value": "#And Enter order details"
    },
    {
      "line": 14,
      "value": "#Then order should be placed successful"
    },
    {
      "line": 15,
      "value": "#"
    },
    {
      "line": 16,
      "value": "#"
    },
    {
      "line": 17,
      "value": "#"
    },
    {
      "line": 18,
      "value": "#"
    },
    {
      "line": 19,
      "value": "#Scenario: Validate P550 order in DB"
    },
    {
      "line": 20,
      "value": "#Given User validate order status in DB"
    },
    {
      "line": 21,
      "value": "#Then order should be placed successful"
    }
  ],
  "line": 23,
  "name": "Place P510 Hosted voice Sanity",
  "description": "",
  "id": "sanitytest;place-p510-hosted-voice-sanity",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "User open Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "SCOE URL is open \"https://mijn.uat.tele2zakelijk.nl/Login.do\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Enter Username \"karthik.murugan@t-mobile.nl\" and password as \"Abcd1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click Login button",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "Login is sucessful",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User opens Account creation page",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Enter details for Account creation",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Account creation should be successful",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "enter Account to place HostedVoice order",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Enter details for HostedVoice order",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_open_Chrome_Browser()"
});
formatter.result({
  "duration": 6218167200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://mijn.uat.tele2zakelijk.nl/Login.do",
      "offset": 18
    }
  ],
  "location": "steps.scoe_URL_is_open(String)"
});
formatter.result({
  "duration": 6685404700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "karthik.murugan@t-mobile.nl",
      "offset": 16
    },
    {
      "val": "Abcd1234",
      "offset": 62
    }
  ],
  "location": "steps.enter_Username_and_password_as(String,String)"
});
formatter.result({
  "duration": 491259100,
  "status": "passed"
});
formatter.match({
  "location": "steps.i_click_Login_button()"
});
formatter.result({
  "duration": 6853336700,
  "status": "passed"
});
formatter.match({
  "location": "steps.login_is_sucessful()"
});
formatter.result({
  "duration": 36344300,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_opens_Account_creation_page()"
});
formatter.result({
  "duration": 51106800,
  "status": "passed"
});
formatter.match({
  "location": "steps.enter_details_for_Account_creation()"
});
formatter.result({
  "duration": 24903730800,
  "status": "passed"
});
formatter.match({
  "location": "steps.account_creation_should_be_successful()"
});
formatter.result({
  "duration": 34240063100,
  "status": "passed"
});
formatter.match({
  "location": "steps.enter_Account_to_place_HostedVoice_order()"
});
formatter.result({
  "duration": 17083657900,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@id\u003d\u0027productCategory\u0027 and text()\u003d\u0027FMC\u0027]\"}\n  (Session info: chrome\u003d81.0.4044.138)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027T210VDIDEV0512\u0027, ip: \u002710.206.188.82\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.138, chrome: {chromedriverVersion: 81.0.4044.20 (f006328e39a97..., userDataDir: C:\\Users\\sankmung\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:62286}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: dc24ca327c2ccc7fa1618c02d1caa4e0\n*** Element info: {Using\u003dxpath, value\u003d//a[@id\u003d\u0027productCategory\u0027 and text()\u003d\u0027FMC\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat pageObjects.Place510HV.BHVselectAccount(Place510HV.java:99)\r\n\tat stepDefinitions.steps.enter_Account_to_place_HostedVoice_order(steps.java:123)\r\n\tat ✽.And enter Account to place HostedVoice order(./Features/login.feature:32)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "steps.enter_details_for_HostedVoice_order()"
});
formatter.result({
  "status": "skipped"
});
});