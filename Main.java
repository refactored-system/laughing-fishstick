public class Main {
    public static void main(String[] args) {
        // Creating a Singer object using the no-argument constructor
        Singers singer1 = new Singers();

        // Displaying the default values
        System.out.println("Default values of Singer1:");
        singer1.displaySingerInfo();

        // Setting the values of instance variables using setters
        singer1.setSingerId(101);
        singer1.setSingerName("John Doe");
        singer1.setSingerAddress("123 Main St, New York, NY");
        singer1.setDateOfBirth("01-01-1990");
        singer1.setNumOfAlbumsPublished(5);

        // Displaying the values after setting
        System.out.println("\nValues after setting instance variables:");
        singer1.displaySingerInfo();
    }
}

class Singers {
    // Instance variables
    private int singerId;
    private String singerName;
    private String singerAddress;
    private String dateOfBirth;
    private int numOfAlbumsPublished;

    // No-argument constructor
    public Singers() {
        this.singerId = 0;
        this.singerName = "Unknown";
        this.singerAddress = "Unknown";
        this.dateOfBirth = "Unknown";
        this.numOfAlbumsPublished = 0;
    }

    // Constructor with 1 argument
    public Singers(int singerId) {
        this.singerId = singerId;
        this.singerName = "Unknown";
        this.singerAddress = "Unknown";
        this.dateOfBirth = "Unknown";
        this.numOfAlbumsPublished = 0;
    }

    // Constructor with 2 arguments
    public Singers(int singerId, String singerName) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = "Unknown";
        this.dateOfBirth = "Unknown";
        this.numOfAlbumsPublished = 0;
    }

    // Constructor with 3 arguments
    public Singers(int singerId, String singerName, String singerAddress) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = "Unknown";
        this.numOfAlbumsPublished = 0;
    }

    // Constructor with 4 arguments
    public Singers(int singerId, String singerName, String singerAddress, String dateOfBirth) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numOfAlbumsPublished = 0;
    }

    // Constructor with 5 arguments
    public Singers(int singerId, String singerName, String singerAddress, String dateOfBirth,
            int numOfAlbumsPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numOfAlbumsPublished = numOfAlbumsPublished;
    }

    // Getters
    public int getSingerId() {
        return singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getSingerAddress() {
        return singerAddress;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumOfAlbumsPublished() {
        return numOfAlbumsPublished;
    }

    // Setters
    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public void setSingerAddress(String singerAddress) {
        this.singerAddress = singerAddress;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setNumOfAlbumsPublished(int numOfAlbumsPublished) {
        this.numOfAlbumsPublished = numOfAlbumsPublished;
    }

    // Setter for all variables at once
    public void setAll(int singerId, String singerName, String singerAddress, String dateOfBirth,
            int numOfAlbumsPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numOfAlbumsPublished = numOfAlbumsPublished;
    }

    // Display method
    public void displaySingerInfo() {
        System.out.println("Singer ID: " + singerId);
        System.out.println("Singer Name: " + singerName);
        System.out.println("Singer Address: " + singerAddress);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Number of Albums Published: " + numOfAlbumsPublished);
    }
}
