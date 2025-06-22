<?php
// Datatypes 
$a=15;
$b=5.34;
$c="Hello";
$d=true;
$e=NULL;
$f=false;
$cars=array("volvo", "BMW", "Toyota");
var_dump($a);
var_dump($b);
var_dump($c);
var_dump($d);
var_dump($e);
var_dump($f);
var_dump($cars);
//Type conversion
echo"Let's move with type conversion \n";
//String
$a=(string)$a;
var_dump($a);

//int
$b=(int)$b;
var_dump($b);

//float
$c=(float)$c;
var_dump($c);

//bool
$s=(bool)$b;
var_dump($s);

//array
$t=(array)$f;
var_dump($t);

//
?>