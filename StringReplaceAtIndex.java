import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class StringReplaceAtIndex {

    /*
     * Complete the 'cavityMap' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY grid as parameter.
     */
    public static String replaceChar(String str, char ch, int index) {
    return str.substring(0, index) + ch + str.substring(index+1);
}
    
public static void main(String[] args){
    String s = new String("Hello World");
    System.out.println(s);
    s = replaceChar(s,'X',0);
    System.out.println(s);
}
}





