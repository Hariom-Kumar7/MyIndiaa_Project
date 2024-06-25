# QA Engineer Assignment for MyIndiaa

This repository contains the QA assignment completed for MyIndiaa. The goal of this assignment was to write some effective test cases on any e-commerce platform through comprehensive testing strategies, including automated and manual testing, performance testing, and security testing.

## Table of Contents

- [Introduction](#introduction)
- [Automated Testing](#automated-testing)
- [Manual Testing](#manual-testing)
- [Performance Testing](#performance-testing)
- [Security Testing](#security-testing)
- [Bug Reporting and Tracking](#bug-reporting-and-tracking)
- [Documentation and Reporting](#documentation-and-reporting)
- [Submission Guidelines](#submission-guidelines)

## Automated Testing

For automated testing, I developed test scripts using Selenium. The test cases cover critical user flows such as user registration, login, product search, and checkout.

### Scripts and Tools

- **Tool Used**: Selenium WebDriver
- **Programming Language**: Java
- **Test Cases**:
  - User Registration
  - User Login
  - Product Search
  - Checkout Process

### Running the Tests

To run the automated tests, follow these steps:

1. Clone the repository.
2. Navigate to the `automated-tests` directory.
3. Run the following command to execute the tests:
    ```sh
    npm run test
    ```

Refer to the [Project report/README.md](./README/ProjectReport) for detailed instructions.

## Manual Testing

I developed a detailed test plan for manual testing of the e-commerce platform. The test plan includes test cases for various functionalities and steps for executing these tests.

### Test Plan

- **Areas Covered**:
  - User Registration
  - Login
  - Product Search
  - Cart and Checkout

### Test Execution

Manual test cases are documented in the [Test Plan and test ccases and test casesExcel Sheet](./README.md/manual-tests/Test_Plan.xlsx). Follow the steps in the sheet to execute the tests.

## Performance Testing

Performance testing was implemented using JMeter. Scenarios were created to simulate high user traffic and analyze the platform’s performance under load.

### Scenarios and Tools

- **Tool Used**: Apache JMeter
- **Scenarios**:
  - Simulate 1000 concurrent users
  - Test response times for various endpoints

### Running the Performance Tests

To run the performance tests, open the JMeter project file located in the `performance-tests` directory and execute the test plan.

## Security Testing

Security assessments were conducted using OWASP ZAP. Common vulnerabilities were identified and mitigation strategies were described.

### Tools and Methods

- **Tool Used**: OWASP ZAP
- **Vulnerabilities Assessed**:
  - SQL Injection
  - Cross-Site Scripting (XSS)
  - Cross-Site Request Forgery (CSRF)

### Security Report

The detailed security report is available in the [security-tests/Security_Report.pdf](./security-tests/Security_Report.pdf).

## Bug Reporting and Tracking

Bug tracking was managed using Jira. Bugs were reported, tracked, and managed throughout the development lifecycle.

### Tools and Processes

- **Tool Used**: Jira
- **Bug Reporting Process**:
  - Report bugs with detailed descriptions and steps to reproduce
  - Track the status of each bug
  - Assign bugs to relevant team members

### Bug Report

A summary of the reported bugs is available in the [Test cases and test scenarios sheet/Bug_Report.xlsx](README.md/Bug_Report.xlsx).

## Documentation and Reporting

Detailed documentation of the testing strategy and processes is provided, along with test reports summarizing the results of automated, manual, performance, and security tests.

### Documents
         Documerts are available in the README.md file.
- [Test Plan](./manual-tests/Test_Plan.xlsx)
- [Automated Test Scripts](./automated-tests)
- [Performance Test Plan](./performance-tests)
- [Security Test Report](./security-tests/Security_Report.pdf)
- [Bug Report](./bug-tracking/Bug_Report.xlsx)

