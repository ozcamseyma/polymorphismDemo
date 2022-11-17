public class CustomerManager {

    private BaseLogger logger; // BaseLogger türünde private bir nesne oluşturduk. - Tamamen temel nesne ile çalışmış oluyoruz.

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    } // Bu class newlediğimizde çalışıcak. --- Constructor

    // CustomerManager ı newlediğimizde bize BaseLogger ı vericek.

    public void add(){

        System.out.println("Müşteri eklendi.");
        this.logger.log("log mesajı");

    }




}
