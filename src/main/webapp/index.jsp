<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/28/2022
  Time: 4:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>ProductDiscountCalculator</title>
  </head>
  <body>
  <form action="/DiscountServlet" method="post">
  <h2>Product Discount Calculator</h2>
  <p>Product Description</p>
  <input type="text" name="Description"/><br/>
 <p>List Price</p>
  <input type="number"name="ListPrice"/><br/>
  <p>Discount Percent</p>
  <input type="number"name="DiscountPercent"/><br/>
      <br/>
  <input type="submit" id="submit" value="Converter"/>
  </form>
  </body>
</html>
