package binarysearchtree;
/**
 * @author SamJay
 * @param <D>
 */
public class EmptyBST<D extends Comparable> implements Tree<D>{
    
    public EmptyBST(){
    }
    public boolean isEmpty(){
        return true;
    }
    public int cardinality(){
        return 0;
    }
    public boolean member(D elt){
        return false;
    }

    @Override
    public NonEmptyBST<D> add() {
        return null;
    }

    public NonEmptyBST<D> add (D elt){
        return new NonEmptyBST<D>(elt);
        
    }
    

}
