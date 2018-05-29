<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script src="jQuery/jquery-3.3.1.min.js"></script>
    <script>

        var data = {
            roleName: 'role',
            note: 'note',
            pageParams: {
                start: 0,
                limit: 5
            }
        };

        function ccc() {
            $.post({
                url: "/params/findRoles.do",
                contentType: "application/json",
                data: JSON.stringify(data),
                success: function (result) {

                }
            });
        }

        function deleteRoles() {
            var idList = [1, 2, 3];
            $.post({
                url: "/params/deleteRoles.do",
                data: JSON.stringify(idList),
                contentType: "application/json",
                success: function () {

                }
            });
        }

        function addRoles() {
            var roleList = [
                {roleName: 'role_name_1', note: 'note_1'},
                {roleName: 'role_name_2', note: 'note_2'},
                {roleName: 'role_name_3', note: 'note_3'}
            ]
            $.post({
                url: "/params/addRoles.do",
                data: JSON.stringify(roleList),
                contentType: "application/json",
                success: function () {

                }
            });
        }

        $("document").ready(function () {
            $("#commit").click(function () {
                var str = $("form").serialize();
                alert("123");
                $.post({
                    url: "/params/commonParamPojo2.do",
                    data: str,
                    success: function () {

                    }
                });
            })
        });

    </script>

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
        <tr>
            <td></td>
            <td align="right"><input id="commit" type="button" value="序列化提交"></td>
        </tr>
    </table>
</form>
<button onclick="ccc()">传递JSON参数</button>
<button onclick="deleteRoles()">传递列表数据</button>
<button onclick="addRoles()">传递对象数据</button>
</body>
</html>