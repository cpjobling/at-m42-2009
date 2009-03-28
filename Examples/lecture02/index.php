<?php
include_once "markdown.php";

$file_var = fopen("README.txt", "r") or
    die ("Error - README.txt cannot be opened");
$my_text = fread($file-var, filesize("README.txt"))

print Markdown($my_text);
?>
