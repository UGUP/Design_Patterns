public class Notebook implements Prototype<Notebook>{

    int pages;
    String typeofPge;
    int price;
    String factPage;
    String coverPage;
    int length;
    int breadth;
    int weight;

    public Notebook(){

    }

    public Notebook(Notebook notebook){
        this.pages=notebook.pages;
        this.typeofPge=notebook.typeofPge;
        this.price=notebook.price;
        this.factPage=notebook.factPage;
        this.coverPage=notebook.coverPage;
        this.length=notebook.length;
        this.breadth=notebook.breadth;
        this.weight=notebook.weight;
    }

    @Override
    public Notebook clone(){
        return new Notebook(this);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String  getTypeofPge() {
        return typeofPge;
    }

    public void setTypeofPge(String typeofPge) {
        this.typeofPge = typeofPge;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCoverPage() {
        return coverPage;
    }

    public void setCoverPage(String coverPage) {
        this.coverPage = coverPage;
    }

    public String getFactPage() {
        return factPage;
    }

    public void setFactPage(String factPage) {
        this.factPage = factPage;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
