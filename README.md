# MatLib
## By Levy van der Linde 
## Minor Programmeren

Once someone opens the "4-screen-app", a "welcome"screen will pop up from this game called "MadLibs".
"MadLibs" are short stories that have blank spaces which can be filled in by the user. 

### Story choice
After getting started the user will see the second screen. Here the app is explained and the user can choose a story.
This is all programmed in the StorychoiceActivity. The UI has a listview which contains al the stories titles. 
All these items have their one position in the listview which can be given to the activity so it knows which story was chosen.
Depending on the story choice, the app will prompt the user to fill in all the placeholders that belong to the chosen story.

### Putwords 
On the next screen, there will be an android function called "putwords". As the user will fill in all the placeholders, 
these are put in the story. Depending on the story it contains things like adjectives, nouns or jobs. 
During this action, there is an PlaceholderCount that keeps track of the remaining placeholders. 
This way the app knows when the user is done and the story will be shown in the final screen.

### The completed story
The final screen will show the completed story containing all the words the user has given. 

Every screen that has to transport information like a chosen story, or the given words was done by an intent fucntion. 
This way the next screen has all the information it needs to adjust the UI. 
In case someone turns the phone to landscape, the app will reload and get all data from the bundle in case necessary. If for instance there were already words filled in, it means the placeholder will stay updated and shown on the reloaded version.

So to show you how this app does work, here is an example with screenshots:

**1. open the app "Mad Libs"**
<img width="150" alt="image" src="https://user-images.githubusercontent.com/47352487/57650377-f5408280-75ca-11e9-87c8-c5f0d820ed77.png">

**2. chose a story**
<img width="150" alt="image" src="https://user-images.githubusercontent.com/47352487/57651368-549f9200-75cd-11e9-9689-0ec4546e990b.png">

**3. fill in the simple story**
<img width="150" alt="image" src="https://user-images.githubusercontent.com/47352487/57651412-6c771600-75cd-11e9-944f-4e9cd2482cf9.png">

<img width="150" alt="Schermafbeelding 2019-05-13 om 22 11 16" src="https://user-images.githubusercontent.com/47352487/57651208-f8d50900-75cc-11e9-83f6-eeb4c137791f.png">

**4. completed story**
<img width="150" alt="image" src="https://user-images.githubusercontent.com/47352487/57650805-ec9c7c00-75cb-11e9-844e-c9bad1b07736.png">

**5. Landscape variaton**
<img width="300" alt="image" src="https://user-images.githubusercontent.com/47352487/57650428-12755100-75cb-11e9-8b31-39063b2b06ab.png">

<img width="300" alt="image" src="https://user-images.githubusercontent.com/47352487/57651466-89abe480-75cd-11e9-8d43-fa4887d0a4e7.png">

<img width="300" alt="image" src="https://user-images.githubusercontent.com/47352487/57651525-b2cc7500-75cd-11e9-8b6a-6acbec7c8ad2.png">

<img width="300" alt="image" src="https://user-images.githubusercontent.com/47352487/57651545-c11a9100-75cd-11e9-9b6e-c0b9a71cc6d6.png">

