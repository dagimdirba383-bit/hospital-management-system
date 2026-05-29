# 🏥 Hospital Management System — Java OOP MVP

A simple console-based Hospital Management System built in Java demonstrating the four core OOP concepts from V1.0 to V4.0.

---

## 📁 Project Structure

```
HMS/
├── src/
│   ├── Person.java       ← Abstract base class
│   ├── Doctor.java       ← Subclass of Person
│   ├── Patient.java      ← Subclass of Person
│   └── Main.java         ← Entry point / console menu
├── out/                  ← Compiled .class files go here
└── README.md
```

---

## ▶️ How to Compile & Run

### Requirements
- Java JDK 11 or higher installed

### Step 1 — Open terminal in VS Code
Press `` Ctrl + ` ``

### Step 2 — Create output folder
```
mkdir out
```

### Step 3 — Compile
```
javac -d out src\Person.java src\Doctor.java src\Patient.java src\Main.java
```

### Step 4 — Run
```
java -cp out Main
```

---

## 💡 How the App Works

When you run the program you get a menu:

```
=== Hospital Management System ===
1. Add Doctor
2. Add Patient
3. Show All
4. Doctor Treats Patient
0. Exit
```

- **Add Doctor** — enter name, age, specialization
- **Add Patient** — enter name, age, disease
- **Show All** — lists all doctors and patients
- **Doctor Treats Patient** — pick a doctor and patient to demonstrate overloaded treat() methods

---

## 📚 OOP Concepts Reference

### V1.0 & V2.0 — Classes, Objects & Encapsulation

| Concept | File | Detail |
|---------|------|--------|
| Class definition | `Person.java` | Abstract class with `name`, `age` fields |
| Object instantiation | `Main.java` | `new Doctor(...)`, `new Patient(...)` |
| Private fields | `Person.java` | `private String name`, `private int age` |
| Getters | `Person.java` | `getName()`, `getAge()` |
| Encapsulated subclass fields | `Doctor.java` | `private String specialization` |

---

### V3.0 — Inheritance

| Concept | File | Detail |
|---------|------|--------|
| `extends` keyword | `Doctor.java` line 2 | `Doctor extends Person` |
| `extends` keyword | `Patient.java` line 2 | `Patient extends Person` |
| `super()` constructor call | `Doctor.java` line 7 | Calls `Person(name, age)` |
| `super()` constructor call | `Patient.java` line 7 | Calls `Person(name, age)` |
| Inherited methods reused | `Doctor.java` | Uses `getName()` from `Person` |

---

### V4.0 — Polymorphism

| Concept | File | Detail |
|---------|------|--------|
| Abstract method declared | `Person.java` line 14 | `abstract void displayInfo()` |
| Method **overriding** | `Doctor.java` line 19 | `@Override displayInfo()` |
| Method **overriding** | `Patient.java` line 16 | `@Override displayInfo()` |
| Method **overloading** | `Doctor.java` lines 23–28 | `treat(String)` and `treat(String, String)` |
| Superclass reference | Main.java showAll() | for (Person p : everyone) p.displayInfo() dispatches Doctor or Patient at runtime |

---

## ✅ completed tasks

- [x] Classes and Objects (V1.0 / V2.0)
- [x] Encapsulation — private fields + getters (V2.0)
- [x] Inheritance — Doctor and Patient extend Person (V3.0)
- [x] Method Overriding — runtime polymorphism (V4.0)
- [x] Method Overloading — compile-time polymorphism (V4.0)
- [x] Superclass references to subclass objects (V4.0)
- [x] Well-commented code
- [x] Standard Java naming conventions

---

## 👤 Author

Hospital Management System — Java OOP Course MVP Project
