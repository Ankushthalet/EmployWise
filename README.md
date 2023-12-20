![image](https://github.com/Ankushthalet/EmployWise/assets/116317444/4bda66b4-7bb9-445c-b7aa-88d506427adf)# EmployWise
Assignment of Add Employee to a Database
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
         a. Use Postman (is an API platform that simplifies each step of the API lifecycle and streamlines collaboration) or your comfort plateform for testing API.
         b. Test Api one by one .
         c. Use JSON format for testing .
   POST: use for store data in a database
   localhost:8080/employees/add
   /add - is used for add an Employee in Database ,you can see there code in Controller package 
   ![image](https://github.com/Ankushthalet/EmployWise/assets/116317444/a5a35ae1-e5fa-4c97-97d8-42cfb905f54f)

   GET: use for get data from a database
   localhost:8080/employees/all
   ![Uploading image.png…]()

   
   all- get all the Employee from database
   **You can Also get Employee by their id **
    localhost:8080/employees/getall
   ![image](https://github.com/Ankushthalet/EmployWise/assets/116317444/642896df-c609-4834-a4cf-f4b20c799853)


![image](https://github.com/Ankushthalet/EmployWise/assets/116317444/40ce14fe-a253-44cc-b135-3ff33802d320)

           

