<html>
<head>
<title>Dashboard Page</title>
</head>
<link href="/webjars/bootstrap/5.3.1/css/bootstrap.css" rel="stylesheet">
<style>
.nav{
display: flex;
align-items: center;
justify-content: center;
width: 100%;
flex-wrap: wrap;
}
</style>
<body class="bg-dark bg-gradient">

<nav class="nav">
<h1 style="color: white;"> Welcome ${name}</h1>
</nav>
<h4 style="color: #97d70eb5; padding-left: 45% ; padding-bottom: 50px; padding-top: 10px;">Your Todo's :</h4>



<div class="container" style="clip-path: xywh(0 0 100% 100% round 0.5em);">
<table class="table table-light table-hover">
<thead class="table-dark bg-gradient">
    <tr>
        <th scope="col">#</th>
        <th scope="col">Name</th>
        <th scope="col">Description</th>
        <th scope="col">Target Date</th>
        <th scope="col">Done?</th>
    </tr>
</thead>

<tbody class="table-group-divider">
    <tr>
        <th scope="row">1.</th>
        <td>Vedant</td>
        <td>Learn Java</td>
        <td>12/2/2024</td>
        <td>False</td>
    </tr>
    <tr>
        <th scope="row">2.</th>
        <td>Yogendra</td>
        <td>Learn SpringBoot FrameWork</td>
        <td>20/10/2025</td>
        <td>False</td>
    </tr>
</tbody>
</table>
</div>
</body>
</html>