/* Employee table creation */
CREATE TABLE Employee (
    Employee_id int AUTO_INCREMENT PRIMARY KEY,
    First_name VARCHAR(50),
	Last_name VARCHAR(50),
	Salary int,
	Joining_date Date,
    Departement  VARCHAR(50) 
);

/* Employee table creation */
CREATE TABLE reward (
    Employee_ref_id int,
    date_reward Date,
	amount int,
    FOREIGN KEY (Employee_ref_id) REFERENCES Employee(Employee_id)
);

/* queries to insert into employee */
INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (1, 'Bob', 'Kinto', 1000000, "2019-01-20", "Finance");
INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (2, 'Jerry', 'Kansxo', 6000000, "2019-01-15", "IT");
INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (3, 'Philip', 'Jose', 8900000, "2019-02-05", "Banking");
INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (4, 'John', 'Abraham', 2000000, "2019-02-25", "Insurance");
INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (5, 'Michael', 'Mathew', 2200000, "2019-02-28", "Finance");
INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (6, 'Alex', 'chreketo', 4000000, "2019-05-10", "IT");
INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (7, 'Yohan', 'Soso', 1230000, "2019-06-20", "Banking");

/* queries to insert into reward */
INSERT INTO reward (Employee_ref_id, date_reward, amount) VALUES (1, '2019-05-11', '1000');
INSERT INTO reward (Employee_ref_id, date_reward, amount) VALUES (2, '2019-02-15', '5000');
INSERT INTO reward (Employee_ref_id, date_reward, amount) VALUES (3, '2019-04-22', '2000');
INSERT INTO reward (Employee_ref_id, date_reward, amount) VALUES (1, '2019-06-20', '8000');



Assignment: 

1. Get all the employees
select*from employee

2. Display the firstname and the last name of all employees
select First_name,Last_name from Employee;

3. Display all the values of the "First_Name" column using the alias "Employee Name"
select First_name AS Employee_Name from Employee;

4. Get all "Last_Name" in lowercase
select LOWER(Last_name) from Employee;

5. Get all the Last_Name in upper case
select UPPER(Last_name) from Employee;

6. Get unique "Department"
select DISTINCT(Departement) from employee;

7. Get the first 4 characters of "First_Name" column
select substring(First_name,1,4) from employee;

8. Get the position of the letter 'h' in 'John'
SELECT INSTR(First_name,'h') from Employee WHERE First_name = 'John';
                           or
select position('h' in 'John');						   

9. Get all the values from the "First_Name" column after removing white space on the right
SELECT First_name,length(First_name),length(RTrim(First_name)) FROM Employee;

10.Get all the values from the "First_Name" column after removing white space on the left
SELECT First_name,length(First_name),length(LTrim(First_name)) FROM Employee;

11.Get the length of the text in the "First_Name" column
SELECT First_name,length(First_name) FROM Employee;

12.Get the employee's first name after replacing 'o' with '#'
select First_name,REPLACE(First_name,'o','#') from employee;

13.Get the year, month and day from the "joining_date" column
select year(Joining_date), month(Joining_date), day(Joining_date) from employee;

14.Get all the employees in ascending order by first name 
select First_name from employee order by First_name ASC;

15.Get all employees in the descending order by firstname
select First_name from employee order by First_name DESC;

16.Get all employees in the ascending order by firstname and descending order by salary
select First_name from employee order by First_name ASC , Salary DESC;

17.Get employees whose firstname is "Bob"
select First_name from employee where First_name like "Bob%";
               or
select First_name from employee where First_name='Bob';			   

18.Get employees whose firstname is "Bob" or"Alex"
select First_name from employee where First_name IN ('Bob','Alex');

19.Get employees whose first name is neither "Bob" nor "Alex"
select First_name from employee where First_name NOT IN ('Bob','Alex');

20.Get all the details about employees whose firstname begins with 'J' and contains 4 letters.
select * from employee where First_name like "J%" and length(4);

21.Get all the details of employee whose participation month(joining_date) is "January"
select * from employee where month(Joining_date)='01';

22.Get all the details of the employees who joined before March 1, 2019
select * from employee where Joining_date<'2019-03-01';

23.Get the difference betwen the "Joining_Date" and "date_reward" column
select DateDiff(date_reward,Joining_date) AS DateDiff from employee,reward where employee.Employee_id=reward.Employee_ref_id;













