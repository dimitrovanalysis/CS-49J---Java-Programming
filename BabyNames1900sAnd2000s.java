
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BabyNames1900sAnd2000s {

    public static Scanner getScanner(File file)throws FileNotFoundException
    {
        return new Scanner(file);
    } // method seen on internet for when taking in external files
    
        public static Scanner getScanner2(File file)throws FileNotFoundException
    {
        return new Scanner(file);
    }
    
    public static void main(String[] args) throws FileNotFoundException
    {
        String file1 = args[0];
        String file2 = args[1];
        
        // trying to organize the data
        Map<String, Integer> boyNames1900 = new HashMap<>();
        Map<String, Integer> boyNames2000 = new HashMap<>();
        Map<String, Integer> girlNames1900 = new HashMap<>();
        Map<String, Integer> girlNames2000 = new HashMap<>();
        
        Scanner scan = getScanner(new File(file1));
        
        scan.nextLine();
        scan.nextLine();
        
        while (scan.hasNext()) 
        {
            String[] data = scan.nextLine().split("\t");
            String boy = data[1];
            int boyInt = Integer.parseInt(data[2].replace(",", ""));
            
            String girl = data[3];
            int girlInt = Integer.parseInt(data[4].replace(",", ""));
            
            boyNames1900.put(boy, boyInt);
            girlNames1900.put(girl, girlInt);

        }
        
        scan.close();
        
        scan = getScanner(new File(file2));
        scan.nextLine();
        scan.nextLine();
        
        while (scan.hasNext()) {
        
            String[] data = scan.nextLine().split("\t");
            String boy = data[1];
            int boyInt = Integer.parseInt(data[2].replace(",", ""));
            
            String girl = data[3];
            int girlInt = Integer.parseInt(data[4].replace(",", ""));
            
            boyNames2000.put(boy, boyInt);
            girlNames2000.put(girl, girlInt);

        }
        
        scan.close();
        
        List<String> popularBoy = new ArrayList<>();
        List<String> popularGirl = new ArrayList<>();

        for(String key:boyNames1900.keySet()){
            if(boyNames2000.containsKey(key)){
                popularBoy.add(key);
            }
        }

        for(String key:girlNames1900.keySet()){
            if(girlNames2000.containsKey(key)){
                popularGirl.add(key);
            }
        }
        
        Collections.sort(popularBoy);
        Collections.sort(popularGirl);

        int N=0;
        
        if (popularBoy.size()>popularGirl.size())
        {
            N=popularBoy.size();
            
            for(int i=0;i<N;i++)
            {
            
                if (i<popularGirl.size())
                {
                    System.out.println(String.format("%-30s%-30s",popularBoy.get(i),popularGirl.get(i)));
                }
                else 
                {
                    System.out.println(String.format("%-30s",popularBoy.get(i)));
                }
            }
        }
        
        else 
        {
            N=popularGirl.size();

            for(int i=0;i<N;i++)
            {
                if (i<popularBoy.size())
                {
                    System.out.println(String.format("%-30s%-30s",popularBoy.get(i),popularGirl.get(i)));
                }
                else 
                {
                    System.out.println(String.format("%-30s",popularGirl.get(i)));
                }
            }
        }


    }


}