public class FamliyAccount {
    public static void main(String[] args) {
        int balance = 1000;//生活的起始基金
        String details ="收支\t账户金额\t收支金额\t说明\n";
        boolean LoopFlag = true;
        do {
            System.out.println("\n--------------家庭收支记账软件--------------");
            System.out.println("                1 收支明细");
            System.out.println("                2 登记收入");
            System.out.println("                3 登记支出");
            System.out.println("                4 退出");
            System.out.println();
            System.out.println("               请选择(1-4) ");

            char key = Utility.readMenuSelection();
            System.out.println();
            switch (key) {
                case '1' -> {
                    //收入明细
                    System.out.println("--------------当前收支明细记录--------------");
                    System.out.println(details);
                    System.out.println("----------------------------");
                }
                case '2' -> {
                    System.out.println("请输入收入金额；");
                    int amount1 = Utility.readNumber();
                    System.out.println("请输入收入说明");
                    String desc1 = Utility.readString();
                    balance += amount1;
                    details += "收入" + "\t" + balance + "\t\t" +
                            amount1 + "\t\t" + desc1 + "\n";
                    System.out.println("----------登记完成----------");
                }
                case '3' -> {
                    //登记支出
                    System.out.println("请输入支出金额；");
                    int amount2 = Utility.readNumber();
                    System.out.println("请输入支出明细；");
                    String desc2 = Utility.readString();
                    balance -= amount2;
                    details += "支出" + "\t" + balance + "\t\t" +
                            amount2 + "\t\t" + desc2 + "\n";
                    System.out.println("----------登记完成----------");
                }
                case '4' -> {
                    //退出
                    System.out.println("确认是否退出(Y/N):");
                    char yn = Utility.readMenuSelection();
                    if (yn == 'Y') {
                        LoopFlag = false;
                    }
                }
            }
        } while (LoopFlag);
    }
}

