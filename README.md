# Assignment 7 - Employee Hash Table

## Student Name

Tatiana Jara

## Description

This Java program implements a hash table that stores complete `Employee` objects. The employee's name is used as the key for the hash function.
The program uses the generic `LinkedList3<Employee>` class to handle collisions through separate chaining. If two or more employee names hash to the same bucket, the `Employee` objects are stored in the same linked list instead of replacing each other.
The program also includes a `get(String name)` method that searches the correct bucket and returns the matching `Employee` object. If the employee is not found, the method returns `null`.

## Files

The project contains the following files:
- `Employee.java`
- `LinkedList3.java`
- `EmployeeHashTable.java`
- `EmployeeHashTableApp.java`
- `README.md`

## Program Features

- Stores complete `Employee` objects.
- Uses the employee's name as the hash key.
- Uses an array of `LinkedList3<Employee>` objects.
- Handles collisions using separate chaining.
- Adds employees to the hash table.
- Retrieves employees by name.
- Returns `null` when an employee is not found.
- Displays the hash table and its buckets.
- Demonstrates collision handling.

## How to Compile

Compile all Java files using:

```bash
javac *.java
```

## How to Run

Run the program using:

```bash
java EmployeeHashTableApp
```

## Program Testing

The program was tested by adding the following six employees:

- Amy
- May
- John
- Sarah
- David
- Emma

The program successfully retrieved three existing employees:

- Amy
- John
- Emma

The program also searched for `Michael`, an employee who was not added to the hash table. The search correctly reported that Michael was not found.

## Collision Test

The program demonstrates collision handling using the employee names `Amy` and `May`.

Both names produce the same hash bucket:

```text
Amy hashes to bucket: 5
May hashes to bucket: 5
Collision confirmed: Amy and May are stored in the same bucket.
```

This creates a collision.

The collision is handled using separate chaining with `LinkedList3<Employee>`. Both Employee objects are stored in the same bucket and can still be retrieved independently.

Example output:

```text
Collision confirmed: Amy and May are stored in the same bucket.

RETRIEVING EMPLOYEES AFTER COLLISION
------------------------------------
Found: Amy January 10, 2020
Found: May February 15, 2021
```

This verifies that one Employee object does not replace the other when a collision occurs.

## Gemini Use and Reflection

### Prompt 1

> Explain how separate chaining works in a Java hash table that stores Employee objects using a generic linked list.

Gemini helped me understand that each bucket of the hash table can contain a `LinkedList3<Employee>`. When two employee names produce the same hash value, both Employee objects can be stored in the linked list at that bucket instead of one employee replacing the other.

### Prompt 2

> Review my Employee hash table test cases and suggest how I can prove that collisions are handled correctly.

Gemini suggested displaying the bucket numbers and retrieving employees that hash to the same bucket. This helped me test the collision using Amy and May and verify that both employees could still be retrieved.

### Suggestion Changed or Rejected

Gemini suggested using Java's built-in `LinkedList` to simplify the implementation. I rejected this suggestion because the assignment specifically requires the generic `LinkedList3<T>` class from the textbook. I used `LinkedList3<Employee>` instead so that the program follows the assignment requirements.

### How I Verified the Program

I compiled and tested the final program in OnlineGDB.

I verified that:

- Six Employee objects were successfully added.
- Amy, John, and Emma were successfully retrieved.
- Searching for Michael returned no employee.
- Amy and May both hashed to bucket 5.
- Amy and May could both be retrieved after the collision.
- The hash table used separate chaining to store multiple employees in the same bucket.
- The program completed successfully with exit code 0.

## OnlineGDB Link

https://www.onlinegdb.com/s/as/390021

## GitHub Repository

https://github.com/tatiana-jara/cis287-employee-hash-table
