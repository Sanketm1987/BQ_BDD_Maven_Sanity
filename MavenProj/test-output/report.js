$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "SanityTest",
  "description": "",
  "id": "sanitytest",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login to SCOE",
  "description": "",
  "id": "sanitytest;login-to-scoe",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User open Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "SCOE URL is open \"https://mijn.uat.tele2zakelijk.nl/Login.do\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Enter Username \"karthik.murugan@t-mobile.nl\" and password as \"Abcd1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click Login button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Login is sucessful",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User opens Account creation page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Enter details for Account creation",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Account creation should be successful",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "enter Account to place order",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Enter order details",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "order should be placed successful",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.user_open_Chrome_Browser()"
});
formatter.result({
  "duration": 5856651901,
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
  "duration": 6949794400,
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
  "duration": 304823899,
  "status": "passed"
});
formatter.match({
  "location": "steps.i_click_Login_button()"
});
formatter.result({
  "duration": 7270562100,
  "status": "passed"
});
formatter.match({
  "location": "steps.login_is_sucessful()"
});
formatter.result({
  "duration": 27364500,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_opens_Account_creation_page()"
});
formatter.result({
  "duration": 10852500,
  "status": "passed"
});
formatter.match({
  "location": "steps.enter_details_for_Account_creation()"
});
formatter.result({
  "duration": 24932573299,
  "status": "passed"
});
formatter.match({
  "location": "steps.account_creation_should_be_successful()"
});
formatter.result({
  "duration": 34224238200,
  "status": "passed"
});
formatter.match({
  "location": "steps.enter_Account_to_place_order()"
});
formatter.result({
  "duration": 24149531901,
  "status": "passed"
});
formatter.match({
  "location": "steps.enter_order_details()"
});
formatter.result({
  "duration": 32499919599,
  "status": "passed"
});
formatter.match({
  "location": "steps.order_should_be_placed_successful()"
});
formatter.result({
  "duration": 28900,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Validate P550 order in DB",
  "description": "",
  "id": "sanitytest;validate-p550-order-in-db",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "User validate order status in DB",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "order should be placed successful",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.user_validate_order_status_in_DB()"
});
formatter.result({
  "duration": 26107139500,
  "error_message": "java.lang.AssertionError: ORDER FAILLED\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat pageObjects.checkCLADB.checkorderInDB(checkCLADB.java:138)\r\n\tat stepDefinitions.steps.user_validate_order_status_in_DB(steps.java:116)\r\n\tat ✽.Given User validate order status in DB(./Features/login.feature:17)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "steps.order_should_be_placed_successful()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 20,
  "name": "Place P510 Hosted voice Sanity",
  "description": "",
  "id": "sanitytest;place-p510-hosted-voice-sanity",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "User open Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "SCOE URL is open \"https://mijn.int.tele2zakelijk.nl/Login.do\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Enter Username \"karthik.murugan@t-mobile.nl\" and password as \"Abcd1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click Login button",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Login is sucessful",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User opens Account creation page",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Enter details for Account creation",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Account creation should be successful",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "enter Account to place HostedVoice order",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Enter details for HostedVoice order",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_open_Chrome_Browser()"
});
formatter.result({
  "duration": 4524458500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://mijn.int.tele2zakelijk.nl/Login.do",
      "offset": 18
    }
  ],
  "location": "steps.scoe_URL_is_open(String)"
});
formatter.result({
  "duration": 5428968800,
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
  "duration": 331842701,
  "status": "passed"
});
formatter.match({
  "location": "steps.i_click_Login_button()"
});
formatter.result({
  "duration": 4636316199,
  "status": "passed"
});
formatter.match({
  "location": "steps.login_is_sucessful()"
});
formatter.result({
  "duration": 21985500,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_opens_Account_creation_page()"
});
formatter.result({
  "duration": 27158599,
  "status": "passed"
});
formatter.match({
  "location": "steps.enter_details_for_Account_creation()"
});
formatter.result({
  "duration": 24880287899,
  "status": "passed"
});
formatter.match({
  "location": "steps.account_creation_should_be_successful()"
});
formatter.result({
  "duration": 34227481300,
  "status": "passed"
});
formatter.match({
  "location": "steps.enter_Account_to_place_HostedVoice_order()"
});
formatter.result({
  "duration": 24178976599,
  "status": "passed"
});
formatter.match({
  "location": "steps.enter_details_for_HostedVoice_order()"
});
formatter.result({
  "duration": 46198924700,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@value\u003d\u0027Add To Cart\u0027]\"}\n  (Session info: chrome\u003d81.0.4044.138)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027T210VDIDEV0512\u0027, ip: \u002710.206.188.82\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.138, chrome: {chromedriverVersion: 81.0.4044.20 (f006328e39a97..., userDataDir: C:\\Users\\sankmung\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:57391}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 143a7fed9d2828f9e7060c30fc3fe74f\n*** Element info: {Using\u003dxpath, value\u003d//input[@value\u003d\u0027Add To Cart\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat pageObjects.Place510HV.placeBHVorder(Place510HV.java:170)\r\n\tat stepDefinitions.steps.enter_details_for_HostedVoice_order(steps.java:128)\r\n\tat ✽.And Enter details for HostedVoice order(./Features/login.feature:30)\r\n",
  "status": "failed"
});
});