<?php 
	$base = "inspiration";
	$hote = "localhost";
	$usager = "root";
	$motdepasse = "eloilou99";
	$dsn = "mysql:dbname=".$base.";host=" . $hote;
	//echo $dsn;
	$basededonnees;
	try{
		$basededonnees = new PDO($dsn, $usager, $motdepasse);
	}catch(PDOExeption $e){
		echo "Erreur" .$e->getMessage();
	}
?>