
<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    </body>
     <a href="javascript:history.go(-1)" style="postion:absolute; top:10px; left:30px">Go Back</a>
        <h2>Alien Details</h2>

         <form action="GenerateEmployee" >


                <label for="ename">Enter EmployeeName :</label>
                <input type="text" id="ename" name="ename" required><br>
                 <label for="edesignation">Enter Employee Designation :</label>
                 <input type="text" id="edesignation" name="edesignation" required><br>
                <label for="esalary">Enter Employee Salary :</label>
                <input type="text" id="esalary" name="esalary" required><br>
                 <label for="street">Enter street :</label>
                                <input type="text" id="steet" name="street" required><br>
                                 <label for="village">Enter Employee village :</label>
                                 <input type="text" id="village" name="village" required><br>
                                <label for="district">Enter Employee district :</label>
                                <input type="text" id="district" name="district" required><br>
                      <label for="projectname">Enter Employee Project Name :</label>
                     <input type="text" id="projectname" name="ProjectName" required><br>
                      <label for="submitionDate">Enter the Submition Date:</label>
                      <input type="text" id="submitionDate" name="submitionDate" required><br>



                <input type="submit" value="Submit">


            </form>

    </body>
</html>