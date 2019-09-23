<%--
  Created by IntelliJ IDEA.
  User: kelechi
  Date: 20/09/2019
  Time: 5:11 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
    <g:form controller="tweet" action="saveTweet">
        <label>Your Timeline</label><br/>
        <g:textField name="message" value="whats happening?"/><br/>
        <g:actionSubmit value="Tweet"/>
    </g:form>

</body>
</html>
