
#CRUD API
4 fields in the Students table:
"roll", "name", "age", "branch"

#Use

To fetch all students currently in the DB-
GET: localhost:8080/students

To fetch single student based on roll-
GET: localhost:8080/student/{roll}
Parameter: roll

To add new student in the DB-
POST: localhost:8080/student
Fields: roll, name, age, branch

To update a student record in DB-
PUT: localhost:8080/student
Based on: roll

To delete  a student record from DB-
DELETE: localhost:8080/student/{roll}
Parameter: roll
