package lt.vcs;

import java.io.*;
import java.nio.charset.Charset;

public class Main {

    public static void main(String[] args) throws IOException {
	    File file = new File("C:\\temp\\failas.txt");
        VcsUtils.println(file.toString());

        BufferedWriter bw = VcsUtils.newWriter(file.toString());
        bw.append(VcsUtils.NEW_LINE + "Ketvirta");
        bw.flush();
        bw.close();

        BufferedReader br = VcsUtils.newReader(file.toString());
        String line;
        while ((line = br.readLine()) != null) {
            VcsUtils.println(line);
        }
        br.close();
    }
}
