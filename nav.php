<!-- ######################     Main Navigation   ########################## -->
<nav>
    <ol>
        <?php
        /* This sets the current page to not be a link. Repeat this if block for
         *  each menu item */
        if ($path_parts['filename'] == "index") {
            print '<li class="activePage">Home</li>';
        } else {
            print '<li><a href="index.php">Home</a></li>';
        }
        
        /* example of repeating */ 
        if ($path_parts['filename'] == "ExtremeWeather") {
            print '<li class="activePage">Extreme Weather</li>';
        } else {
            print '<li><a href="ExtremeWeather.php">Extreme Weather</a></li>';
        }
        
        if ($path_parts['filename'] == "BiodiversityLoss") {
            print '<li class="activePage">Biodiversity Loss</li>';
        } else {
            print '<li><a href="BiodiversityLoss.php">Biodiversity Loss</a></li>';
        }
        
        if ($path_parts['filename'] == "RisingSeaLevels") {
            print '<li class="activePage">Rising Sea Levels</li>';
        } else {
            print '<li><a href="RisingSeaLevels.php">Rising Sea Levels</a></li>';
        }
        print '<li><a href="https://abarson.w3.uvm.edu/cs008/index.php">Site Map</a></li>';
        
        ?>
    </ol>
</nav>
