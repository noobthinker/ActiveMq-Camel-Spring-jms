<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="camel/int">send number message</a>
<br/>
send text message:
<form action="camel/text">
    text:<input type="text" name="text" value="Nokia"/>
    <input type="submit" />
</form>
</body>
</html>
