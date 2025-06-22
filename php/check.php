<?php
//Recursive function
function check($num){
    if($num<=5){
        echo "$num\n";
        check($num+1);
    }
}
check(1);

//Global scope and Local scope
$x=5;//Global declaration
function test(){
    $y=10;//Local declaration
    //echo"<p>Variable x inside the function: $x</p>\n ";//It returns the warning with Use of unassigned variable.
    echo"\n<p>Variable y inside the function: $y</p>\n";
}
test();
echo"\n<p>Variable x outside the function: $x</p>\n";
//echo"\n<p>Variable y outside the function: $y</p>\n";//It returns the warning with undefined variable

?>