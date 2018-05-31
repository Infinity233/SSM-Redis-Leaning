<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script src="jQuery/jquery-3.3.1.min.js"></script>

</head>
<body>

<form action="/validate/validator.do">
    <table>
        <tr>
            <td>产品编号：</td>
            <td><input name="productId"></td>
        </tr>
        <tr>
            <td>用户编号：</td>
            <td><input name="userId"></td>
        </tr>
        <tr>
            <td>交易日期：</td>
            <td><input name="date"></td>
        </tr>
        <tr>
            <td>价格：</td>
            <td><input name="price"></td>
        </tr>
        <tr>
            <td>数量：</td>
            <td><input name="quantity"></td>
        </tr>
        <tr>
            <td>交易金额：</td>
            <td><input name="amount"></td>
        </tr>
        <tr>
            <td>用户邮件：</td>
            <td><input name="email"></td>
        </tr>
        <tr>
            <td>备注：</td>
            <td><input name="note" id="note" cols="20" rows="5"></td>
        </tr>
        <tr>
            <td colspan="2" align="right"><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>

</body>
</html>