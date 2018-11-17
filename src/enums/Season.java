package enums;

public enum Season {
    WINTER(1.3, 90) {
        void resort() {
        super.resort();
            System.out.println("Ski");
        }
    },
    SPRING(14.2, 92),
    SUMMER(24.6, 92){
        void resort() {
            super.resort();
            System.out.println("Swim");
        }},
    AUTUMN(12.9, 91);

    double temperature;
    int days;

    Season(double temperature, int days) {
        this.temperature = temperature;
        this.days = days;
    }

    void resort() {
        System.out.println("Walk");
    }

}

//Enumeration

//enums не можуть мати нащадків, але перевизначати методи можна