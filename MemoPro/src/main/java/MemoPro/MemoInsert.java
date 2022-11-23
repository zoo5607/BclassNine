package MemoPro;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MemoInsert {
    public static int count;
    private int no;           // 글번호,자동증가
    private String name;     // 이름
    private String password; // 비밀번호
    private String memo;     //메모
    private Date writeDate;  // 작성일, 자동입력

    // (글번호), (이름){(비밀번호)} 님이 (작성일)에 남긴글(메모)
    public MemoInsert() {
    }

    public MemoInsert(String name, String password, String memo) {
        super();
        no = ++count;
        this.name = name;
        this.password = password;
        this.memo = memo;
        writeDate = new Date();
    }

    public MemoInsert(int no, String name, String password, String memo, String writeDate) {
        this.no = no;
        this.name = name;
        this.password = password;
        this.memo = memo;
        int year = Integer.parseInt(writeDate.substring(1, 5)) - 1900;
        int month = Integer.parseInt(writeDate.substring(6, 8)) - 1;
        int day = Integer.parseInt(writeDate.substring(9, 11));
        int hour = Integer.parseInt(writeDate.substring(12, 14));
        int minute = Integer.parseInt(writeDate.substring(15, 17));
        int second = Integer.parseInt(writeDate.substring(18));
        this.writeDate = new Date(year, month, day, hour, minute, second);
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pw) {
        this.password = password;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date date_created) {
        this.writeDate = date_created;
    }

    @Override
    public String toString() {
        Date date = new Date();    // 오늘 날짜
        SimpleDateFormat sdf = null;
        if (date.getDate() == writeDate.getYear() && date.getMonth() == writeDate.getMonth() && date.getDate() == writeDate.getDate()) {
            sdf = new SimpleDateFormat("HH:ss");
        } else {
            sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
        }
        return no + "," + name + "{" + password + "} 님이 " + sdf.format(writeDate) + "에 남긴글" + memo;
//      return String.format("&d &s[&s]님이 &s에 남긴글
    }
}