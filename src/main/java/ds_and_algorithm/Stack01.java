package ds_and_algorithm;
import java.util.Stack;
public class Stack01 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlands");
        stack.push("FFVI");
        System.out.println(stack.empty());//false
        System.out.println(stack); // [Minecraft, Skyrim, Doom, Borderlands, FFVI]

        //Pop method --Last-in First-out
        stack.pop();

        System.out.println(stack); //FFVI deleted, last-in-first-out

        //Pop method in variable
        String myFavGame = stack.pop();
        System.out.println(myFavGame); //Last object to be deleted shown in myFavGame var

        //Peek method -- Peek last object without deleting.
        System.out.println(stack.peek());// Doom //Peeks the last without removing

        //Search method -- Searches the object starting from the end, RETURNS -1 if not present,number of the order its in if present.
        System.out.println(stack.search("Doom")); //1.Doom,last in first out
        System.out.println(stack.search("Skyrim"));//2.Skyrim,second last in, second first out

        for (int i = 0; i < 1000000000;i++){
            stack.push("FFVI");
        }
        // uses of stacks?
        // 1. undo/pedo features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)|


    }
}
