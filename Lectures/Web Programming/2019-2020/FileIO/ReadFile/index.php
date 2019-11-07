<html>
<body>
<?php
    $fileName = "input.txt";
    echo "<b>Read Whole:</b></br>";
    //Easy. way
    readfile($fileName);
    echo "</br>";

    //Adv. way
        // A- Read Whole
    $file = fopen($fileName, "r") or die("Couldn't Read");
    echo fread($file, filesize($fileName));
    echo "</br>";
    fclose($file);

        // B- Read Single line
    echo "<b>Read Line:</b></br>";
    $file = fopen($fileName, "r") or die("Couldn't Read");
    echo fgets($file, filesize($fileName));
    echo "</br>";
    fclose($file);

        // C- Read Single Character
    echo "<b>Read Character:</b></br>";
    $fileName = "input.txt";
    $file = fopen($fileName, "r") or die("Couldn't Read");
    echo fgetc($file);
    if (feof($file))
        echo "</br>Reached End of File</br>";
    echo "</br>";
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
?>
</body>
</html>