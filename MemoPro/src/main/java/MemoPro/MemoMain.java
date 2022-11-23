package MemoPro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MemoMain {
    Scanner sc = new Scanner(System.in);
    List<MemoInsert> memousers = new ArrayList<>();
    public void run() {

        int key = 0;
        while ((key = menu()) != 0) {
            switch (key) {
                case 1: Insert();
                    break;
                case 2: List();
                    break;
                case 3: Modify();
                    break;
                case 4: Delete();
                    break;
                }
            }
        }
        private void List() {
            Iterator<MemoInsert> ite = memousers.iterator();

            while (ite.hasNext()) {
                System.out.println(ite.next() + " ");
            }
        }
        private void Insert() {
            sc.nextLine();
            String name = getStrInput("name :");
            String pw = getStrInput("pw :");
            String memo = getStrInput("memo :");

            if(pw.equals(pw)) {
                memousers.add(new MemoInsert(name, pw, memo));
                System.out.println(name + " is good");
            }
        }
        private void Modify() {
            if (memousers.isEmpty()) {
                System.out.println("게시글이 없습니다.");
                return;
            }
            System.out.println("수정하실 이름을 입력해주세요.");
            Scanner scanner = new Scanner(System.in);

            String name = scanner.nextLine();

            for (int i =0; i<memousers.size();i++){
                if (name.equals(memousers.get(i).getName())){
                    System.out.println("비밀번호를 입력해 주세요");
                    String pw = scanner.nextLine();
                    if(pw.equals(memousers.get(i).getPassword())){
                        System.out.println("새로운 메모를 입력해 주세요");
                        String newMemo = scanner.nextLine();
                        memousers.get(i).setMemo(newMemo);
                        System.out.println("수정이 완료 되었습니다.");
                        return;
                    }else{
                        System.out.println("비밀번호가 틀립니다.");
                    }

                }
            }
            System.out.println("회원 정보가 없습니다.");
        }
        private void Delete() {
            sc.nextLine();
            int no = getNumInput("ISERT NO. :");

            for(int i = 0; i<memousers.size(); i++ ){
                if(no == memousers.get(i).getNo()){
                    memousers.remove(i);
                    System.out.println("DELETE!!");
                } else {
                    System.out.println("THE PASSWORD IS NOT CORRECT");
                }
            }
        }

    private String getStrInput(String s) {
        System.out.println(s);
        return sc.nextLine();
    }

    private int menu() {
            System.out.println("====================Mmeo Prject=================");
            return getNumInput("[1]INSERT [2]LIST [3]MODIFY [4]DELELT [0]EXIT ");
    }
    private int getNumInput(String s) {
        System.out.println(s);
        return sc.nextInt();
    }

}

