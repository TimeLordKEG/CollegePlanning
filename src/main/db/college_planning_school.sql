CREATE TABLE college_planning.school
(ID INT auto_increment PRIMARY KEY,
emailddress VARCHAR(255) UNIQUE,
school_name NVARCHAR(320),
location VARCHAR(255),
application_deadline VARCHAR(255),
pros VARCHAR(255), cons VARCHAR(255));