public class MainSingleton {
    public static void main(String[] args) {

        SharedData data = SharedData.getData();
        SharedData dateAnother = SharedData.getData();

        System.out.println(data == dateAnother);

    }
}