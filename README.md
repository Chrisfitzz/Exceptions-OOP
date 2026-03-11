# OOP Exceptions Lab – Hospital Management System

## Project Description
This project is a **Java Object-Oriented Programming (OOP) lab focused on exception handling**.  
It simulates a simple **Hospital Management System** where patients can be registered, prescriptions issued, and appointments scheduled.

The purpose of the lab is to help understand how **Java exceptions work**, including:

- Creating **custom exception classes**
- Handling **checked vs unchecked exceptions**
- Using **try–catch blocks**
- Designing programs that handle errors properly

The codebase intentionally contains several **bugs and incorrect exception implementations** that need to be identified and fixed as part of the lab.

---

## Features

The system includes basic hospital management functionality:

- Register and remove patients
- Search for patients by ID
- Update patient information
- Prescribe medication
- Schedule appointments
- Log system actions to a file

It also demonstrates the use of **custom exceptions**, such as:

- `PatientNotFoundException`
- `InvalidDosageException`
- `AppointmentConflictException`

---

## Project Structure

```
OOP-Exceptions/
│
├── src/
│   ├── HospitalApp.java
│   ├── HospitalSystem.java
│   ├── Patient.java
│   ├── Prescription.java
│   ├── MedicalLogger.java
│   │
│   ├── PatientNotFoundException.java
│   ├── InvalidDosageException.java
│   └── AppointmentConflictException.java
│
├── medical_log.txt
└── README.md
```

---

## How to Run

### 1. Compile the project

Navigate to the `src` folder and compile the Java files:

```bash
javac *.java
```

### 2. Run the application

```bash
java HospitalApp
```

The program will start a **command-line menu** where you can interact with the hospital system.

---

## Learning Objectives

This lab focuses on practicing:

- Creating **custom exceptions**
- Proper **exception handling**
- Correct use of **try–catch blocks**
- Understanding **exception propagation**
- Improving **program reliability through error handling**

---

## Notes

- Some files contain **intentional bugs related to exception handling**.
- The goal of the lab is to **identify, debug, and correct these issues**.
- The project demonstrates how exception handling helps build **more robust applications**.
