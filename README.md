# Problem Scenario
Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.
Initially, you use a standard constructor for the User class: <br>
public User(String firstName, String lastName, String email,
           String address, String phone, int age) { <br>
     // ... <br>
} <br>
<br>
However, you encounter challenges: <br>
	• Registration forms: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration. <br>
	• Optional fields: Not all customers provide complete information, but the constructor forces them to. <br>
	• Data consistency: Changes to user profiles after registration can cause unexpected issues due to mutable fields. <br>
 <br>
Implement solution using the Builder Pattern to address the issue.

## UML Diagram

## Sample output
![valid](https://github.com/mfulo/builderPattern/assets/142382665/b6624c57-8c60-4f71-a954-b5d239f17786)
![invalid](https://github.com/mfulo/builderPattern/assets/142382665/aecbdf37-b260-4f4a-b242-4f88ded87266)
