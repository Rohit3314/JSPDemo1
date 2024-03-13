<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>details</title>
</head>
<body>

         <div align="center">
              <h2> User's List </h2>
              <br><br>
              <table border="1">
              <thead>
              <tr>
                              <th> ID </th>
                              <th> Password </th>
                              
                 </tr>
                 </thead>
                 
                 <tbody>
                 
           <tr th:each="book :${Loginmodel}" > 
                <td th: text="${book.id}"></td> 
                <td th: text="${book.pswd}"></td> 
             </tr> 
                                    
                </tbody>
                </table>
                </div>

</body>
</html>