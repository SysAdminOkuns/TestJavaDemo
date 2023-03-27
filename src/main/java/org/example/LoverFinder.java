package org.example;

public class LoverFinder {

    public static void main(String... args){
        String text = "I love Java more than my friend loves apple and love";
        String word = "love";
        String word1 = word + "s";
        String str;
        StringBuffer sb = new StringBuffer();
        String textArray[] = text.split(" ");
        boolean flag = false;
        int count = 0;
        for(int i=0; i<textArray.length; i++) {
//            System.out.println(textArray[i]);
            if(textArray[i].equals(word)) {
                flag = true;
                word = word.toUpperCase();
                sb.append(" " + word);
                count += 1;
                System.out.println(textArray.length);
            } else if (textArray[i].equals(word1)) {
                flag = true;
                str =word1.substring(0,4);
                str = str.toUpperCase();
                str+= "s";
                sb.append(" " + str);
                count += 1;
            } else{
                sb.append(" " +  textArray[i]);
            }
        }
        if(flag) {
            System.out.println(sb);
            System.out.println("Number of occurrences is: "+count);
        } else {
            System.out.println("word not found");
        }
    }
}
