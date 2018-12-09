package binarysearchtree;
/**
 * @author SamJay
 */
public class NonEmptyBST<D extends Comparable> implements Tree<D> {
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

    @Override
    public boolean member(D elt) {
        return false;
    }

    @Override
    public NonEmptyBST<D> add() {
        return null;
    }
}
