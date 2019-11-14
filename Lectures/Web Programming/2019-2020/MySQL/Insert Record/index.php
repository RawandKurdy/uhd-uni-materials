<?php
require "connection.php";

$sql_query = "insert into sampledata 
values (2, 'Lera', 'is a Student')";

if($dbconn->query($sql_query) === TRUE){
	echo "ID:". $dbconn->insert_id ."</br>";
	echo "Record Created";
	
} else {
	ECHO "Failed in Record Creation";
}

$dbconn->close();


?>