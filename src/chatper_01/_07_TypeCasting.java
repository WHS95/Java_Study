package chatper_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환  TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로


        //int to float, double
        int score = 93;
        System.out.println(score);//93
        System.out.println((float) score);//93.0
        System.out.println((double)score);//93.0

        //float, double to int
        //자바에서 실수형은 디폴트가 double이므로 위의 예에서 보듯이 float 변수에 값을 대입할 때에는
        //3.14F 와 같이 F접미사(또는 소문자 f)를 꼭 붙여 주어야 한다.
        float score_f=93.3F;
        double score_d= 98.8;
        System.out.println((int)score_d);//98
        System.out.println((int)score_f);//93'

        score = 93 + (int)98.8;//93 + 98
        System.out.println(score);// 191

        score_d = (double)93 + 98.8;//93.0 + 98.8
        System.out.println(score_d);

        //변수에 형 변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        //int -> long -> float -> double (자동 형 변환)

        int convertScoreInt = (int) score_d; // 191.8 -> 191
        //double -> float -> long ->int(수동 형 변환)
    }
}
