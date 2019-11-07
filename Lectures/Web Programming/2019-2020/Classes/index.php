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
        class Person{
            const msg = "Hello";
            public $name;
            public $gender;
            public $age;

            // OR __construct
            function Person($name, $age, $gender){
                $this->name = $name;
                $this->age = $age;
                $this->gender = $gender;
            }
            function printAge(){
                echo "<b>". $this->name . "</b>" ." is ". $this->age . " old";
            }
            function printGender(){
                $txt = "<b> {$this->name} </b> is {$this->gender}";
                echo $txt;
            }
            function sayHi(){
                echo self::msg ." ". $this->name;
            }

            // function __destruct() {
            //     echo ""; 
            //   }
        }

        $Pearson = new Person("Pearson", 19, "Male");
        $Pearson->sayHi();
        echo "</br>";

        echo Person::msg . " John";
        echo "</br>";

        $Pearson->printAge();
        echo "</br>";

        $Pearson->printGender();
    ?>
</body>
</html>