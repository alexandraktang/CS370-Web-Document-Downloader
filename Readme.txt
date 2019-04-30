CS370
Phase Two
Alexandra Tang
________________________________________

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

Note: If your file paths are not specified, the program will search for the file in the directory in which the program is located. If your file is located in a directory outside
your working directory or you want to save your output file to a particular directory,
simply include its path prior to the filename.

   Ex:
      /Users/alexandratang/Desktop/output.txt

________________________________________

Input files should be written in the following format:

   https://www.macworld.com/article/3150941/ios/swipe-right-to-rule-reigns-is-a-tinder-
   style-choose-your-own-adventure.html
   http://textfiles.com/rpg/realplay.txt
   https://cdn.pixabay.com/photo/2015/12/11/14/00/christmas-village-1088143_960_720.jpg
   https://gamedesignfall2018.files.wordpress.com/2018/10/assignment2_2.pdf

   This program only accepts URLs ending in .htm, .html, .txt, .jpg, .jpeg, .gif,
   and .pdf.
   
   URLs must be entered on their own lines, but do NOT leave extra space between the URLs.
________________________________________

Output files will be written in the following format:

   URL Name
   File [URL Name] created: [Number] lines read.*
   URL: [URL ADDRESS]
   Content Type: [Content Type]
   Content Length: [Content Length]
   Date Last Modified: [Day of the Week, DD Month YYYY HH:MM:SS Timezone]
   Expiration: [Day of the Week, DD Month YYYY HH:MM:SS Timezone]
   Content Encoding: [Content Encoding]
   File Size: [File Size in kB]

   * Only shown in .html, .htm, .txt files.


 Ex for HTML Files:
   swipe-right-to-rule-reigns-is-a-tinder-style-choose-your-own-adventure
   File swipe-right-to-rule-reigns-is-a-tinder-style-choose-your-own-adventure created:
   4686 lines read.
   URL: https://www.macworld.com/article/3150941/ios/swipe-right-to-rule-reigns-is-a-
   tinder-style-choose-your-own-adventure.html
   Content Type: text/html;charset=UTF-8
   Content Length: 111230
   Date Last Modified: Wed, 31 Dec 1969 19:00:00 EST
   Expiration: Wed, 31 Dec 1969 19:00:00 EST
   Content Encoding: null
   File Size: 108.623046875 kB

 Ex for PDF Files:
   twine-cuny-games-2018
   URL: https://robincamille.com/assets/twine-cuny-games-2018.pdf
   Content Type: application/pdf
   Content Length: 925981
   Date Last Modified: Sun, 11 Feb 2018 16:11:58 EST
   Expiration: Wed, 31 Dec 1969 19:00:00 EST
   Content Encoding: null
   File Size: 904.2783203125 kB

 Ex for Image Files:
   christmas-village-1088143_960_720
   URL: https://cdn.pixabay.com/photo/2015/12/11/14/00/christmas-
   village-1088143_960_720.jpg
   Content Type: image/jpeg
   Content Length: 251287
   Date Last Modified: Fri, 11 Dec 2015 08:00:39 EST
   Expiration: Wed, 31 Dec 1969 19:00:00 EST
   Content Encoding: null
   File Size: 245.3974609375 kB


