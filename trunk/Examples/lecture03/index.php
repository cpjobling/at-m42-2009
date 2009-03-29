<?php

require_once 'Markdown/markdown.php';

$readme = "README.txt";
$handle = fopen($readme, "r") or
    die ("Error - README.txt cannot be opened");
$my_text = fread($handle, filesize($readme));

print Markdown($my_text);
?>
