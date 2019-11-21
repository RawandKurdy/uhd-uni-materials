<?php
require "connection.php";

$sql_query = "SELECT id, name FROM sampledata;";
$result = $dbconn->query($sql_query);

if($result->num_rows > 0){
	while($row = $result->fetch_assoc()){
			echo "{$row['name']}, His/Her ID is {$row['id']}";
			echo "</br>";
	}
} else {
	ECHO "No RECORDS";
}

$dbconn->close();

?>