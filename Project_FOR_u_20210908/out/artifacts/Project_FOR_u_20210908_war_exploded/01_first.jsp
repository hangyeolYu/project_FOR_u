<%--
  Created by IntelliJ IDEA.
  User: yuhangyeol
  Date: 2021/09/08
  Time: 6:56 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
  <head>
    <title>파일 업로드!</title>
  </head>
  <body>
  <form action="uploadAction.jsp" method="post"enctype="multipart/form-data">
    파일 : <input type="file" name="file"><br>
    <input type="submit" value="업로드!"><br>

  </form>
  </body>
</html>
