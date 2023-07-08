package nested_classes.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math=new Math();
        math.getResult(21,4);
    }
}


class Math{

    public void getResult(final int delimoe,final int delitel){
        class Delenie{
//            private int delitel;
//            private int delimoe;
//
//            public void setDelitel(int delitel) {
//                this.delitel = delitel;
//            }
//
//            public void setDelimoe(int delimoe) {
//                this.delimoe = delimoe;
//            }
//
//            public int getDelitel() {
//                return delitel;
//            }
//
//            public int getDelimoe() {
//                return delimoe;
//            }
            public int getChastnoe(){
                return delimoe/delitel;
            }
            public int getOstatok(){
                return delimoe%delitel;
            }
        }

        Delenie delenie=new Delenie();
//        delenie.setDelimoe(21);
//        delenie.setDelitel(4);

//        System.out.println("Delimoe="+delenie.getDelimoe());
//        System.out.println("Delitel="+delenie.getDelitel());
        System.out.println("Chastoe="+delenie.getChastnoe());
        System.out.println("Ostatok="+delenie.getOstatok());
    }
}