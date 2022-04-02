<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<br/>

<form method="post" action="/user/testNestedObject">
    <table align="center">
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="user.name"></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" name="user.age"></td>
        </tr>
        <tr>
            <td>性别</td>
            <td>
                <input type="radio" name="user.gender" value="男"> 男
                <input type="radio" name="user.gender" value="女" checked> 女
            </td>
        </tr>
        <tr>
            <td>日期</td>
            <td><input type="date" name="user.birthday"></td>
        </tr>
        <tr>
            <td>信息</td>
            <td><input type="text" name="user.info"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="reset" value="重置">
                <input type="submit" value="注册">
            </td>
        </tr>
    </table>
</form>
</body>
</html>