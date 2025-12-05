package Lecture24(Question)(5Dec);

public class Keypad {
    public ArrayList<String> appen(ArrayList<String>s1 , String s2){
        ArrayList<String>s5 = new ArrayList<>();
        for(int i =0;i<s2.length();i++){
            for(int j=0;j<s1.size();j++){
                String s4 = s1.get(j) + s2.charAt(i);
                s5.add(s4);
            }
        }
        return s5;
    }
    public List<String> letterCombinations(String digits) {
        String[] str = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String>st1 = new ArrayList<>();
        //now let us take the first one 
        int a3 = Character.getNumericValue(digits.charAt(0));
        String f = str[a3];
        System.out.println(f);
        for(char c : f.toCharArray()){
            String s1 = c + "";
            st1.add(s1);
        }
        // System.out.println(st1);
        //now we have append the first one
        for(int i=1;i<digits.length();i++){
            int ch1 = Character.getNumericValue(digits.charAt(i));
            
            //now we need to append 
           st1 = appen(st1,str[ch1]);
        //    System.out.println(st1);
        }



        return st1;
    }
    public static void main(String args[]){
        Keypad k1 = new Keypad();
        List<String>res = k1.letterCombinations("23");
        System.out.println(res);
    }
    
}
