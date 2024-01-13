package Oops.ThreeMantrasOfObjectTypeCasting;


class  Base1{}
class  Base2{}
class  Der1 extends Base1{}
class  Der2 extends Base1{}
class  Der3 extends Base2{}
class  Der4 extends Base2{}
public class CaseStudy {

    public static void main(String[] args) {
        Base2 b=new Der4();
        Der4 d=(Der4) b;
        //Base1 b1=(Base1)b;
        Base2 b2=(Base2) b;
        Object o=(Der3)b;
        //Base2 b3=(Base1)b;
    }
}
