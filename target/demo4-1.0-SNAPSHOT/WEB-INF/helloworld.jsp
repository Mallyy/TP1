<!DOCTYPE html>
<html>
<head><title>Hello World JSP</title></head>
<body>
<% if(request.getParameter("nom") == null)
    out.println("Hello World");
else
    out.println("Bonjour " +
            request.getParameter("nom")); %>
</body>
</html>