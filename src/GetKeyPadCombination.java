import java.io.*;
import java.util.*;

public class GetKeyPadCombination {
  static Map<Character, String> map = new HashMap<>();

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    map.put('0', ".;");
    map.put('1', "abc");
    map.put('2', "def");
    map.put('3', "ghi");
    map.put('4', "jkl");
    map.put('5', "mno");
    map.put('6', "pqrs");
    map.put('7', "tu");
    map.put('8', "vwx");
    map.put('9', "yz");
    String str = sc.next();
    ArrayList<String> list = getKPC(str);
    System.out.println(list);

  }

  public static ArrayList<String> getKPC(String str) {


    if (str.length() == 0)
    {
      ArrayList<String> list = new ArrayList<>();
//       String st2 = map.get(str);
//       for (int i = 0; i < st2.length(); i++)
//       {
//         list.add(st2.charAt(i) + "");
//   //
//       }
      list.add("");
      return list;
    }


    String st1 = map.get(str.charAt(0));
    ArrayList<String> ros = getKPC(str.substring(1));
    ArrayList<String> res = new ArrayList<>();
    for (int i = 0; i < st1.length(); i++)
    {
      char ch = st1.charAt(i);
      for (int j = 0; j < ros.size(); j++)
      {
        res.add(ch + "" + ros.get(j));
      }
    }


    return res;
  }

}