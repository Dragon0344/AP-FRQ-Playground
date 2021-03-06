
public class unit2 {
    //Consider the following class.

    public class LightSequence {
        // attributes not shown

        /** The parameter seq is the initial sequence used for
        //
        //* the light display
        //
        //*/

        public LightSequence(String seq)
            { /* implementation not shown */ }

            /** Inserts the string segment in the current sequence,
            * starting at the index ind. Returns the new sequence.
            */

        public String insertSegment(String segment, int ind)
            { /* implementation not shown */
            return null;
            //for now
            }

            /** Updates the sequence to the value in seq
            */

        public void changeSequence(String seq)
            { /* implementation not shown */ }

            /** Uses the current sequence to turn the light on and off
            //
            //* for the show*/
        public void display()
            { /* implementation not shown */ }
    }

    public static void main(String[] args) {
        //(a) Write a statement to create a LightSequence object gradShow that has the initial light sequence "0101 0101 0101".
        //Write the statement below.

        LightSequence gradShow = new LightSequence("0101 0101 0101");

        //(b) Write a statement that will call the display method to display the light sequence for the gradShow object.
        //Write the statement below.

        gradShow.display();

        //(c) Write a statement that will be used to update the gradShow light sequence to "0011 0011 0011".
        //Write the statement below.

        gradShow.changeSequence("0011 0011 0011");

        //(d) Write a code segment that will call the insertSegment method to insert the segment "1111 1111" in the current sequence for gradShow at index 4. The resulting sequence will be stored in the string resultSeq.
        //Write the code segment below.

        String resultSeq = gradShow.insertSegment("1111 1111", 4);


        //(e) Assume that the string oldSeq has been properly declared and initialized and contains the string segment. Write a code segment that will remove the first occurrence of segment from oldSeq and store it in the string newSeq. Consider the following examples.

        //If oldSeq is "1100000111" and segment is "11", then "00000111" should be stored in newSeq.
        //If oldSeq is "0000011" and segment is "11", then "00000" should be stored in newSeq.
        //If oldSeq is "1100000111" and segment is "00", then "11000111" should be stored in newSeq.

        //Write the code segment below. Your code segment should meet all specifications and conform to the examples.

        String oldSeq;
        String segment;

        String newSeq = oldSeq.replaceFirst(segment,"");

        //(f) Two lights will be arranged on a two-dimensional plane. The vertical distance between the two lights is stored in the double variable a. The horizontal distance between the two lights is stored in the double variable b.

        //The straight-line distance between the two lights is given by the formula square root of the quantity a squared plus b squared.

        //Write a code segment that prints the straight-line distance between the two lights according to the formula above.

        double a;
        double b;
        
        System.out.println(Math.hypot(a,b));

    }

}
