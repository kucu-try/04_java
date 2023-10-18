package section05.typecasting;

public class Application04 {
    public static void main(String[] args) {

        int inum =290;
        byte bnum = (byte) inum;
        System.out.println("inum: " + inum);
        System.out.println("bnum: " + bnum); //버튼 앞부분의 손질로 인해 예측이 어렵다

        double height = 178.5;
        int floorheight = (int) height;
        System.out.println("height: " +height);
        System.out.println("floorheight: " +floorheight);


        double stu1= 178.5;
        double stu2= 170.3;
        double stu3= 190.7;
        double stu4=188.678;
        double stu5=160.8;
        int sum=(int)((stu1+stu2+stu3+stu4+stu5)/5);

        System.out.println("1반 학생 5명의 키 평균은" +sum +"cm 이다.");

        System.out.println("---------------------");
        char z1 = 'z';
        int z2 = z1;
        System.out.println(z2);
        System.out.println("--------------------");
        int p1 = 150400;
        int p2 = 1400;
        int p3 = 25000;
        int p4 = 30000;
        int sum1=p1+p2+p3+p4;
        final double BUGA ;
        BUGA = 0.1;

        System.out.println((int)(sum1-(sum1*BUGA)));

    }
}
