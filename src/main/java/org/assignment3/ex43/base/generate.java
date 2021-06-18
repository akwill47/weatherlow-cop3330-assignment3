package org.assignment3.ex43.base;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class generate {
    public boolean createHtml(String author, String siteName) throws IOException {
        File html = new File("./website/"+siteName+"/index.html");
        BufferedWriter bw = new BufferedWriter(new FileWriter(html));
        bw.write("<!DOCTYPE html>\n");
        bw.write("<html>\n<head>");
        bw.write("<title>"+siteName+"</title>\n");
        bw.write("<meta name=\"author\" content=\""+author+"\">\n");
        bw.write("</head>\n");
        bw.write("<body>");
        bw.write("</body>\n</html>");
        bw.close();

        System.out.printf("Created ./website/%s/index.html\n",siteName);




        return true;

    }
    public int createDirs(String author, String siteName,String css, String js){
        int check=0;
        String path;
        path ="./website/"+siteName;
        (new File(path)).mkdirs();
        System.out.printf("Created ./website/%s\n",siteName);
        check +=1;

        if(js.equals("y")){
            path ="./website/"+siteName+"/js";
            (new File(path)).mkdir();
            System.out.printf("Created ./website/%s/js/\n",siteName);
            check +=1;
        }
        if(css.equals("y")){
            path ="./website/"+siteName+"/css";
            (new File(path)).mkdir();
            System.out.printf("Created ./website/%s/css/\n",siteName);
            check +=1;
        }
       return check;
    }
}
