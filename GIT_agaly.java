pwd
cd 
	cd ~ 	-> navigates to user level
	cd .. 	-> one level up
touch app.js
subl fourth.txt
mkdir anyFolder

git init
git status
git add anyFile.extension
	git add */./­­--all
git commit -m "Message text"
	git commit -> Enter -> for multiline commit messages
git commit -am "Express Commit Msg"
	! No need of adding before commiting
	! Not applicable for Fresh (First time created) files
git log
	git log --oneline
	git log --graph --oneline
	git log --graph --oneline --decorate
git alias
	git config --global alias.yourCmdName "full code without git keyword"
	git config --global alias.hist "log --graph --oneline --decorate --all"
	git config --global alias.s "status"
	! By creating shortcuts, full commands are still available to use

--------------------------------

git clone url
git touch second.txt
git add .
git commit -m "Second file addition"
git push origin master

--------------------------------

git remote add origin https://github.com/sulaisu97/backend-testing.git
git push -u origin master






----------------------------------------------------


GIT

1. Version Control System (VCS) for tracking changes in computer files

2. dnld for macs: http://git-scm.com/download/win

git --version
git config --global --list	

pwd
cd
touch app.js	creates a js file called "app" in folder

git init	to initialize a folder as a git repository (will be created ".git" hidden folder); so we will be able to use git commands

git config --global user.name 'Aisuluu Sulaimanova'
git config --global user.email 'sulaisu97@gmail.com'

git add index.html















----------------------------------------------------

AGALY'S NOTES

//git commands are for terminal and you can verify if you did those changes on GitHub repository
//If it is your first time

0.
	git config --global user.name username //username on GitHub
	git config --global user.email email   //email registered with on GitHub

//Create a folder that's the folder where you will be working on
//Accept a collaborator invitation from admin/company ***email invitation
//***on terminal change your directory to the folder you created make sure you are in it all the time***

1.
	git init
	git clone URL   //copy url of repository

//if you go to the folder you will see all the files from repository are in there
//do modifications you want to do on your computer
'git branch yourBranchName' //creating a branch for yourself
'git checkout yourBranchName' //you switch the branch it is master branch by default
'git status'                  //to see what files have to be staged and saved
                //with red letters
'git add filename.extension' //or as a shortcut you can use //git add -A// to add all files //this process called staging
'git commit -m "explanation' //you are saving you changes
'git push -u origin yourBranchName' //you are pushing to your branch and should be able to 
                 //see changes on GitHub repo if you did everything right
'git status'          //nothing to commit, working tree clean or green letters
//Have to figure out pull request to do peer review before merging your changes to master 
//branch assume pull request is done
git branch      //see in which branch you are in
git checkout master //switch to master branch
git merge yourBranchName //merge/upload your changed to master branch
//assume you are done for the day
//next morning before starting to work
git branch      //see what branch you are in the last one you was by default
git checkout master //switch to master branch
git fetch       
git pull        //get the latest version fetch and pull go hand to hand
//do your task inside your folder on comp 
git branch
git checkout yourBranchName
git add filename.extension
git commit -m "explanation"
git push -u origin yourBranchName
//Have to figure out pull request to do peer review before merging your changes to master 
//branch assume pull request is done
git branch
git checkout master
git merge yourBranchName













====================================================================================
====================================================================================

Questions-answers!!!

Git & GitHub 

-"https://git-scm.com/download/mac" // git website

-What is GitHub --> It is central storage in cloud that 
is used to host and review code!

-Git - version control tool that helps us simply store data!

-Why do we do pull request not merge it - because code should be aproved first 
all we are human!
====================================================================================
.GITIGNORE FILE
if you do not want to push to gitHub

- create file 
touch .gitignore 
-inside file type that file you do not need to push 
if folder 
/target/
/test-output/



====================================================================================
-Go to gitHub -->click branch - type new branch - click create new branch
-Clone that branch(it has everything that master at that moment)
-Go terminal -choose folder-->git clone Link
-Go to Eclipse -switch workspace-choose folder with git clone
-Team-switch to - own branch not master
if no branch go to terminal -git branch -if no branch -git checkout + 
	type branch you want - git branch and you will see that branch
-go eclipse make sure you are on new branch
-after changes - you can go to terminal - git add, git commit-m and git push
or in eclipse Team - commit-m
-commit and push
Go to GitHub - pull request -master -our branch
Reviwers and assign to smbd to review 
and if you only one you can merge by yourself to master branch!

SourceTree - tool for git! BitBucket.com (like gitHub)

====================================================================================
GENERAL COMMANDS FOR GIT!

*touch test.txt    // create file in our folder
*mkdir nameoffolder //create folder where we want
*ls //show us what is inside
*ls -a //hidden files show
*pwd //shows the way to the folder

if has folder with two separate words use cd “ ”

*ls -la //shows all files even hidden
*command + shift + . - it will show hidden files
*rm -rf .git //remofe for ex .git file
*cd .. //go back
*cd nameoffolder //go to that folder
*control + z //takes us out from comments


*history //will show all typing command
*yes //stress test to your computer(ctrl+c to exit)
*open //open a file from terminal(sometimes very useful)
*uptime //shows how long your mac has not been rebooted
*caffeinate //prevents your mac from going to sleep
*caffeinate -t 150000 //caffeinate for 150,000 seconds
*sudo shutdown-h now //shuts down now
*sudo shutdown -r +60 //restarts in 60 mins

Use TAB to auto-complete commands/directors

=============================================================================
GIT COMMANDS

*git --version //check version of git
*git config --global user.email "yourGitHub@email.com" //connect with github email
*git config --global user.name "yourGitHubusername" //connect with github password
*git remote -v //to see which repository connected
*git --help // show you all command for git
*git log  //git commit history
*git diff //shows different between last commit and current
*git clone //clone from repo to your folder

*git init  //mark folder that will be used by git(inside created .git)
*git status  //check status with this command

*git add *.txt   //will add all txt files to git that are in folder
*git add .    or git add *.*  //will add everything in the folder to git
*git add folder //will add folder

*git commit -m “…..”  // adding comment to the repository 
*git commit -a -m "new file 4" //adding and commit file at the same time

*git remote add origin “link from github”  //connect git with github repository

*git push -u origin master  //push to gitHub
*git pull origin master // internet pull
*git fetch origin master // locally pull
*git merge nameOfBranch //
*git stash //
*git stash apply //


*git branch //to see what branches do we have
*git branch nameOfBranch  //create branch
*git checkout nameOfBranch //change between branches

*git branch -d branchName. //delete from local only
*git push origin –delete branchName. //delete from gitHub

=================================================================================
to collabortate on a repo on GItHub, owner/admin of the repo must add other users as collaborators. 
how to add
1. open the project on github--> settings ---> collaborators
2. add users based on username or email


___

----------------------------------
SCENARIO 1

I make changes to the project, and no one else changed the remote repository

commands 
git add
git commit
git push
----------------------------------
SCENARIO 2
when I changed a file/files, some else changed a different file and pushed to the remote repo.

in this case non fast-forward error will be thrown. It means I dont have the latest code from the remote
repository.

YOU CANNOT PUSH CODE WITHOUT GETTING THE LATEST CODE FROM THE REMOTE REPO

SOLUTION
1. git pull --> take the latest from the remote repo and merge with with local changes
2. git push
----------------------------------
SCENARIO 3

when I changed a file/files, some else changed the same file and pushed to the remote repo.

outcome 1
in this case non fast-forward error will be thrown. It means I dont have the latest code from the remote
 repository.

solution
git pull

outcome
we get CONFLICT message since I changed the same file as remote repo.

solition:
we need to resolve the conflict ourselves
1. open the file with conflicts in eclipse, any texteditor


<<<<<<< HEAD
/// adding a line code 
// second comment

=======

lines between <<<<<<< HEAD and ======= are my local changes

=======
// stop with the comments
>>>>>>> 146fc53d2c9d286899c3b3fb1df12077fe556187


lines between ======= and >>>>>>> are changes from remote repository

I resolce conflict by deleting the change that I dont want to keep. I have to keep either my or their
 changes. 
If I want to keep my changes, I delete

following lines:

<<<<<<< HEAD
=======
// stop with the comments
>>>>>>> 146fc53d2c9d286899c3b3fb1df12077fe556187

 

If I want to keep their changes, I delete the following
<<<<<<< HEAD
/// adding a line code 
// second comment
>>>>>>> 146fc53d2c9d286899c3b3fb1df12077fe556187


after deleting their changes, we add the file again 
git add
git commit

git push

----------------------------------
SCENARIO 4

what if I want to keep both changes

git pull
merge conflict by keeping their change. save your changes somewhere (in sublime)
git add
git commit
git push

change the file with your saved changes

git add
git commit
git push
____


COMMIT BEFORE PULL SO THAT YOUR CODE WILL NOT BE OVERWRRITTEN BY CHANGES FROM REMOTE REPO

First step: 
git fetch --all

fetches the changes from remote
Second step: 
git reset --hard origin/master

override my changes with the changes which came in the step 1


























----------------------------------------------------

Shift+Command+Dot	to see hidden files
under the hoods - под капотами