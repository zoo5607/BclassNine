package MemoPro;

public class MemoInsert {
    private String Name;
    private String Pw;
    private String Memo;

    public MemoInsert(String name, String pw, String memo) {
        Name = name;
        Pw = pw;
        Memo = memo;
    }

    public String getName() {
        return Name;
    }

    public String getPw() {
        return Pw;
    }

    public String getMemo() {
        return Memo;
    }

    public void setName(String name){
        Name = name;
    }

    public void setPw(String pw){
        Pw = pw;
    }

    public void setMemo(String memo){
        Memo = memo;
    }

    public String toString() {
        return "NAME : " + Name + " PW : " + Pw + " MEMO : " + Memo;
    }
}
