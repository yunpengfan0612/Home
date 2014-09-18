public class House {
    private String homeowner;
    private int bedrooms;
    private double bathrooms;
    private boolean garage;

    public House(String homeowner, int bedrooms,
            double bathrooms, boolean garage) {
                if (homeowner == null || homeowner.equals("")) {
                    this.homeowner = "HOMEOWNER";
                }
                else {
                    this.homeowner = homeowner;
                }

                this.bedrooms = bedrooms;
                this.bathrooms = bathrooms;
                this.garage = garage;
            }
    public String getOwner() {
        return homeowner;
    }
    public void setOwner(String owner) {
        homeowner = owner;
    }
    public void buildBedroom() {
        bedrooms++;
    }
    public String toString() {
        return "House owned by " + homeowner + ", "
                + bedrooms + " bed/" + bathrooms + " bath, garage: "
                + garage + ", total houses: ";
    }

    public static void main(String[] args) {
        House a = new House("Samantha", 3, 1.5, true);
        System.out.println(a.toString());
    }
}
