package lab4;

public enum Seasons {
    лето{
        public void getDescription(){
            System.out.println("Теплое время года");
        }
    },
    весна{
        public void getDescription(){
            System.out.println("Теплое время года");
        }
    },
    зима{
        public void getDescription(){
            System.out.println("Холодное время года");
        }
    },
    осень{
        public void getDescription(){
            System.out.println("Холодное время года");
        }
    };

    public void getDescription() {
    }
}
enum TempSeasons {
    tempSummer(27),
    tempSpring(15),
    tempWinter(-25),
    tempAutumn(5)
    ;
    private final int temp;
    TempSeasons(int temp) {
        this.temp = temp;
    }
    public int getTemp(){
        return this.temp;
    }
}

