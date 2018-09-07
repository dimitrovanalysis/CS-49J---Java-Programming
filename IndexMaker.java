import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class IndexMaker 
{
   private static class TreeNode //TreeNode
   
   {
      String ID;
      ArrayList<Integer> lineNumber;
      TreeNode left;
      TreeNode right;
      
      TreeNode(String ID, int numberL)
         {
            this.ID = ID;
            lineNumber = new ArrayList<Integer>();
            lineNumber.add(numberL);
         }
         
      void add(String name, int numberL)
         {
            
            if(this.ID.equals(name))
               {
                  
                  if(!this.lineNumber.contains(numberL))
                     this.lineNumber.add(numberL);
                     return;
               }
               
            else
               {
                  if(name.compareTo(this.ID) < 0)
                     {
                  
                        if(this.left == null)
                        this.left = new TreeNode(name, numberL);
                        
                        else
                        this.left.add(name, numberL);
                     }
                     
                  else
                     {
                        if(this.right == null)
                        this.right = new TreeNode(name, numberL);
                         
                         else
                           this.right.add(name, numberL);
                     }
               }
         }
         
         
         
      void inOrder()
      {
         if(left != null)
         left.inOrder();
         System.out.println(ID + ": " + lineNumber.toString());

         if(right != null)
            right.inOrder();
      }
   }
   //**********simple node instantiation w/ inOrder function
   
   
   private static ArrayList<String> loadReservedWords() throws FileNotFoundException
   {//loads all reserved words from reserved.txt
      ArrayList<String> reservedWords = new ArrayList<String>();
      Scanner infile = new Scanner(new File("reserved.txt"));
         
         while(infile.hasNext())
            reservedWords.add(infile.next());
         
         infile.close();
         return reservedWords;
   }

   private static TreeNode processIdentifier(int lineNumber, String ID, TreeNode tree, ArrayList<String> reserved)
   {
      if(reserved.contains(ID))
         return tree;
      
      else
         {
            if(tree == null)
            return new TreeNode(ID, lineNumber);
            
            else
               {
                  tree.add(ID, lineNumber);
                  return tree;
               }
         }
   }
   
   
   public static void main(String[] args) throws FileNotFoundException 
   { // main method taking advantage of node tree
      String filename = "ProcessRectangle.java";
      ArrayList<String> reservedWords = loadReservedWords();
      Scanner infile = new Scanner(new File(filename));
      TreeNode tree = null;
      int lineNumber = 1;

      while(infile.hasNextLine())
         {
            String line = infile.nextLine().trim();
            Scanner lineScan = new Scanner(line);
            lineScan.useDelimiter("[^A-Za-z_]+");
            
            while(lineScan.hasNext())
               {
                  String ID = lineScan.next();
                  tree = processIdentifier(lineNumber, ID, tree, reservedWords);
               }
               

            lineNumber++;
         }
         
         
      tree.inOrder();

   }
}