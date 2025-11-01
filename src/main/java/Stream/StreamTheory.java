package Stream;

public class StreamTheory {

    /**
     * Why Streams in JAVA:
     *      We use stream in a java to process object define in a collection.
     *      Streams come under the java.util package
     *
     *      * Java IO Stream mean not this one, it is for file operations.
     *
     *  How stream process data stored in a collection:
     *      It introduced following mechanism to process data
     *             1. Filter
     *             2. Map
     *
     *        01. Filter -
     *                Filter we are using to manipulate with a logic and on a saved collection data then store
     *                in a new collection.
     *                  - Here data count may be reduced
     *
     *        02. Map  -
     *                Map we are using to do some logic by changing or not changing data saved in a collection then
     *                store in a new collection
     *                  - Here data count will not be reduced, same data amount will be in the new collection
     *
     *      * After stream the data you can using following methods as well,
     *                  - sort() , count(), collect(), distinct(), foreach(), min(), max()
     *
     *            those method having inside the stream class
     *
     *      * FlatMap :-
     *
     *          - If there is a complex data to process we can use this.
     *          - Complex collection means multiple collections in a one collection.
     *                  eg:- {{12,32},{44,32},{54,67}}
     *          - Flatmap can return multiple collection at a time as a single collection.
     *          - This is take one argument and return stream of object.
     *
     */
}
