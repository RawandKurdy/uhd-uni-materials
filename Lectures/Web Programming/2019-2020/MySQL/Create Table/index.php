<?php
require "connection.php";

$sql_query = "create table sampledata(
id int primary key,
name varchar(64) not null,
description varchar(256)
)";

if($dbconn->query($sql_query) === TRUE){
	echo "Table Created";
	
} else {
	ECHO "Failed in Creating Table";
}

$dbconn->close();


?>