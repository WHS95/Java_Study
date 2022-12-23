package chatper_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "나도코딩";
        int hour = 15;//정수형
        System.out.println( name + "님 배송이 시작됩니다. "+ hour +"시에 방문예정입니다.");//나도코딩님 배송이 시작됩니다. 15시에 방문예정입니다.
        System.out.println( name +"님 배송이 완료되었습니다.");//나도코딩님 배송이 완료되었습니다.

        double score = 90.5;
        Character grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균점수는 "+ score +"점입니다.");//강백호님의 평균점수는 90.5점입니다.
        System.out.println(name + "님의 학점은 "+ grade +"입니다.");//강백호님의 학점은 A 입니다.

        boolean pass =true;
        System.out.println("이번시험에 합격했을 까?? "+ pass );//이번시험에 합격했을 까요?? true

        double d =3.14;
        float f = 3.14F;//float은 정확한 값을 하지 못하기에 이를 해결하기 위해 끝에 F를 넣어준다.
        System.out.println(d);//3.14
        System.out.println(f);//3.14

        //아래 결과를 통해 더 정확한 값을 다루고싶을때는 double을 사용하자라는 것을 알수있게되었음
        double e =3.14123456789;
        float r = 3.14123456789F;
        System.out.println(e);//3.14123456789
        System.out.println(r);//3.1412346


        //int q = 1000000000000000;//Integer number too large
        long w = 1000000000000L;//21억을 초과하는 숫자를 다룰경우은 long을 사용하자
        w =1_000_000_000_000L;
        System.out.println(w);//1000000000000

        //자료 와 데이터 크기에 맞는 자료형을 사용하자
        }
}
