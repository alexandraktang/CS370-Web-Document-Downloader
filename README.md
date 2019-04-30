# CS370-Document-Downloader

TO COMPILE THIS PROJECT:

1. Open your command line interface (ex. Powershell, Terminal).
2. Navigate to the directory with the files using the cd command.
   (Ex. 
         >cd /Users/alexandratang/Desktop
   )
3. Enter "javac PhaseTwo.java"
4. Enter "java PhaseTwo -i [filename] -o [filename].
   (Ex. 
         >java PhaseTwo -i in.txt -o out.txt
   )
________________________________________

UNIX FLAGS:
-i [input.txt]
-o [output.txt]

Flags followed by items in brackets indicate mandatory arguments that may vary in name. 

Note: If your file paths are not specified, the program will search for the file in the directory in which the program is located. If your file is located in a directory outside your working directory or you want to save your output file to a particular directory, simply include its path prior to the filename.

   Ex:<br>
      /Users/alexandratang/Desktop/output.txt

________________________________________

Input files should be written in the following format:

   https://www.macworld.com/article/3150941/ios/swipe-right-to-rule-reigns-is-a-tinder-style-choose-your-own-adventure.html<br>
   http://textfiles.com/rpg/realplay.txt<br>
   https://cdn.pixabay.com/photo/2015/12/11/14/00/christmas-village-1088143_960_720.jpg<br>
   https://gamedesignfall2018.files.wordpress.com/2018/10/assignment2_2.pdf<br>

   This program only accepts URLs ending in .htm, .html, .txt, .jpg, .jpeg, .gif,
   and .pdf.
   
   URLs must be entered on their own lines, but do NOT leave extra space between the URLs.
________________________________________

Output files will be written in the following format:

   URL Name<br>
   File [URL Name] created: [Number] lines read.*<br>
   URL: [URL ADDRESS]<br>
   Content Type: [Content Type]<br>
   Content Length: [Content Length]<br>
   Date Last Modified: [Day of the Week, DD Month YYYY HH:MM:SS Timezone]<br>
   Expiration: [Day of the Week, DD Month YYYY HH:MM:SS Timezone]<br>
   Content Encoding: [Content Encoding]<br>
   File Size: [File Size in kB]<br><br>

   *Only shown in .html, .htm, .txt files.<br><br>


 <strong>Ex for HTML Files:</strong><br>
   swipe-right-to-rule-reigns-is-a-tinder-style-choose-your-own-adventure<br>
   File swipe-right-to-rule-reigns-is-a-tinder-style-choose-your-own-adventure created:<br>
   4686 lines read.<br>
   URL: https://www.macworld.com/article/3150941/ios/swipe-right-to-rule-reigns-is-a-tinder-style-choose-your-own-adventure.html<br>
   Content Type: text/html;charset=UTF-8<br>
   Content Length: 111230<br>
   Date Last Modified: Wed, 31 Dec 1969 19:00:00 EST<br>
   Expiration: Wed, 31 Dec 1969 19:00:00 EST<br>
   Content Encoding: null<br>
   File Size: 108.623046875 kB<br>

<strong>Ex for PDF Files:</strong><br>
   twine-cuny-games-2018<br>
   URL: https://robincamille.com/assets/twine-cuny-games-2018.pdf<br>
   Content Type: application/pdf<br>
   Content Length: 925981<br>
   Date Last Modified: Sun, 11 Feb 2018 16:11:58 EST<br>
   Expiration: Wed, 31 Dec 1969 19:00:00 EST<br>
   Content Encoding: null<br>
   File Size: 904.2783203125 kB<br>

<strong>Ex for Image Files:</strong><br>
   christmas-village-1088143_960_720<br>
   URL: https://cdn.pixabay.com/photo/2015/12/11/14/00/christmas-village-1088143_960_720.jpg<br>
   Content Type: image/jpeg<br>
   Content Length: 251287<br>
   Date Last Modified: Fri, 11 Dec 2015 08:00:39 EST<br>
   Expiration: Wed, 31 Dec 1969 19:00:00 EST<br>
   Content Encoding: null<br>
   File Size: 245.3974609375 kB
