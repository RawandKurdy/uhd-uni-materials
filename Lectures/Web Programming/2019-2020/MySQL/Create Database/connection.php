<?php

$hostname = "localhost";
$user = "root";
$password = "";

$dbconn = new mysqli($hostname, $user, $password);

if($dbconn->connect_error){
	die("Connection Failed! Sorry");
}

echo "Connected!";


?>