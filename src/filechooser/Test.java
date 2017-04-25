package filechooser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 23/04/17.
 */
public class Test {

    public static void main(String[] args) {
        List<String> extention = new ArrayList<String>();
        extention.add("pdf");
        extention.add("xml");
        extention.add("txt");
        FileChooser fc = new FileChooser(extention);
        System.out.println(fc.getChooserFile());
    }

}
