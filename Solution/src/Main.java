public class Main {

    public static void main(String[] args){
        BSTSearchPreOrder bstSearchPreOrder = new BSTSearchPreOrder();
        int[] out = new int[]{8,5,1,7,10,12};
        System.out.println(bstSearchPreOrder.bstFromPreorder(out));
    }
}
