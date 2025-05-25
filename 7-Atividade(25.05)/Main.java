public class Main {

    public static void main(String[] args) {
        // Veículo a ser armazenado
        Vehicle vehicle = new Vehicle("123", "Volvo FH", 2020);

        // Sistema legado
        OldVehicleStorage oldStorage = new OldVehicleStorage();

        // Adapter que permite usar o legado como se fosse o novo
        IVehicleStorage adapter = new VehicleStorageAdapter(oldStorage);

        // Armazenando dados via adapter
        adapter.saveVehicleData(vehicle);
    }
}   