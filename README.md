# 🚆 Train Consist Management App

## 📖 Overview

**TrainConsistManagementApp** is a console-based Java learning project that demonstrates how **Core Java** and **Data Structures** can be applied to model real-world railway train consist operations.

The application simulates how **bogies (passenger and goods)** are attached to a train while enforcing:

- Order of bogies in train formation
- Uniqueness of bogie identifiers
- Safety compliance rules for cargo transport
- Validation of input formats
- Capacity calculations and analytics
- Searching and sorting operations
- Performance benchmarking
- Exception handling mechanisms

Each Use Case (**UC1 – UC20**) introduces one Java concept incrementally, helping learners understand how theoretical programming concepts are applied in practical system design.

---

## 🎯 Learning Objectives

This project helps learners understand:

- Java program structure and execution flow
- Java Collections Framework (**List, Set, Map**)
- Object-Oriented Programming concepts
- Functional programming using **Streams API**
- Data validation using **Regular Expressions (Regex)**
- Business rule enforcement using **Lambda expressions**
- Sorting algorithms and searching techniques
- Exception handling (Checked & Runtime)
- Performance comparison techniques
- Defensive programming principles
- Algorithm implementation fundamentals

---

## 📦 Project Structure
TrainConsistManagementApp
│
├── UC1 Initialize Train Consist (List)
├── UC2 Add Passenger Bogies (ArrayList CRUD)
├── UC3 Unique Bogie IDs (HashSet)
├── UC4 Ordered Bogie Structure (LinkedList)
├── UC5 Ordered + Unique Bogies (LinkedHashSet)
├── UC6 Bogie Capacity Mapping (HashMap)
├── UC7 Sort Bogies by Capacity (Comparator)
├── UC8 Filter Bogies (Stream API)
├── UC9 Group Bogies (Collectors.groupingBy)
├── UC10 Aggregate Total Capacity (reduce)
├── UC11 Validate Train ID & Cargo Codes (Regex)
├── UC12 Safety Compliance for Goods Bogies (Streams allMatch)
├── UC13 Performance Comparison (Loops vs Streams)
├── UC14 Handle Invalid Bogie Capacity (Custom Exception)
├── UC15 Safe Cargo Assignment (try-catch-finally)
├── UC16 Manual Sorting using Bubble Sort
├── UC17 Sorting using Arrays.sort()
├── UC18 Linear Search for Bogie ID
├── UC19 Binary Search for Bogie ID
└── UC20 Exception Handling During Search Operations


---

## 💻 Technologies Used

- Java 8+
- Java Collections Framework
- Stream API
- Lambda Expressions
- Regular Expressions (Pattern & Matcher)
- JUnit 5 (Unit Testing)
- Exception Handling
- Sorting Algorithms
- Searching Algorithms

---

## 📘 Key Concepts Covered

| Concept | Description |
|--------|-------------|
| List / ArrayList | Dynamic storage of bogies |
| HashSet | Prevent duplicate bogie IDs |
| LinkedList | Maintain bogie order |
| LinkedHashSet | Preserve insertion order + uniqueness |
| HashMap | Map bogie to capacity |
| Comparator | Custom sorting logic |
| Streams API | Functional filtering, grouping and processing |
| reduce() | Aggregation of seating capacity |
| Regex | Train ID and Cargo Code validation |
| allMatch() | Safety compliance validation |
| nanoTime() | Performance benchmarking |
| Custom Exception | Domain-specific validation |
| try-catch-finally | Runtime exception handling |
| Bubble Sort | Manual sorting algorithm |
| Arrays.sort() | Optimized built-in sorting |
| Linear Search | Sequential search technique |
| Binary Search | Optimized divide-and-conquer search |
| IllegalStateException | Fail-fast defensive programming |

---

## 🖥️ Sample Output

### UC10 - Count Total Seats in Train
### UC10 - Count Total Seats in Train
Bogies in Train:
Sleeper -> 72
AC Chair -> 56
First Class -> 24
Sleeper -> 70

Total Seating Capacity of Train: 222


---

## ▶️ How to Run

### 1. Compile
javac TrainConsistManagementApp.java


### 2. Run
java TrainConsistManagementApp


---

## 🧪 Running Unit Tests (JUnit 5)

### Add dependency
org.junit.jupiter:junit-jupiter:5.10.0


### Test Folder Structure
src
│
├── main
│ └── UseCase classes
│
└── test
└── JUnit Test Classes


Run test files from IDE (IntelliJ / Eclipse).

---

## ✔ Example Valid Inputs

### Train ID Format
TRN-1234


### Cargo Code Format
PET-AB


---

## 🎓 Educational Value

This project demonstrates:

- How **data structures solve real-world engineering problems**
- Importance of choosing the **correct collection type**
- Difference between **List vs Set vs Map**
- How **Streams simplify data processing**
- How **sorting and searching algorithms work internally**
- Importance of **data validation and safety rules**
- Difference between **checked and runtime exceptions**
- Importance of **fail-fast validation**
- How **performance benchmarking** helps decision making
- How theory converts into **production-style design**

---

## 👨‍💻 Author

**Vineet Seth**

---

## 📌 Project Type

Educational Project  
Core Java + Data Structures Learning Implementation

---
