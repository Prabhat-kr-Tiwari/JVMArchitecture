package DeepakSir.Multithreading.ThreadClassMethod.JoinMethod;
class Medical extends Thread {

    @Override
    public void run() {
        System.out.println("Medical start");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Medical End");
    }
}

class TestDriver extends Thread {

    @Override
    public void run() {
        System.out.println("Test Driver Start");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Test Drive completed");
    }
}

class OfficerSign extends Thread {

    @Override
    public void run() {
        System.out.println("Officer sign takes");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Officer sign completed");
    }
}

public class LicenseDemo {
    public static void main(String[] args) throws InterruptedException {
        Medical medical = new Medical();
        medical.start();
        medical.join();
        TestDriver testDriver = new TestDriver();
        testDriver.start();
        testDriver.join();
        OfficerSign officerSign = new OfficerSign();
        officerSign.start();

    }
}
