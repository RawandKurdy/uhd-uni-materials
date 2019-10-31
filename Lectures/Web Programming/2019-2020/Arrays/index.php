<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>PHP</title>
</head>
<body>

    <?php
        $arr2 = array(array("BMW", 10, 10),
        array("Toyota", 20, 10));
        for($i = 0; $i< 2; $i++){
            echo "Row" . $i;
            echo "<ul>";
            for($j = 0; $j<3; $j++){
                ECHO "<li>". $arr2[$i][$j] . "</li>";
            }
            echo "</ul>";
        }
    ?>
    
</body>
</html>