package binarysearchtree;
/**
 * @author SamJay
 */
class NonEmptyBST<D extends Comparable> implements Tree<D> {
    D data;
    Tree left;
    Tree right;
    public NonEmptyBST(D elt){
        data=elt;
       right=new EmptyBST<D>();
       left= new EmptyBST<D>();
    }
    public boolean isEmpty(){
        return false;
    }
    public int cardinality(){
        return 1+left.cardinality();
    }
}
