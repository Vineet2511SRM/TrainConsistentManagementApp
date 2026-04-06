# Train Consist Management App 🚆

## Overview
**TrainConsistManagementApp** is a console-based Java learning project that demonstrates how **Core Java** and **Data Structures** can be applied to model real-world railway train consist operations.

The application simulates how **bogies (passenger and goods)** are attached to a train while enforcing:

- ordering rules
- uniqueness constraints
- safety compliance
- validation
- data analysis

Each Use Case (**UC1–UC12**) introduces one Java concept incrementally, helping learners understand how theory translates into practical system design.

---

## Learning Objectives 🎯

This project helps learners understand:

- Application startup structure in Java
- Java Collections Framework (**List, Set, Map**)
- Object-Oriented Programming concepts
- Functional programming using **Streams**
- Data validation using **Regex**
- Business rule enforcement using **Lambda expressions**
- Aggregation, grouping, sorting and filtering operations

---

## Project Structure 📦
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
└── UC12 Safety Compliance for Goods Bogies (Streams allMatch)


---

## Technologies Used 💻

- Java 8+
- Java Collections Framework
- Stream API
- Lambda Expressions
- Regex (Pattern & Matcher)
- JUnit 5

---

## Key Concepts Covered 📘

| Concept | Description |
|--------|-------------|
| List / ArrayList | Dynamic storage of bogies |
| HashSet | Prevent duplicate bogie IDs |
| LinkedList | Maintain bogie order |
| LinkedHashSet | Preserve insertion order + uniqueness |
| HashMap | Map bogie to capacity |
| Comparator | Sort bogies by capacity |
| Streams API | Filtering, grouping, aggregation |
| reduce() | Calculate total seating capacity |
| Regex | Validate Train ID and Cargo Code |
| allMatch() | Enforce cargo safety rules |

---

## Sample Output 🖥️
UC10 - Count Total Seats in Train

Bogies in Train:
Sleeper -> 72
AC Chair -> 56
First Class -> 24
Sleeper -> 70

Total Seating Capacity of Train: 222


---

## How to Run ▶️

### Compile
javac TrainConsistManagementApp.java


### Run
java TrainConsistManagementApp


---

## Example Valid Inputs ✔

**Train ID**
TRN-1234


**Cargo Code**
PET-AB


---

## Educational Value 🎓

This project demonstrates:

- How data structures solve real operational problems
- Why choosing the right collection improves performance
- How business rules translate into program logic
- How modern Java simplifies data processing

---

## Author 👨‍💻
**Vineet Seth**