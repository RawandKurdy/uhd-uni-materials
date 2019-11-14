<?php

$hostname = "localhost";
$user = "root";
$password = "";
$dbname = "sample";

$dbconn = new mysqli($hostname, $user, $password,
 $dbname);

if($dbconn->connect_error){
	die("Connection Failed! Sorry");
}

echo "Connected!";


?>