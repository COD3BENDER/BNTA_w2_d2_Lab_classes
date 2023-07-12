public class Computer {

    private int storage;
    private String printer;
    public Computer(int storage){
        this.storage = storage;

    }

    public int getStorage() {
        return storage;
    }
    public void addStorage(int storage){
        this.storage += storage;
    }

    public void setPrinter(String printer) {
        this.printer = printer;
    }

    public String getPrinter() {
        return printer;
    }

    public void printMessage(String message){
        if (!this.printer.equals("")){
            System.out.println(message);
        }
    }
}
