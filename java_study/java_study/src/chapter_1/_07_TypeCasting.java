package chapter_1;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 정수->실수
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float)score); //93.0
        System.out.println((double)score); // 93.0

        // 실수->정수
        float score_f = 93.3F;
        double score_d = 98.3646446;
        System.out.println((int)score_f); // 93
        System.out.println((int)score_d); // 98

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString((93));
    }
}
