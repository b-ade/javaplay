public class Human {
    int age;

    static String species = "HOMO-SAPIENS";

    public static void main(String[] args){
        Human human1 = new Human();
        Human human2 = new Human();

        human1.age = 23;
        human2.age = 45;

        human1.sayYourSpecies();
        human1.sayYourAge();
        human2.sayYourSpecies();
        human2.sayYourAge();

        String text = "No 1, billings way, lagos";
        echo(text);
    }

    public static void sayYourSpecies(){
        System.out.println("I am a "+species);
    }

    public void sayYourAge(){
        System.out.println("My age is "+age);
    }

    public static void echo(String text){
        // <type of data> <name of variable> [= <value to be assigned>];
        // int age = "twenty";

        /* need know size of memory allocated, type of data store
        char - character . e.g  'a', 'b'
        byte - 8 bits, numeric value, ranging from -128 to 127 
        boolean - 8 bits or a  byte,
        short - 16 bits; numeric values
        int - 32 bits; numeric values
        long - 64 bits; number
        float - 32 bits; decimal values
        double - 64 bits; decimal values
        
        bits as per binary digit 0 or 1
        01000001

        345678823463289434893426498

        2

        10001110111110000010101101001000110101101101100010010001000001010001111111001111101000010
        -8 to +7
        [0][0][1][0]  [][][][][][][][][][][]


        [+][][][][][][][][][][][][][][][]             [][][][][][][][][][][][][][][][][][][]
        */
        char initial = 'b';

        

        String another_text;
        System.out.println("You asked me to echo ==> "+text);
    }
}