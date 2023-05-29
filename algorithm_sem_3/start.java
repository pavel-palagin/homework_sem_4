public class start {
    public static void main(String[] args) {
        Seminar_3 seminar_3 = new Seminar_3();
        seminar_3.add("java1");
        seminar_3.add("java2");
        seminar_3.add("java3");
        seminar_3.add("java4");
        seminar_3.add("java5");
        //System.out.println(seminar_3.size());

        for (int i = 0; i < seminar_3.size(); i++) {
            System.out.println(seminar_3.getNode(i));
        }

        System.out.println("_____________________________");

        seminar_3.revert();

        for (int i = 0; i < seminar_3.size(); i++) {
            System.out.println(seminar_3.getNode(i));
        }


//        seminar_3.remove();
//
//        System.out.println(seminar_3.size());

//        System.out.println(seminar_3.getNode(seminar_3.size() - 3));
//
//        System.out.println(seminar_3.revert());



//        Seminar_3_LinList seminar_3_linList = new Seminar_3_LinList();
//        seminar_3_linList.addFirst("java12");
//        seminar_3_linList.addFirst("java22");
//        seminar_3_linList.addFirst("java32");
//        for (int i = 0; i < seminar_3_linList.size(); i++) {
//            System.out.println(seminar_3_linList.getNode(i));
//
//        }
//
//        seminar_3_linList.revert();





    }


}
