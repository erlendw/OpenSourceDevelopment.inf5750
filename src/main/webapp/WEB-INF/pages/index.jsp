<html>
<body>
<h2>Hello World!</h2>

<h4>Message : ${message}</h4>

<a href="/hello/erlenderbest">Redirect to hello</a>



<h2>Leave a message</h2>

<h1>${message}</h1>

<form name="input" action="/assignment1/send" method="get">
    Message content: <input type="text" name="content">
    <input type="submit" value="Submit">
</form>

<p><a href="/assignment1/read">Get last message</a></p>


</body>
</html>