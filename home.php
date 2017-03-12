<?php
include "top.php";
?>
<article id="main">
    <h2>Home</h2>
        <hr />
        <figure style="float: right">
            <img src="icon.gif" alt="Chris" width="375" height="450" />
        <br />
        <figcaption>This is a gif of my roommate.</figcaption>
        </figure>
        
        <figure style="float: left">
            <img src="JustMetxt.png" alt="Adam" width="375" height="450" />
        <br />
        
        <figcaption>Re-cropped picture of me</figcaption>
        </figure>
        
        <p>Saving the environment is a team effort.</p>
        <p>My name is Adam Barson, and I'm doing my part to 
        save the environment.</p>
        <p>This site is about bringing attention to safe environmental practices that
        everyone can take part in; these practices will help to reduce the real 
        and potentially devastating effects of <b>global warming.</b></p>
</article>
        
        
        
       
        <h2>What is climate change, and why should I care?</h2>
        <p><i><q>Climate change is a significant time variation in weather patterns occurring over periods ranging from decades to millions of years.</q></i>
             Climate change over the last century is called <i>global warming,</i> which is the gradual
        heating of the Earth's surface. Global warming is projected to have many
         environmental consequences, ranging from mundane to severe.
         Such impacts include ocean acidification, rising sea levels, and mass extinction
         of many species. There are strong implications that humans have contributed
        significantly to global warming, which means humans can reverse it. 
        </p>
        <br />
        <figure style="float: right">
            <img src="transparentPic1.gif" alt="transparent picture" width="250" height="275" />
        
        <figcaption>This is a transparent image of Earth.</figcaption>
        </figure>
        
        <br><br> <br><br> 
        <hr/>
        <p>
        Changes in European greenhouse gas emission over the last 30 years:
        </p>
        <table>
            <tr>
                <td>
                
        <?php
         /* Sample code to open a plain text file */

$debug = false;

if(isset($_GET["debug"])){
    $debug = true;
}

$myFileName="greenhousegas2";

$fileExt=".csv";

$filename = $myFileName . $fileExt;

if ($debug) print "\n\n<p>filename is " . $filename;

$file=fopen($filename, "r");

/* the variable $file will be empty or false if the file does not open */
if($file){
    if($debug) print "<p>File Opened</p>\n";
    
if($file){
    
    if($debug) print "<p>Begin reading data into an array.</p>\n";

    /* This reads the first row, which in our case is the column headers */
    $headers=fgetcsv($file);
    
    if($debug) {
        print "<p>Finished reading headers.</p>\n";
        print "<p>My header array<p><pre> "; print_r($headers); print "</pre></p>";
    }
    /* the while (similar to a for loop) loop keeps executing until we reach 
     * the end of the file at which point it stops. the resulting variable 
     * $records is an array with all our data.
     */
    //print "<ol>";
foreach ($headers as $value) {
    //print $key;
    print "$value<br>";
    
    
    
    
}
}



if ($debug)
    print "<p>End of processing.</p>\n";
} 

?>
                    </td>
            </tr>
        </table>
        <hr/>
        
<?php
    include ("footer.php");
?>
    </body>
</html>

