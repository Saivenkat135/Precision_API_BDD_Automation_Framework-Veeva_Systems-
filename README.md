# 🚀 API Automation Framework (Hybrid BDD)

## 📌 Project Overview

This project is a **Hybrid API Automation Framework** built to test REST APIs using modern industry practices.  
It is designed to validate the functionalities of the Swagger Petstore APIs with a strong focus on **scalability, reusability, and maintainability**.

The framework follows a **Behavior Driven Development (BDD)** approach using Cucumber, making test cases easy to read and understand even for non-technical stakeholders.

---

## 🎯 Objective

- Automate API test scenarios using a structured framework  
- Validate CRUD operations and cross-endpoint data consistency  
- Implement negative testing for error handling  
- Build a reusable and scalable automation solution  

---

## 🛠️ Technologies Used

- **Java** – Core programming language  
- **REST Assured** – API testing library  
- **Cucumber (BDD)** – For writing readable test scenarios  
- **JUnit** – Assertion and test execution  
- **Maven** – Build and dependency management  
- **Log4j (Optional Enhancement)** – Logging  
- **Postman** – API testing and collection management  

---

## 🧪 Test Cases Covered (Brief)

### ✅ Test Case 1: Pet Lifecycle (CRUD)
- Create a pet  
- Retrieve pet details  
- Update pet status  
- Delete pet and validate deletion  

---

### ✅ Test Case 2: Inventory Analysis
- Fetch inventory data  
- Fetch pets by status  
- Validate count consistency across endpoints  

---

### ✅ Test Case 3: Negative Testing
- Create user with invalid email  
- Fetch non-existing user  
- Attempt login with invalid credentials  

---

### ✅ Test Case 4: Cross-Endpoint Consistency
- Create pet with category  
- Update status to "sold"  
- Validate if pet exists in sold list  

---

## 🔄 Flow of Execution

        Feature File (Gherkin)
        ↓
        Step Definitions
        ↓
        Service Layer (API Calls)
        ↓
        REST Assured
        ↓
        API Server
        ↓
        Response Validation
        ↓
        Test Results


---

## 🏗️ Framework Architecture

![Architecture Diagram](diagrams/architecture.png)

### Key Components:

- **Feature Files** → Define test scenarios in Gherkin  
- **Step Definitions** → Implement test logic  
- **Service Layer** → Handles API calls  
- **Utilities** → Config, Test Data, Retry logic  
- **Base Class** → Common setup  

---

## ▶️ Execution Steps

1. Clone the repository  
2. Open project in IntelliJ IDEA  
3. Install dependencies using:
    mvn clean install

4. Run tests:
    mvn test


---

## 📊 Test Execution Results

- All test cases executed successfully  
- Dynamic data handling implemented  
- Retry mechanism ensures stability  
- API responses validated using assertions  

BUILD SUCCESS
Tests run: 4, Failures: 0, Errors: 0


---

## 🔗 Postman Collection

👉 [Click here to view Postman Collection](https://web.postman.co/workspace/My-Workspace~2e1ca2d7-b493-45da-8b0d-94b125b42523/collection/34055360-80617128-3e5a-4147-8650-d5caa26841e9?action=share&source=copy-link&creator=34055360)

---

## ⚠️ Challenges Faced & Solutions

### 🔸 API Inconsistency
- Issue: Data not immediately available  
- Solution: Implemented retry mechanism  

### 🔸 Dynamic Data Handling
- Issue: Static IDs caused conflicts  
- Solution: Used timestamp-based IDs  

### 🔸 Response Type Issues
- Issue: Long vs Integer mismatch  
- Solution: Used proper data types  

### 🔸Swagger Petstore API is NOT reliable
- Faced inconsistent API responses from the Swagger Petstore, causing mismatch in expected vs actual data.
- Handling dynamic data (IDs) was difficult, leading to failures in sequential API validations.
- Dealt with data type issues like Long vs Integer, causing runtime exceptions.
- Managing flaky tests due to API delays and unreliable backend required implementing retry/tolerance logic.

---

## 🎯 Conclusion

This project successfully demonstrates how to build a **robust API automation framework** using industry-standard tools.  
It validates multiple real-world scenarios including CRUD operations, data consistency, and error handling.

The framework is modular, scalable, and easy to extend for future enhancements.

---

## 🚀 What I Learned

- Designing a Hybrid Automation Framework  
- Implementing BDD using Cucumber  
- API Testing using REST Assured  
- Handling real-world API inconsistencies  
- Writing reusable and maintainable code  
- Cross-endpoint validation techniques  

---

## 💡 Final Impression

This project reflects strong practical knowledge of:
- API Automation  
- Framework Design  
- Problem Solving  
- Real-world testing challenges  

It showcases the ability to build a **production-ready automation framework** with scalability and maintainability in mind.

---