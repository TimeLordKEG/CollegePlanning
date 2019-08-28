CREATE SCHEMA college_planning authorization sa;

CREATE TABLE college_planning.users(id INT PRIMARY KEY,
username NVARCHAR(320),
first_name VARCHAR(255),
last_name VARCHAR(255),
emailaddress NVARCHAR(320));

INSERT INTO college_planning.users values (1, 'TimeLord', 'Katie', 'Golden', 'kegolden78@gmail.com');
INSERT INTO college_planning.users values (2, 'Reba Penguin', 'Rebecca', 'Alvey', 'rebapenguin@gmail.com');

SELECT * FROM college_planning.users;