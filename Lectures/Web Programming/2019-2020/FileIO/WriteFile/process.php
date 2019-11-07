<html>
<body>

Welcome <?php echo $_POST["name"]; ?><br>
Your email address is: <?php echo $_POST["email"]; ?>
<?php
$name = $_POST["name"];
$email = $_POST["email"];

if(isset($name) && isset($email)
    && $name != "" && $email != "") {
    $fileName = "output.txt";
    
    $file = fopen($fileName, "w") or die("Couldn't Create");
    fwrite($file, "Name: {$name}, Email: {$email}");
    fclose($file);
    
    /*
    Modes	Description
    r	Open a file for read only. File pointer starts at the beginning of the file
    w	Open a file for write only. Erases the contents of the file or creates a new file if it doesn't exist. File pointer starts at the beginning of the file
    a	Open a file for write only. The existing data in file is preserved. File pointer starts at the end of the file. Creates a new file if the file doesn't exist
    x	Creates a new file for write only. Returns FALSE and an error if file already exists
    r+	Open a file for read/write. File pointer starts at the beginning of the file
    w+	Open a file for read/write. Erases the contents of the file or creates a new file if it doesn't exist. File pointer starts at the beginning of the file
    a+	Open a file for read/write. The existing data in file is preserved. File pointer starts at the end of the file. Creates a new file if the file doesn't exist
    x+	Creates a new file for read/write. Returns FALSE and an error if file already exists
    ref: https://www.w3schools.com/php/php_file_open.asp
    */

} else {
    echo "</br> <b>Values Aren't set!</b>";
}
?>
</body>
</html>