CREATE SCHEMA college_planning authorization sa;

CREATE TABLE college_planning.users
(id INT auto_increment PRIMARY KEY,
username NVARCHAR(320),
first_name VARCHAR(255),
last_name VARCHAR(255),
emailaddress VARCHAR(255), UNIQUE);

INSERT INTO college_planning.users values (1, 'TimeLord', 'Katie', 'Golden', 'kegolden78@gmail.com');

SELECT * FROM college_planning.users;