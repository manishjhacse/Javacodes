public class StringConcatenation {
    public static void main(String[] args) {
        String s1=new String("manish");
        s1.concat(" jha");
        //this will not change s1 but it will create a new string in the heap area
        System.out.println(s1);
        //this will not print manish jha as s1 is not refering to "manish jha",
        //currently s1 is refrening to "manish"
        s1=s1.concat(" jha");
        //here we are refering s1 to "manish jha" which is created in the heap memory
        System.out.println(s1);
        //now this will print "manish jha"
    }
}
