public class ProtptypeDesignMain {
    public static void main(String[] args) {

        Notebook n1= new Notebook();
        createNotebookPrototype(n1);
        Registry registry= new Registry();
        registry.register("Notebook",n1);
        Notebook notebook= registry.getInstance("Notebook").clone();
        notebook.setFactPage("Fun Facts");
        System.out.println(notebook);


        A4120RuledNoteBook n2= new A4120RuledNoteBook();
        createNotebookPrototype(n2);
        n2.setHardBound("100");

        Registry r1= new Registry();
        r1.register("A4120RuledNoteBook",n2);

        A4120RuledNoteBook book= (A4120RuledNoteBook) r1.getInstance("A4120RuledNoteBook").clone();
        System.out.println(book.getHardBound());



    }

    public static void createNotebookPrototype(Notebook notebook){
        notebook.setPages(100);
        notebook.setTypeofPge("soft");
        notebook.setPrice(50);
        notebook.setFactPage("Riddle");
        notebook.setCoverPage("Nature");
        notebook.setLength(12);
        notebook.setBreadth(10);
        notebook.setWeight(1);
    }
}
