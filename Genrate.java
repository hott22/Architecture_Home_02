package home2;

import java.util.Random;

public class Genrate {

    public Employee generateEmployee() {
        String[] names = new String[]{"��������", "����", "����", "������", "������", "�������",
                "����", "���������", "�����", "������"};
        String[] surnames = new String[]{"���������", "�����", "��������", "������", "�����",
                "�������", "�������", "��������", "������", "�������"};
        Random random = new Random();
        boolean number = random.nextBoolean();
        if(number){
            return new Worker(names[random.nextInt(names.length)],
                    surnames[random.nextInt(surnames.length)],
                    random.nextInt((50000 - 40000) + 1) + 40000);
        }
        else {
            return new Freelancer(names[random.nextInt(names.length)],
                    surnames[random.nextInt(surnames.length)],
                    random.nextInt((1000 - 500) + 1) + 500);
        }
    }
}
