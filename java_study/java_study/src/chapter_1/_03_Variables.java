package chapter_1;

public class _03_Variables {
    public static void main(String[] args) {
        String name; // String name = "박세훈"
        name = "박세훈";
        int hour = 15;

        System.out.println(name +"님 " + hour + "시에 배송이 시작됩니다");
        System.out.println(name + "님 배송이 완료되었습니다");

        double score = 90.5;
        char grade = 'A';

        System.out.println(name + "의 평균 점수는 " + score + " 학점은 " + grade + "입니다.");

        boolean pass = true;

        System.out.println(pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;

        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
