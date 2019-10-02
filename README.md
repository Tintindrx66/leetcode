# leetcodeHOW TO USE THIS REPO:

Naming convention:

    create a folder for each leetcode question, the folder name should be the question number.
    e.g. folder named "1" for question No.1 Two Sum 

    inside the folder 
        the solution should be named with proper suffix. e.g. for java, xxx.java
        test cases (if any) should be provided by pairs of input/ouput file. e.g. 1.in/1.out 2.in/2.out etc.
 
Git workflow:

    We will use a simple git workflow as follows:

    Rui-Xiang works on the master branch. Each commit should be within 1 question.
    e.g. commit can be a partial solution. However, if solutions to multiple problem are to be commited, 
    they should be dividedinto couple smaller ones, one for each question.
    Please use meaningful commit message for future reference. Push the code so that it can be visible to others. 

    Ray will NOT work on master branch. Instead, he will checkout Rui-Xiang's work on a issue branch upon request. 
    Ray will NOT merge the issue branch to master either. Rui-Xiang should checkout Ray's work on the issue branch 

some commands:
    "mkdir dir_name": create a directory named dir_name
    "subl a.java": edit/create a java file named a.java, this can also be done with whatever texteditor you prefer
    "git add file_name": add the changes to a file so that it can be committed 
    "git status": check status
    "git commit": commit the change 
    "git push": push your change to server, so that others can see it



