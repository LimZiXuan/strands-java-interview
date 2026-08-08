package com.strands.spf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6
{
    public static void main(String[] args)
    {
        // a)
        Pattern emailPattern = Pattern.compile("^[a-z]\\.[a-z]+@strands\\.com$");
        System.out.println(emailPattern.matcher("f.soler@strands.com").matches());
        System.out.println(emailPattern.matcher("i.tarradellas@strands.com").matches());
        System.out.println(emailPattern.matcher("a.dereina@strands.com").matches());

        // b)
        Pattern merchantDatePattern = Pattern.compile("^([A-Z]+)(\\d{1,2}/\\d{1,2}/\\d{2})$");

        Matcher m1 = merchantDatePattern.matcher("ELCORTEINGLES28/5/13");
        System.out.println(m1.matches());
        System.out.println(m1.group(1));
        System.out.println(m1.group(2));

        Matcher m2 = merchantDatePattern.matcher("CARREFOUR2/10/13");
        System.out.println(m2.matches());
        System.out.println(m2.group(1));
        System.out.println(m2.group(2));
    }
}
