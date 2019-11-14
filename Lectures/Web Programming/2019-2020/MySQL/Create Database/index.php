<?php
require "connection.php";

$sql_query = "create database sample";

if($dbconn->query($sql_query) === TRUE){
	echo "DB Created";
	
} else {
	ECHO "Failed in DB Creation";
}

$dbconn->close();


?>