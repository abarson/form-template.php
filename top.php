<!DOCTYPE html>
<html lang="en">
<head>
<title>(1.4) Making the World a Better Place</title>
<meta charset="utf-8">
<meta name="author" content="Adam Barson">
<meta name="description" content="Who I am, what global warming is, and what we can do to change it">

<meta name="viewport" content="width=device-width, initial-scale=1">

<!--[if lt IE 9]>
<script src="//html5shim.googlecode.com/sin/trunk/html5.js"></script>
<![endif]-->

<link rel="stylesheet" href="myStyle2.css" type="text/css" media="screen">

<?php
// %^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%
//
// PATH SETUP
//
//  $domain = "https://www.uvm.edu" or http://www.uvm.edu;
$domain = "http://";
if (isset($_SERVER['HTTPS'])) {
    if ($_SERVER['HTTPS']) {
        $domain = "https://";
    }
}

$server = htmlentities($_SERVER['SERVER_NAME'], ENT_QUOTES, "UTF-8");

$domain .= $server;

$phpSelf = htmlentities($_SERVER['PHP_SELF'], ENT_QUOTES, "UTF-8");

$path_parts = pathinfo($phpSelf);

if ($debug){
    print "<p>Domain" . $domain;
    print "<p>php Self". $phpSelf;
    print "<p>Path Parts<pre>";
    print_r($path_parts);
    print "</pre>";
}

// %^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%
//
// inlcude all libraries
//

require_once('lib/security.php');





?>	

</head>
<!-- ################ body section ######################### -->

<?php

print '<body id="' . $path_parts['filename'] . '">';

include "header.php";
include "nav.php";

?>
