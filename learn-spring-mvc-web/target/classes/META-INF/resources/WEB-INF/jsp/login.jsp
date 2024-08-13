<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login To Todo</title>
</head>
<link href="/webjars/bootstrap/5.3.1/css/bootstrap.min.css" rel="stylesheet">
<body>

<style>
body{
    background-color: rgba(63, 55, 55, 0.553);
    height: 100vh;
    width: 100%;
    display: flex;
    align-items: center;
    justify-content: center;
}

.container{
    width: 400px;
    height: 400px;
    background: #f9fdf8c7;
    display: flex;
    align-items: center;
    justify-content: center;
    border-radius: 50px;
    flex-wrap: wrap;
}

.form{
   display: flex;
   gap: 20px;
   flex-direction: column;
}

.pass input{
   width: 165px;
}


</style>


<div class="container">
    <h1>Login To Todo</h1>
    <form class="form" method="post">
        <div class="name" ><span>Name: </span><input type="text" name="name" required="required"></div>
        <div class="pass"><span>Password: </span><input type="password" name="password" required="required"></div>
        <pre style="color: red;font-size: 12px;">${error}</pre>
        <button style="height: 40px;width: 90px;margin-left: auto;margin-right: auto;margin-top: 80px;" class="btn btn-success" type="submit">Login</button>
    </form>
</div>
<script  src="webjars/bootstrap/5.3.3/js/bootstrap.min.js">
</script>

</body>
</html>