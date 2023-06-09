package Year2023;

public class Task1_AboutJavaAndVariable {

    // ***************************
    // Whole numbers
    // ***************************
    // byte     1 byte from -128 to 127
    // short    2 bytes from -32768 to 32767
    // int      4 bytes from -2147483648 to 2147483647
    // long     8 bytes from -9223372036854775808 to 9223372036854775807
    // ***************************

    // ***************************
    // Fractions numbers
    // ***************************
    // float    4 bytes — Slight accuracy
    // double   8 bytes - Greater precision
    // ***************************

    // ***************************
    // Symbols
    // ***************************
    // char     1 byte from -128 to 127 / from 0 to 255 compilations /J
    // Use symbols ASCII
    // ***************************

    // ***************************
    // Logics
    // ***************************
    // boolean  4 bytes
    // ture or false
    // ***************************


    // && - And
    // || - Or
    // == - Equal
    // != - Not Equal
    // => - Equal or More
    // <= - Less or Equal
    // >  - More
    // <  - Less
    // !  - Don't
    // =  - Assignment

    // ***************************
    // Massive
    // type[] nameMassive = new type[size massive]
    // Days = int[] daysInMonth = new int[12];
    // Month = daysInMonth[0] = 31
    // [0][1][2][3][4][5][6][7][8][9][10][11]

    // ***************************
    // Methods
    // type NameMethods
    // (list_options) {
    // Head methods;
    // ...
    // return type }
    // If method don't return no data = so type method = void
    // If the method does not take any parameters      = ()
    // If the method returns data                      = return
    // Method = NameVariable.method();                 = Call method
    // The type of data returned must match the type specified when declaring the method

    // ***************************
    // Constructor
    // NameClass(list_parameterized) {
    // head constructor;
    // ... }

    // ***************************
    // Overload
    // feature of Java in which a class has more than one method of the same name and their parameters are different
    //

    // ***************************
    // Encapsulation
    // All fields must be Private
    // Methods witch use other classes must be Public, other Privet

    // ***************************
    // Collections
    // int size = 0;
    // add(String s);
    // => array[size] = s; size++;
    // remove(int index);
    // [1][2][3][4][5][6][7][8][9][10]
    // size == 10

    // getSize();
    // get(int index);

    // ***************************
    // ArrayList
    // Get element on index - O(1) =  + Plus - Advantages
    // Insert element in last list - O(1) = + Plus - Advantages

    // Delete elements long - O(N) = - mines - Flaws
    // insert element in the middle or Start list = - O(N) - mines - Flaws
    // Change size massive not change for delete elements - Memory leak may occur = - mines - Flaw

    // Get element by index - O(1)
    // Insert an element at the end of the list - O(1)
    // Removing an element - O(N)
    // Inserting an element in the middle or beginning of the list - O(N)


    // ***************************
    //LinkedList
    // class Node {
    //    Node previous;
    //    T value;
    //    Node next;
    // }

    // Node first;      => Node1
    // Node last;       => Node2
    // int size = 4;

    // Node1
    // previous;
    // value = 5;
    // next;

    // Node2
    // previous
    // value = 7;
    // next;

    // CarList: CarArrayList, CarlindedList         List: ArrayList      LinkedList
    // Get elements on index                           O(1)                O(N)
    // Add element at the end list                      O(1)                O(1)
    // Add element in start or middle list              O(N)                O(1)
    // Delete element on index                          O(N)                O(1)

    // If need often delete element in collections or often add objects in the start or middle list - use LinkedList
    // If delete elements from collections in LinkedList - memory clear right away, and in ArrayList - NO

    // If need often add elements in the end list or get objects on index, use ArrayList.
    // In documentations - Always instead basic massive use ArrayList

    // Questions:
    // 1) What is the difference between collections ArrayList and LinkedList
    // - In ArrayList At the core lies an array (massive)
    // - In LinkedList At the core linked list (links)
    //
    // 2) What is the algorithmic complexity of obtaining by index in ArrayList and LinkedList?
    // - ArrayList O(1)  LinkedList O(N)
    //
    // 3) What is the algorithmic complexity of removing an element by index in ArrayList and LinkedList?
    // - ArrayList O(N) inkedList O(1)
    //
    // 4) When should you use ArrayList instead of LinkedList?
    // - If you often need to insert an element in the middle or beginning of the list,
    // or you often need to remove objects from the collection, then you should use LinkedList
    //
    // 5) What problems can there be in "ArrayList" if many elements are constantly added and removed from it, what problems can arise?
    // - Possible memory leak, due to the fact that the internal size of the array is not automatically reduced when elements are removed
    //
    // ***************************


}
