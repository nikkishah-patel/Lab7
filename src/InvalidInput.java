
public class InvalidInput {



String in;
while(true){
System.out.println("Please enter the student and information you are looking for. ");

    try {
        in = getString();
        int result = EvalPostFix(in); 
        System.out.println(result);


    } catch (IOException e) {
        // TODO Auto-generated catch block
        String s = "Not a valid postfix string";
        e.toString();
        in = getString();
    }
}
}