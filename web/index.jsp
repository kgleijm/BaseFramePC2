<%--
  Created by IntelliJ IDEA.
  User: kevin
  Date: 25-9-2020
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
  <head>
    <title>WEB PAGE TITLE</title>
    <meta name="google-signin-client_id" content="621238999880-9rj10o12b4dvsi92ou1m74s8tmmblp3c.apps.googleusercontent.com">
    <script src="https://apis.google.com/js/platform.js" async defer></script>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.5.2/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

  <body>
    Body of the web page!
    <a href="<%=request.getContextPath()%>/linkTemplate">Call the servlet</a>

    <div class="g-signin2" data-onsuccess="onSignIn"></div>
  </body>

  <script>
    function onSignIn(googleUser) {
      //document.querySelector('#content').innerText = googleUser.getBasicProfile().getName()
      console.log(googleUser.getId())
      console.log(googleUser.getBasicProfile().getGivenName())
      console.log(googleUser.getBasicProfile().getFamilyName())
      console.log(googleUser.getBasicProfile().getEmail())

      var id_token = googleUser.getAuthResponse().id_token
      console.log("ID Token: " + id_token);

      //var url= "http://localhost:8080/BaseFramePC_war_exploded/PageTemplate/templateHTMLfile.html";
      //window.location = url;
      //window.location.pathname = 'BaseFramePC_war_exploded/PageTemplate/templateHTMLfile.html'
      window.location.href = '<%=request.getContextPath()%>/linkTemplate';
    }
  </script>
</html>