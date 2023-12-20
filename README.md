**Assignment of Add Employee to a Database**
![image](https://github.com/Ankushthalet/EmployWise/assets/116317444/4bda66b4-7bb9-445c-b7aa-88d506427adf)# EmployWise

**I use Mongodb no SQL database**

**How run project:**

1. SETUP DATABASE

![image](https://github.com/Ankushthalet/EmployWise/assets/116317444/072b6dcc-d52c-416a-901e-bd0d29080cd2)

Step 1:   install mongodb in your pc 
        a. Simply create a database of same name (ThaletManagements ) in your mongodb.  
        b. Create a database with any name but don't forget to add that name in " spring.data.mongodb.database=your database name"

  ![image](https://github.com/Ankushthalet/EmployWise/assets/116317444/d1697db6-94d6-4811-8b20-395416243219)

Step 2:    @Document(collection = "Emp")
           This is the name of Your Table (Collection name ) **you have to made new collection in your database with same name as** @Document(collection = "Emp")  

These Two are important steps of setup project 


2. How run API
         . Use Postman (is an API platform that simplifies each step of the API lifecycle and streamlines collaboration) or your comfort plateform for testing API.
         . Test Api one by one .
         . Use JSON format for testing .
   
   a. **POST**: use for store data in a database
   localhost:8080/employees/add
   
   /add -is used for add an Employee in Database ,you can see there code in Controller package 
   ![image](https://github.com/Ankushthalet/EmployWise/assets/116317444/a5a35ae1-e5fa-4c97-97d8-42cfb905f54f)

   b.** GET**: use for get data from a database
   localhost:8080/employees/all
   Provide you all employee that are available in your database
   ![image](https://github.com/Ankushthalet/EmployWise/assets/116317444/346932cf-9c12-4251-929c-e0d387d111d6)

   **You can Also get Employee by their id **
    localhost:8080/employees/931f6f78-2456-486d-bd0a-1b9b20531601 
   ![image](https://github.com/Ankushthalet/EmployWise/assets/116317444/642896df-c609-4834-a4cf-f4b20c799853)

   c. **DELETE **: just provide id of employee you want to delete in uri
   We want to delete md. Shadab from database
   ![image](https://github.com/Ankushthalet/EmployWise/assets/116317444/2e8e1040-1b65-4546-8bbe-ac86ef39499d)
   After Delete data will be delete from database
   
   d. **PUT**: use for update database
   you just have to provide the id in uri of that Employee you want to change and provide new body in JSON format
   ![image](https://github.com/Ankushthalet/EmployWise/assets/116317444/fe5d03df-7f87-4949-a1d9-82a9faab9517)


----------------------------------------------------------------------Intermediate -------------------------------------------------------------------
a. GET nth LEVEL Manager of an Employeer:

code is :![image](https://github.com/Ankushthalet/EmployWise/assets/116317444/343332ec-8d06-4fea-a10e-f0a5adbec7e5)
API
![image](https://github.com/Ankushthalet/EmployWise/assets/116317444/5a28dc9b-d3af-4b6d-9682-68c2aed62bdb)
To send a request to the getNthLevelManager endpoint, you can use a tool Postman, or a browser to make HTTP requests.
example using curl in the command line:curl -X GET "http://localhost:8080/employees/manager?employeeId=yourEmployeeId&level=2"
Replace yourEmployeeId with the actual ID of the employee for whom you want to retrieve the nth-level manager, and set the level parameter accordingly.

Alternatively, if you are using Postman:
Open Postman.
Set the request type to "GET".
Enter the URL: http://localhost:8080/employees/manager.
Add query parameters: employeeId and level with their respective values.
Click on the "Send" button.

Find LEVEL 1 Manager for Employee id =931f6f78-2456-486d-bd0a-1b9b20531601 

Enter the URL:  http://localhost:8080/employees/manager?employeeId=931f6f78-2456-486d-bd0a-1b9b20531601&level=1
![image](https://github.com/Ankushthalet/EmployWise/assets/116317444/b4563686-4d9e-40eb-bd08-0a1ff32c4ad9)
It return --> **Jane Smith** means it reports to Jane Smith at Level 1

Find LEVEL 2 Manager for Employee id =931f6f78-2456-486d-bd0a-1b9b20531601 
Enter the URL:  http://localhost:8080/employees/manager?employeeId=931f6f78-2456-486d-bd0a-1b9b20531601&level=2

![image](https://github.com/Ankushthalet/EmployWise/assets/116317444/b0d07b9f-79e0-45e3-9f2b-1a297cfed48e)
reportsTo = null shows that it will be a manager
It return -- >** Ankush** that is the manager at Level 2


b. Get Employee with pagination and sorting :

To send a request to the getEmployeesWithPaginationAndSorting endpoint, you can use a tool like curl, Postman, or a browser.
Here's an example using curl in the command line:
**curl -X GET "http://localhost:8080/employees/paged?page=0&size=5&sortBy=employeeName"**
Replace the values of page, size, and sortBy with your desired parameters.

Open Postman.
Set the request type to "GET".
Enter the URL: http://localhost:8080/employees/paged.
Add query parameters: page, size, and sortBy with their respective values.
Click on the "Send" button.
For example we want 
page=1,
size=5,
sortBy=employeeName
Then URL will be :
http://localhost:8080/employees/paged?page=1&size=5&sortBy=employeeName

Here is Output:
![image](https://github.com/Ankushthalet/EmployWise/assets/116317444/f95bd7cb-4dbb-4ca1-a306-142efe3b17e3)
![image](https://github.com/Ankushthalet/EmployWise/assets/116317444/19141f41-45fa-4f3b-9a5e-57c32deb90f7)

Thank You ...........................................................................................

   


           

