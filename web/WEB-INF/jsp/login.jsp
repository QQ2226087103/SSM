<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/studentController/doLogin " method="post" accept-charset="UTF-8">
    <p>用户名：</p>
    <label>
        <input type="text" name="studentName"/>
    </label>
    <p>密码：</p>
    <label>
        <input type="password" name="loginPwd"/>
    </label>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
