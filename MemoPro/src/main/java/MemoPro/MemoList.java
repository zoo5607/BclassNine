package MemoPro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoList {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<MemoInsert> memoList = new ArrayList<>(); // 게시글 객체를 저장할 리스트

    public ArrayList<MemoInsert> getMemoList(){
        return memoList;
    }
    public void setMemoList(ArrayList<MemoInsert> memoList) {
        this.memoList = memoList;
    }
    public String printMemoList(){
        String str = "";
        for(int i = memoList.size()-1;i>=0; i--){
            str += memoList.get(i)+"\n";
        }
        return str;
    }

    public void  addMemo(MemoInsert memoInsert){
        memoList.add(memoInsert);
        reNumber();
    }

    private void reNumber() {
        for(int i = 0; i<memoList.size(); i++){
            memoList.get(i).setNo(i+1);
        }
    }


}
