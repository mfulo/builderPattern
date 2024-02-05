# Problem Scenario
Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.
Initially, you use a standard constructor for the User class: <br> <br>
&emsp; public User(String firstName, String lastName, String email,
           String address, String phone, int age) { <br>
&emsp; &emsp; // ...<br>
&emsp; } <br>
<br>
However, you encounter challenges: <br>
	• Registration forms: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration. <br>
	• Optional fields: Not all customers provide complete information, but the constructor forces them to. <br>
	• Data consistency: Changes to user profiles after registration can cause unexpected issues due to mutable fields. <br>
 <br>
Implement a solution using the Builder Pattern to address the issue.

## UML Diagram
![Blank diagram](https://github.com/mfulo/builderPattern/assets/142382665/930df35c-3828-4ace-a865-59a7c37ff3bb)


## Sample output
![valid](https://github.com/mfulo/builderPattern/assets/142382665/b6624c57-8c60-4f71-a954-b5d239f17786)

![invalid](https://github.com/mfulo/builderPattern/assets/142382665/7d33d8d5-326e-439e-bf91-1500f64fd217)

