<%--
  Created by IntelliJ IDEA.
  User: min2208
  Date: 23/09/2019
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/Product_discount_war_exploded/discount" method="post">
    <label >Product Description</label><br>
    <h4 >SamSung Note 9</h4>
    <label >List Price</label><br>
    <input type="number" name="price" placeholder="Price" ><br>
    <label >Discount percent</label><br>
    <input type="number" name="discount" placeholder="%" ><br>
    <input type="submit" value="submit">
  </form>
  </body>
</html>
