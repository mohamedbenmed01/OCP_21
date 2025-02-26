package chapiter01;

public class TextBlock {

    public String exeample = "String";

    {
        int p = 3;
        {
            int q =4;
        }
        System.out.println(p);
    }
    
    public static void main(String[] args) {
        var a=3;
        var b =4;
        String label = """
                *
                **
                ***
                """;
        System.out.print(label);
        System.out.println("==============");
        String block1 = """
                doe
                --\s
                ___
                deer
                """;
        System.out.print(block1);
        System.out.println("==============");
        String block2 = """
                "doe\"\"\"
                \"deer\"""
                """;
        System.out.print(block2);
        System.out.println("==============");
        String block3 = """
                doe
                --\
                ___
                deer""";
        System.out.print(block3);
/*
        "doe"""
        "dear"""

*/
    }
}