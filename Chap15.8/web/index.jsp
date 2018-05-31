<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script src="jQuery/jquery-3.3.1.min.js"></script>

</head>
<body>

<form action="/fileupload/uploadMultipartFile.do" enctype="multipart/form-data">
    <input type="file" name="file" value="请选择上传"/>
    <input type="text" name="idd"/>
    <input type="submit" value="提交"/>
</form>

</body>
</html>