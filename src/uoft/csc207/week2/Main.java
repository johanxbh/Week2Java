package uoft.csc207.week2;

public class Main {

    public static void main(String[] args) {
        String[] name = {"First", "Middle", "Last"};
        // something in the debugger
        // args = (String[0]@490) means that the String array have 0 elements, @490 is the id in python
        // null is not an object
	    Person p = new Person(name, "moogah");
        Person s = new Student(name, "frooble", "123");
        System.out.println(p);
        System.out.println(s);
    }
}

// repository is the record of changing information
// you can put repository in different platform
// under the git changes to be committed will be committed if we type git commit

// if they are both in the changes not staged for commit, they will be committed anyway.

// backuo and restore, synchronization, short term undo, long term undo, track changes, sandboxing, branching and merging.
// brancing and merging, to merge after the code is working, two branches ar parallel.
// git is build for plain text file.  the only thing in these files are only text taht you could type. not the binary files.
// git diff tells you what is changed related to the previously committed one.

// we will usually create the remote repository
// you will clone your repository, add and changes and push on the remote one

// git log shows the history of the commit

// clone means you have the local repository, fork means that you are making a new origin. while clone does not.
// .git is a directory that git store the file
// origin and local are the same when clone

// git add means you want to this file to be in the next commit. everytime you need to add before the commit
// file can be reacked, which means it is committed
// untracekd means you not run a git command on the file
// staged means you want it to be part of the next commit

// git pull can update the local one with the remote one
// you have to pull first and then commit or push, when you have conflict, you need to discuss
// look more on the ppt to get more resourse