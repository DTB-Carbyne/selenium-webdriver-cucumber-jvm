# Welcome to the farmdrop technical test for automation testers

# Prerequisites

Download the latest release of `Chrome Driver` [here](http://chromedriver.chromium.org/downloads) for your Linux and Mac system and install it in your `$HOME` directory.

## Set an environment variable for your system

You should specify what browser you would like to run the tests on by setting it up in an environment variable that the `setUp()` method will read. Currently, only Chrome is defined but any other can be specified if the correct web drivers are installed and defined.

For Linux and Mac, enter the following in your terminal:

`export browserName=Chrome`

# Run tests
Clean and run with default settings:

`mvn clean test`

Clean and run with another browser:

`mvn clean test -D browserName=<browser-name>`
