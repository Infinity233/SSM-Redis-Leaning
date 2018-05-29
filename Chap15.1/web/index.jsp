<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>


<form id="form" action="/params/requestParam.do">
    <table>
        <tr>
            <td>角色名称</td>
            <td><input id="roleName" name="roleName" value=""/></td>
        </tr>
        <tr>
            <td>备注</td>
            <td><input id="note" name="note"/></td>
        </tr>
        <tr>
            <td></td>
            <td align="right"><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>

</body>
</html>