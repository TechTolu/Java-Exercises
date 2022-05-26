package chapterFour;


public class GasMileage {
        private int miles;
        private int gallons;

        public GasMileage(int gallons, int miles) {
            this.miles = miles;
            this.gallons = gallons;
        }

        public void setMiles(int miles) {
            this.miles = miles;
        }

        public int getMiles() {
            return miles;
        }

        public void setGallons(int gallons) {
            this.gallons = gallons;
        }

        public int getGallons() {
            return gallons;
        }

        public int milesPerGallon(int miles, int gallons) {
            this.miles = miles;
            this.gallons = gallons;
            return miles / gallons;
        }
}
