package org.example.kris.LessonsClasses;

public class ON {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        if( url.startsWith("http:")){
            int index = url.indexOf("p");
            String first = url.substring(0, index + 1);
           return first;
        }else if(url.startsWith("https:")){
            int index = url.indexOf("p");
            String first = url.substring(0, index + 2);
            return first;
        }

        //напишите тут ваш код
        return "неизвестный";
    }

    public static String checkDomain(String url) {
        if(url.endsWith(".com") || url.endsWith(".net") || url.endsWith(".org") || url.endsWith(".ru")){
            int index2 = url.lastIndexOf("."  );
            String one = url.substring(index2 +1 ,url.length());
            return one;


        }
        //напишите тут ваш код
        return "неизвестный";
    }
}
