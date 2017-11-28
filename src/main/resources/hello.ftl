<html>
<head>
    <title>HelloWorld!</title>
</head>
<body>
    <h1>Hello ${name}</h1>

    <table border="1">

    <th>Sensor 1</th>
    <th>Sensor 2</th>

    <#list tableDefinition.columns as col>
        <tr>
            <#list data as pojo>
                <td>${("pojo." + col.name)?eval}</td>
            </#list>
        </tr>
    </#list>

    </table>
</body>

</html>