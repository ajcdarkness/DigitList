package JacobCedar;

import java.util.*;
import java.lang.String;
public class Digits{
    private ArrayList<Integer> digitList;
    public Digits(int num){
        ArrayList list = new ArrayList();
        String x = Integer.toString(num);
        for(int i = 0; i < x.length(); i++){
            int y= Integer.parseInt(x.substring(i,i+1));
            list.add(y);
        }
    }

    public ArrayList<Integer> getDigitList() {
        return digitList;
    }

    public boolean isStrictlyIncreasing(){
        for(int i = 0; i < digitList.size()-1; i++){
            if(digitList.get(i).intValue() >= digitList.get(i+1).intValue()){
                return false;
            }
        }
        return true;
    }
}
