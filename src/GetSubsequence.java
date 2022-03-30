import java.io.*;
import java.util.*;

public class GetSubsequence {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    ArrayList<String> list = gss(str);
    System.out.print(list);

  }

  public static ArrayList<String> gss(String str) {

    if (str.length() == 0)
    {
      ArrayList<String> list = new ArrayList<>();
      list.add("");
      return list;
    }

    char ch = str.charAt(0);
    String ss = str.substring(1);
    ArrayList<String> ros = gss(ss);

    ArrayList<String> res = new ArrayList<>();
    for (String ss1 : ros)
    {
      res.add("" + ss1);
    }
    for (String ss2 : ros)
    {
      res.add(ch + "" + ss2);
    }
    return res;
  }

}