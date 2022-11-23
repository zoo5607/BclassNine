package MemoPro;

import java.util.ArrayList;


public class MemoList {

    private ArrayList<MemoInsert> memoList = new ArrayList<>(); // 게시글 객체를 저장할 리스트

    public ArrayList<MemoInsert> getMemoList() {
        return memoList;
    }

    public void setMemoList(ArrayList<MemoInsert> memoList) {
        this.memoList = memoList;
    }

    public String toStringMemoList() {
        StringBuilder str = new StringBuilder();
        for (int i = memoList.size() - 1; i >= 0; i--) {
            str.append(memoList.get(i)).append("\n");
        }
        return str.toString();
    }

    public void addMemo(MemoInsert memoInsert) {
        memoList.add(memoInsert);
        reNumber();
    }

    private void reNumber() {
        for (int i = 0; i < memoList.size(); i++) {
            memoList.get(i).setNo(i + 1);
        }
    }

    public void viewMemo() {
        if (!memoList.isEmpty()) {
            for (int i = memoList.size() - 1; i >= 0; i--) {
                System.out.println(memoList.get(i));
            }
        } else {
            System.out.println("저장된 목록이 없습니다.");
        }

    }

    public MemoInsert selectMemo(int no) {
        try {
            return memoList.get(no - 1);
        } catch (Exception e) {
            return null;
        }
    }

    public void deleteMemo(int no) {
        memoList.remove(no - 1);
        reNumber();
    }

}
