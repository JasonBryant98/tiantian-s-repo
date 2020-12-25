package company.arrayListDemo;

import java.util.ArrayList;
import java.util.Random;

/*
如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的"包装类"
基本类型         包装类（引用类型），包装类都位于java.lang包下
byte             Byte
short            Short
int              Integer
long             Long
float            Float
double           Double
char             Character
boolean          Boolean

从JDK 1.5开始，支持自动装箱、自动拆箱
自动装箱：基本类型 --> 包装类型
自动拆箱：包装类型 --> 基本类型、

 */
public class ArrayListBasic {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(33);
        System.out.println(list.get(1));

        Random random = new Random();
       int a =  random.nextInt(33)+1;


    }
}
