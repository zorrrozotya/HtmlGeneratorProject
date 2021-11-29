import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Start
{
    public static void main(String[] args)
    {
        List<File> files = new ArrayList<File>();
        listf("C:\\Users\\kovac\\Desktop\\Images", files);
        try
        {
            String indexTemplate = Files.readString(Paths.get("C:\\Users\\kovac\\Desktop\\project\\MintaIndex.html"), StandardCharsets.US_ASCII);
            System.out.println(indexTemplate);
    
        }
        catch(Exception e){
            return;
        }
        
        

    }
    public static void listf(String directoryName, List<File> files) {
        File directory = new File(directoryName);
    
        // Get all files from a directory.
        File[] fList = directory.listFiles();
        if(fList != null)
            for (File file : fList) {      
                if (file.isFile()) {
                    files.add(file);
                } else if (file.isDirectory()) {
                    listf(file.getAbsolutePath(), files);
                }
            }
    }


                       
}

