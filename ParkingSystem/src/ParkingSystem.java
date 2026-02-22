class ParkingSystem {
    private int big, medium, small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1 -> {if (big == 0) return false; else {big--; return true;}}
            case 2 -> {if (medium == 0) return false; else {medium--; return true;}}
            case 3 -> {if (small == 0) return false; else {small--; return true;}}
            default -> {return false;}
        }
    }
}