import java.util.Arrays;
//Arrays
public class h9 {
    public static void main(String[] args) {
        //Arrays:
        //declare, length, index, loop, compare
        String name = "John";
        //declare
        String[] arr = {"John", "Peter", "Paul"};
        //declare array
        String[] word = {"c","a","t","w","o","m","a","n",};
        System.out.println(Arrays.toString(word));

        //length
        System.out.println("Length of array " + word.length);
        int l = word.length;
        System.out.println("Length of array " + l);

        //using one value in the array
        System.out.println(word[0]); // 0 based indexing
        System.out.println(word[1]);
        System.out.println(word[7]);
    }
}
