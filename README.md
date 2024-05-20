# Array_v_ArrayList
Difference between arrays and array lists

# Arrays
Arrays in Java work just like other arrays in other languages. They are just a simple collection of "like" values such as strings, ints,
floats, ect. 
You need an include import java.util.Arrays; to use arrays. 

You have to declare them like this:
String names[] = {"Andy","John", "Jack", "Sarah"};

You don't need to set the size, but you do need to set each cell of the array to a value or null value. Otherwise you'll get a compile error. 
To set the inital size you have to declare a new object. 
For example:
String[] doh = new String[10]; - will create a new array size 10 each element set to null. 

To set an element in the array to a value you assign it like any other variable:
blah[0] = "Hello";

To resize you have to use Arrays.copyOf(<array to copy>, <new size>)
Example:doh = Arrays.copyOf(names,10);

Arrays are good data structures for simplistic things. Things that you just need a place to put your data that you aren't going to modify or move around. If you need to modify, move data around or do other things then I would suggest a different data structure like an ArrayList. 

#ArrayLists
Array lists are like arrays but they give you a ton more options and its a lot easier to control over your data. I'm sure in the bowls of Java ArrayLists are just arrays and they are doing all the work for you behind the scenes. 

You first need a library for ArrayLists. import java.util.ArrayList; If you are in VS code you can put that line in and then hit F12 and it will bring you to the class definition so you can see how they implemented the various functions of ArrayList. 

Then you can declare an ArrayList like so: ArrayList<String> namesList = new ArrayList<String>();
You can add elements to an array like so:
namesList.add("Andy");

As you can see there's no need to resize an array it will grow on it's own as you add and remove elements. 
You don't need a for loop to print them. You can print the elements easier like so: System.out.println(namesList); 

There's a bunch of stuff you can do with Arraylists. 
Examples:
find what number an element is: namesList.indexOf("John"));
Tell if an element is in an array list: namesList.contains("Jack"));
remove an element: namesList.contains("Jimmy")) 

These operations can be done with arrays. You have to actually write the code to do it. However, with arraylists it's already written for you. 





