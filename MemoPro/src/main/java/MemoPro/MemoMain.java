package Memopro;

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
        private void Delete() {
            sc.nextLine();
            String pw = getStrInput("ISERT PW :");

            for(int i = 0; i<memousers.size(); i++ ){
                if(pw.equals(memousers.get(i).getPw())){
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

