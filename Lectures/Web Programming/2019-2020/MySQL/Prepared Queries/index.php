<?php
require "connection.php";

$id = 255;
$name = "Danyar";
$desc= "Is A Student";

$sql_query = "insert into sampledata 
values (?, ?, ?);";

$prep_query_str = $dbconn->prepare($sql_query);
$prep_query_str->bind_param("iss", $id, $name, $desc);

if($prep_query_str->execute() === TRUE){
	
	echo "Records Created";
	
} else {
	ECHO "Failed in Records Creation";
}

$prep_query_str->close();
$dbconn->close();


?>