+<!DOCTYPE html>
+<html lang="en">
+<head>
+<title>Mark me wrong</title>
+<meta charset="utf-8">
+<meta name="author" content="Mark me wrong">
+<meta name="description" content="Mark me wrong for not changing this">
+
+<meta name="viewport" content="width=device-width, initial-scale=1">
+
+<!--[if lt IE 9]>
+<script src="//html5shim.googlecode.com/sin/trunk/html5.js"></script>
+<![endif]-->
+
+<link rel="stylesheet" href="style.css" type="text/css" media="screen">
+
+<?php
+// %^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%
+//
+// PATH SETUP
+//
+
+
+
+
+
+
+
+
+
+
+
+
+$phpSelf = htmlentities($_SERVER['PHP_SELF'], ENT_QUOTES, "UTF-8");
+
+$path_parts = pathinfo($phpSelf);
+
+if ($debug){
+ 
+    print "<p>php Self". $phpSelf;
+    print "<p>Path Parts<pre>";
+    print_r($path_parts);
+    print "</pre>";
+}
+
+// %^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%^%
+//
+// inlcude all libraries
+//
+
+
+
+
+
+
+
+?>	
+
+</head>
+<!-- ################ body section ######################### -->
+
+<?php
+
+print '<body id="' . $path_parts['filename'] . '">';
+
+include "header.php";
+include "nav.php";
+
+?>
