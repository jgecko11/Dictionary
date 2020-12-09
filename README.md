Dictionaries (or Maps) are data structures that order data into key-value pairs. There can only be a single occurrence of a key, but we can repeat values. Dictionaries are random access, so you can access any piece of data at any point in time.

Here are the methods we would expect a dictionary to provide (and the ones I expect  you to write):

    /*  A Java dictionary should use generics for the
     *  types of both key and value. E and T here.
     */

    //add an key-value pair to the dictionary
    void put(E key, T value)

    //get the value associated with a given key
    T get(E key)

    //remove a key-value pair and return its value
    T remove(E key)

    //returns true if the given key has an associated value
    boolean contains(E key)

    //returns true if the dictionary is empty
    boolean isEmpty()

    //returns the number of key-value pairs in the dictionary
    int size()

    //returns a Collection¹ of keys
    Collection<E> keys()

    //returns a Collection of values
    Collection<T>  values()
  
 Dictionaries are common features in modern programming languages. Unordered key-value mappings show up in Python:

dictionary = {}

dictionary["name"] = "Bob Smith"
#            ^key       ^value
And in JavaScript:

var object = {} //JavaScript's key-value stores are called objects

object["name"] = "Bob Smith"
//       ^key       ^value
You will be coding a Dictionary through the use of arrays (or, if you'd prefer, ArrayLists). Recall what you've learned about ArrayLists already this semester.

Please work ALONE to complete this assignment, using git version control, good commit messages, and feature branches. Feel free to use Google (or any of your classmates) for collaborative help, but do write the code yourself. I will be here to answer any questions you might have, but please FULLY READ THIS ASSIGNMENT FIRST before asking any clarifying questions about the lab.
