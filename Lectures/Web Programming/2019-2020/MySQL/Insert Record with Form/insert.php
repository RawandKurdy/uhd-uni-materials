<?php
require "connection.php";

$id = $_GET["id"];
$name = $_GET["name"];
$desc= $_GET["desc"];

$sql_query = "insert into sampledata 
values (?, ?, ?);";

$prep_query_str = $dbconn->prepare($sql_query);
$prep_query_str->bind_param("iss", $id, $name, $desc);
// i for Integer
// s for String
// d for Double
// b for Blob
if($prep_query_str->execute() === TRUE){
	
	echo "Records Created";
	
} else {
	ECHO "Failed in Records Creation";
}
$prep_query_str->close();
$dbconn->close();


?>