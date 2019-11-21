<?php
require "connection.php";

$sql_query = "insert into sampledata 
values (4, 'Abdulla', 'is a Student');";

$sql_query .= "insert into sampledata 
values (3, 'Rawaz', 'is a Student');";

if($dbconn->multi_query($sql_query) === TRUE){
	
	echo "Records Created";
	
} else {
	ECHO "Failed in Records Creation";
}

$dbconn->close();


?>