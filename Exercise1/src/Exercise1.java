
public class Exercise1 {
    public static void main(String[] args) {
        String s1 = "Reverse this word";
        String s2 = "Hello world, how are you?";
        Exercise1 demo = new Exercise1();

        System.out.println("String 1 after reverse: ");
        demo.reverse(demo.split(s1));
        System.out.println("String 2 after reverse: ");
        demo.reverse(demo.split(s2));
    }

    //Split string and save array
    public String[] split(String s){
        String []words = s.split(" ");
        return words;
    }

    //Reverse string
    public void reverse (String [] words){
        String temp = "";
        for (int i = 0; i < words.length; i++) {
            temp = words [i]+" "+ temp;
        }
        System.out.println(temp);
    }
}
