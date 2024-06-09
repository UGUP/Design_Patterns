public class A4120RuledNoteBook extends Notebook implements Prototype<Notebook> {


    private String hardBound;

    public A4120RuledNoteBook(){

    }
    public A4120RuledNoteBook(A4120RuledNoteBook instance){
        super(instance);
        this.hardBound=instance.hardBound;
    }

    @Override
    public A4120RuledNoteBook clone(){
        return new A4120RuledNoteBook(this);
    }



    public String getHardBound() {
        return hardBound;
    }

    public void setHardBound(String hardBound) {
        this.hardBound = hardBound;
    }

}
