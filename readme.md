# BasketballSWENGS
This is the project Folder for the backend part of the SWENGS project of Carina Cölsestin, Vanessa Fortmüller, Nikolaus Hribernig and Patrick Plank.

In this readme you will only find minor information about how to get the database created and testdata imported. 

The Major data of the project documentation will be created in the scope of the Frontend project 

https://github.com/HribernigNikolaus/BasketballSWENGS

# Table of content

1. [How to set up](#how-to-set-up)
2. [Testdata](#testdata)
3. [Entity Description](#entity-description) 


#How to set up
* You need Java 
* Clone Project
* edit application.properties_template with your Database information,  
  change name to application.properties 
  (file will not be submitted because its listed in the .gitignore)

# Testdata
testdata could be found in ./testdata/testdata.txt 
just copy  & paste it via MySQLWorkbench or any other DB Editor and your first Teams, Players, Leagues, will appear on your frontend


# Entity description   

## League
* **Entity of Carina:**
    * **attributes:** name, fullName, teamCount, land, foundationYear
    * **searchfeatuers:**
        * findByName
        * findByLand
        * findById  
        
## Stadium
* **Entity of Vanessa:**
    * **attributes:** name, land, city, streetAndNumber, plz, buildDate, visitorLimit
    * **searchfeatuers:**
        * findByNameAndCity
        * findByLandAndCity


## Player
* **Entity of Niki:**
    * **attributes:** firstName, lastName, dayOfBirth, marketValue, playerNumber, height, position, team
    * **searchfeatuers:**
        * findByFirstNameAndLastName


## Teams
* **Entity of Patrick:**
    * **attributes:** name, hometown, startDate, mascot, stadium, league
    * **searchfeatuers:**
        * findByName
        * findByHometown
        
