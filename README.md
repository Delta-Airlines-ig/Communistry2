# Communistry 2
[OG communistry found here (its kinda bad)](https://github.com/Delta-Airlines-ig/Communistry)

this mod is also using [this cursed mod](https://github.com/helpll/helplinedustry) for its items and machines (this mod is kinda just a dlc to helplinedustry)  
remember that you also need [helplinedustry's dependancies](https://github.com/liplum/MultiCrafterLib/releases/tag/v1.7) too!

idea for innacuracy:  
convert quartion to float for angle like with player rotation  
set bullet rotation to the angle with slight error  
move bullet new vector2(mathf.sin(bullet rotation) * fireforce, mathf.cos(bullet rotation) * fireforce)  

weapons will work like this:  
add a variable of type weaponpickup (or something along those lines)  
when touching weaponpickup sprite, set weapon pickup to the gameobject attached to the sprite  
use getters/setters to transfer over data from weaponpickup  

randomisation works like this:  
list of strings in weaponpickup  
strings are avaible attributes (and theres more lists for weapon types)  
for loop some amount of times and add random string from avStrings to usedStrings list  
delete the item at said index in avStrings  
a bunch of if, elses will set attributes to actual numbers in variables inside the code   
getters to output the variables  
the above loop will also run once for weapon type (eg. pistol, shotgun, etc)  

other ideas (not in order):  
add ammo counts  
reloading  
add more bullet types(eg. plasma bullet, missile bullet, basic bullet, fire bullet, etc..)  
random weapons  
make gui better  
better particle fx  
improve graphics and sound  
make all sprites solid white/black to make in-editor coloring easier  
ammo pickups from enemies or just on the ground  
building (??)  
make actual waves and randomly spawning enemies  
dungeons can be made later to replace waves  
add coin drops from enemies that can be spent in the dungeon for whatever upgrades  
improve enemy ai (additionally make it work by finding closest (or strongest) player)  
stop errors from happening due to player dying  
add more enemy types(eg. fast enemy, shotgun enemy, turret enemy, boss, etc.)    
explosive boxes  
move build folder to not be in the same folder as assets  
main menu  
difficulty selector  
multiplayer (would be cool but idk how i would do that)  
make 2 weapon slots that you can switch between  
powerups (eg. +50% movement, +25% shootspeed, etc.)  
abilities (?)  
make up a name for the game  
distribute on itch (maybe?)  


## Building for Desktop Testing

1. Install JDK **17**.
2. Run `gradlew jar` [1].
3. Your mod jar will be in the `build/libs` directory. **Only use this version for testing on desktop. It will not work with Android.**
To build an Android-compatible version, you need the Android SDK. You can either let Github Actions handle this, or set it up yourself. See steps below.

## Building through Github Actions

This repository is set up with Github Actions CI to automatically build the mod for you every commit. This requires a Github repository, for obvious reasons.
To get a jar file that works for every platform, do the following:
1. Make a Github repository with your mod name, and upload the contents of this repo to it. Perform any modifications necessary, then commit and push. 
2. Check the "Actions" tab on your repository page. Select the most recent commit in the list. If it completed successfully, there should be a download link under the "Artifacts" section. 
3. Click the download link (should be the name of your repo). This will download a **zipped jar** - **not** the jar file itself [2]! Unzip this file and import the jar contained within in Mindustry. This version should work both on Android and Desktop.

## Building Locally

Building locally takes more time to set up, but shouldn't be a problem if you've done Android development before.
1. Download the Android SDK, unzip it and set the `ANDROID_HOME` environment variable to its location.
2. Make sure you have API level 30 installed, as well as any recent version of build tools (e.g. 30.0.1)
3. Add a build-tools folder to your PATH. For example, if you have `30.0.1` installed, that would be `$ANDROID_HOME/build-tools/30.0.1`.
4. Run `gradlew deploy`. If you did everything correctlly, this will create a jar file in the `build/libs` directory that can be run on both Android and desktop. 

## Adding Dependencies

Please note that all dependencies on Mindustry, Arc or its submodules **must be declared as compileOnly in Gradle**. Never use `implementation` for core Mindustry or Arc dependencies. 

- `implementation` **places the entire dependency in the jar**, which is, in most mod dependencies, very undesirable. You do not want the entirety of the Mindustry API included with your mod.
- `compileOnly` means that the dependency is only around at compile time, and not included in the jar.

Only use `implementation` if you want to package another Java library *with your mod*, and that library is not present in Mindustry already.

--- 

*[1]* *On Linux/Mac it's `./gradlew`, but if you're using Linux I assume you know how to run executables properly anyway.*  
*[2]: Yes, I know this is stupid. It's a Github UI limitation - while the jar itself is uploaded unzipped, there is currently no way to download it as a single file.*
