class Phone{

    private String name;
    private int price;

    public Phone(String name, int price){
        this.name=name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String val) {
        this.name=val;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int val) {
        this.price=val;
    }
}
