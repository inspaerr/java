public enum Prof {
    LOADER(100), CASHIER(150), CONSULTANT (200), MANAGER (250);
    private int salary;
    Prof(int s){
        salary = s;
    }

    public int getSalary() {
        return salary;
    }
}
