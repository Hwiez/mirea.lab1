package pract_4;

public enum Season {
    WINTER(-5, "Холодное время года"),
    SPRING(10, "Холодное время года"),
    SUMMER(25, "Теплое время года") {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(8, "Холодное время года");

    private final double averageTemp;
    private final String description;

    Season(double averageTemp, String description) {
        this.averageTemp = averageTemp;
        this.description = description;
    }

    public double getAverageTemp() {
        return averageTemp;
    }

    public String getDescription() {
        return description;
    }

    public static void printFavoriteSeason(Season season) {
        switch (season) {
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static void main(String[] args) {
        // 1) Любимое время года
        Season favorite = Season.SUMMER;
        System.out.println("Любимое время года: " + favorite);
        System.out.println("Средняя температура: " + favorite.getAverageTemp());
        System.out.println("Описание: " + favorite.getDescription());

        // 2) Использование switch
        printFavoriteSeason(favorite);

        // 6) Печать всех времен года
        System.out.println("\nВсе времена года:");
        for (Season season : Season.values()) {
            System.out.println(season +
                    " | Средняя температура: " + season.getAverageTemp() +
                    " | " + season.getDescription());
        }
    }
}