# MatLib
## By Levy van der Linde 
## Minor Programmeren

Once someone opens the "4-screen-app", a "welcome"screen will pop up from this game called "MadLibs".
"MadLibs" are short stories that have blank spaces which can be filled in by the user. 

### story choice
After getting started the user will see the second screen. Here the app is explained and the user can choose a story.
This is all programmed in the StorychoiceActivity. The UI has a listview which contains al the stories titles. 
All these items have their one position in the listview which can be given to the activity so it knows which story was chosen.
Depending on the story choice, the app will prompt the user to fill in all the placeholders that belong to the chosen story.

### putwords 
On the next screen, there will be an android function called "putwords". As the user will fill in all the placeholders, 
these are put in the story. Depending on the story it contains things like adjectives, nouns or jobs. 
During this action, there is an PlaceholderCount that keeps track of the remaining placeholders. 
This way the app knows when the user is done and the story will be shown in the final screen.

### the story
The final screen will show the completed story containing all the words the user has given. 

Every screen that has to transport information like a chosen story, or the given words was done by an intent fucntion. 
This way the next screen has all the information it needs to adjust the UI. 
In case someone turns the phone to landscape, the app will reload and get all data from the bundle in case necessary. If for instance there were already words filled in, it means the placeholder will stay updated and shown on the reloaded version.

So to show you how this app does work, here is an example with screenshots:

1. open the app "Mad Libs"
<img width="277" alt="image" src="https://user-images.githubusercontent.com/47352487/57650377-f5408280-75ca-11e9-87c8-c5f0d820ed77.png">

2. chose a story
<img width="287" alt="image" src="https://user-images.githubusercontent.com/47352487/57650534-52d4cf00-75cb-11e9-91e4-4bc0d2ffe11d.png">

3. fill in the simple story
![image](https://user-images.githubusercontent.com/47352487/57651063-a267ca80-75cc-11e9-86c8-22445d895b30.png)
<img width="264" alt="image" src="https://user-images.githubusercontent.com/47352487/57651044-95e37200-75cc-11e9-97dc-e234b5459451.png">

4. completed story
<img width="284" alt="image" src="https://user-images.githubusercontent.com/47352487/57650805-ec9c7c00-75cb-11e9-844e-c9bad1b07736.png">

5. Landscape variaton
<img width="552" alt="image" src="https://user-images.githubusercontent.com/47352487/57650428-12755100-75cb-11e9-8b31-39063b2b06ab.png">

