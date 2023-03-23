package org.example;

public class LoverFinder {

    public static void main(String... args){
        String text = "I love Java more than my friend loves apple";
        String word = "love";
        String word1 = word + "s";
        String str;
        StringBuffer sb = new StringBuffer();
        String textArray[] = text.split(" ");
        boolean flag = false;
        int count = 0;
        for(int i=0; i<textArray.length; i++) {
            if(textArray[i].equals(word)) {
                flag = true;
                word = word.toUpperCase();
                sb.append(" " + word);
                count = count+1;
            } else if (textArray[i].equals(word1)) {
                flag = true;
                str =word1.substring(0,4);
                str = str.toUpperCase();
                str+= "s";
                sb.append(" " + str);
                count = count+1;
            } else{
                sb.append(" " +  textArray[i]);
            }
        }
        if(flag) {
            System.out.println(sb);
            System.out.println("Number of occurrences is: "+count);
        } else {
            System.out.println("File does not contain the specified word");
        }
    }
}
