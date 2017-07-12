<#import "spring.ftl" as spring />
<@spring.bind "model" />
<head>
    <meta charset="UTF-8">
    <style>
        @import url(https://fonts.googleapis.com/css?family=Roboto:400,500,700,300,100);

        body {
            background-color: #ec93a0;
            font-family: "Roboto", helvetica, arial, sans-serif;
            font-size: 16px;
            font-weight: 400;
            text-rendering: optimizeLegibility;
        }

        h1 {
            #4E5066;
            font-size: 30px;
            font-weight: 400;
            font-style: normal;
            font-family: "Roboto", helvetica, arial, sans-serif;
            text-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);
            text-transform: uppercase;
        }

        .table-title h3 {
            color: #fafafa;
            font-size: 30px;
            font-weight: 400;
            font-style: normal;
            font-family: "Roboto", helvetica, arial, sans-serif;
            text-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);
            text-transform: uppercase;
        }

        /*** Table Styles **/

        th {
            color: #fafafa;;
            background: #30011e;
            border-bottom: 4px solid #f5d6ba;
            border-right: 1px solid #f5d6ba;
            font-size: 23px;
            font-weight: 300;
            padding: 24px;
            text-align: left;
            text-shadow: 0 1px 1px rgba(215, 252, 212, 0.1);
            vertical-align: middle;
        }

        th:first-child {
            border-top-left-radius: 3px;
        }

        th:last-child {
            border-top-right-radius: 3px;
            border-right: none;
        }

        tr {
            border-top: 1px solid #C1C3D1;
            border-bottom-: 1px solid #C1C3D1;
            color: rgba(68, 2, 42, 0.76);
            font-size: 16px;
            font-weight: normal;
            text-shadow: 0 1px 1px rgba(256, 256, 256, 0.1);
        }

        tr:hover td {
            background: #44022a;
            color: #FFFFFF;
            border-top: 1px solid #44022a;
            border-bottom: 1px solid #44022a;
        }

        tr:first-child {
            border-top: none;
        }

        tr:last-child {
            border-bottom: none;
        }

        tr:nth-child(odd) td {
            background: #EBEBEB;
        }

        tr:nth-child(odd):hover td {
            background: #4e5066;
        }

        tr:last-child td:first-child {
            border-bottom-left-radius: 3px;
        }

        tr:last-child td:last-child {
            border-bottom-right-radius: 3px;
        }

        td {
            background: #FFFFFF;
            padding: 20px;
            text-align: left;
            vertical-align: middle;
            font-weight: 300;
            font-size: 18px;
            text-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);
            border-right: 1px solid #C1C3D1;
        }

        td:last-child {
            border-right: 0px;
        }

        input[type=text], select {
            width: 400px;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type=submit] {
            width: 200px;
            background-color: #6e0146;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: 2px solid #ec93a0;
            border-radius: 4px;
            cursor: pointer;
        }

    </style>
</head>
<body>

<div align="center">
    <table>
        <tr>
            <th>Задача</th>
            <th>Время</th>
        </tr>

    <#list model.tasks as task>
        <tr>
            <td>${task.text}</td>
            <td>${task.time}</td>
        </tr>
    </#list>
</div>


<form action="/tasks/add" method="get">
    <br>
    <input type="text" id="text" name="text" placeholder="Описание задачи..">
    <br>
    <br>
    <input type="text" id="time" name="time" placeholder="Время в формате чч:мм..">
    <br>
    <input type="submit">
</form>

<form action="/tasks/delete" method="get">
    <input type="submit" value="Очистить список">
</form>

</body>