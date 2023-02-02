<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">

<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Meals</title>

    <style>table th, table td {
        padding: 15px;
    }</style>

</head>

<body bgcolor="#FFFFFF">
<h1>Meals List</h1>

<table border = "1">

    <tr>
        <th>Data</th>
        <th>Description</th>
        <th>Calories</th>
        </td>
    </tr>

    <th:block th:each = "meals : ${Meals}">

        <tr>
            <td bgcolor="#00FF66" th:text = "${mealToList.getModel()}"></td>
            <td bgcolor="#FF0000" th:text = "${car.getSeries()}"></td>
            <td bgcolor="#008080" th:text = "${car.getColor()}"></td>
        </tr>

    </th:block>

</table>

</body>
</html>