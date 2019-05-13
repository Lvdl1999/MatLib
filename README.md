# MatLib
## By Levy van der Linde 
## Minor Programmeren

Once someone opens the "4-screen-app", a "welcome"screen will pop up from this game called "MadLibs".
"MadLibs" are short stories that have blank spaces which can be filled in by the user. 

After getting started the user will see the second screen. Here the app is explained and the user can choose a story.
This is all programmed in the StorychoiceActivity. The UI has a listview which contains al the stories titles. 
All these items have their one position in the listview which can be given to the activity so it knows which story was chosen.
Depending on the story choice, the app will prompt the user to fill in all the placeholders that belong to the chosen story.

On the next screen, there will be an android function called "putwords". As the user will fill in all the placeholders, 
these are put in the story. Depending on the story it contains things like adjectives or jobs. 
During this action, there is an PlaceholderCount that keeps track of the remaining placeholders. 
This way the app knows when the user is done and the story will be shown in the final screen.

The final screen will show the chosen story containing all the words the user has given. 

Every screen that has to transport information like a chosen story, or the given words was done by an intent fucntion. 
This way the next screen has all the information it needs to adjust the UI.
