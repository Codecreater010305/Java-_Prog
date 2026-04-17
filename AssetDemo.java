abstract class Asset {
    String descriptor;
    String date;
    double currentValue;

    Asset(String descriptor, String date, double currentValue) {
        this.descriptor = descriptor;
        this.date = date;
        this.currentValue = currentValue;
    }

    abstract void displayDetails();
}

class Stock extends Asset {
    int numShares;
    double sharePrice;
    double asset;

    Stock(String desc, String date, double curVal, int numShares, double sharePrice) {
        super(desc, date, curVal);
        this.numShares = numShares;
        this.sharePrice = sharePrice;
        this.asset = numShares * sharePrice;
    }

    public void displayDetails() {
        System.out.println("=== STOCK ===");
        System.out.println("Descriptor: " + descriptor + " | Date: " + date +
            " | Current Value: $" + currentValue);
        System.out.println("Shares: " + numShares + " | Share Price: $" +
            sharePrice + " | Asset: $" + asset);
    }
}

class Bond extends Asset {
    double interestRate;
    double asset;

    Bond(String desc, String date, double curVal, double interestRate) {
        super(desc, date, curVal);
        this.interestRate = interestRate;
        this.asset = curVal + (curVal * interestRate / 100);
    }

    public void displayDetails() {
        System.out.println("=== BOND ===");
        System.out.println("Descriptor: " + descriptor + " | Date: " + date +
            " | Current Value: $" + currentValue);
        System.out.println("Interest Rate: " + interestRate + "% | Asset: $" + asset);
    }
}

class Savings extends Asset {
    double interestRate;
    double asset;

    Savings(String desc, String date, double curVal, double interestRate) {
        super(desc, date, curVal);
        this.interestRate = interestRate;
        this.asset = curVal + (curVal * interestRate / 100);
    }

    public void displayDetails() {
        System.out.println("=== SAVINGS ===");
        System.out.println("Descriptor: " + descriptor + " | Date: " + date +
            " | Current Value: $" + currentValue);
        System.out.println("Interest Rate: " + interestRate + "% | Asset: $" + asset);
    }
}

public class AssetDemo {
    public static void main(String[] args) {
        Asset[] assets = {
            new Stock("Tech Stock", "2024-01-01", 10000, 100, 150.5),
            new Bond("Gov Bond", "2024-01-01", 5000, 6.5),
            new Savings("Savings Acc", "2024-01-01", 8000, 4.0)
        };

        for (Asset a : assets) {
            a.displayDetails();
            System.out.println();
        }
    }
}
