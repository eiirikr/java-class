package Task13;

public class Task131 {

    static class Afritada {
        public void showIngredients() {
            String[] ingredients = {"Tomato Sauce", "Meat"};
            System.out.println("Afritada = " + java.util.Arrays.toString(ingredients) + " 🍲\n");
        }
    }

    static class Mechado extends Afritada {
        public void showIngredients() {
            String[] ingredients = {
                "Tomato Sauce",
                "Meat",
                "Potatoes & Carrots",
                "Tomato Paste"
            };
            System.out.println("Mechado = " + java.util.Arrays.toString(ingredients) + " 🍲\n");
        }
    }

    static class Menudo extends Mechado {
        public void showIngredients() {
            String[] ingredients = {
                "Tomato Sauce",
                "Meat",
                "Potatoes & Carrots",
                "Liver Spread",
                "Raisins",
                "Hotdog"
            };
            System.out.println("Menudo = " + java.util.Arrays.toString(ingredients) + " 🍲\n");
        }
    }

    static class Caldereta extends Menudo {
        public void showIngredients() {
            String[] ingredients = {
                "Tomato Sauce",
                "Meat",
                "Potatoes & Carrots",
                "Tomato Paste",
                "Liver Spread",
                "Raisins",
                "Hotdog",
                "Cheese"
            };
            System.out.println("Caldereta = " + java.util.Arrays.toString(ingredients) + " 🍲\n");
        }
    }

    public static void main(String[] args) {
        Afritada meal1 = new Afritada();
        Afritada meal2 = new Mechado();
        Afritada meal3 = new Menudo();
        Afritada meal4 = new Caldereta();

        meal1.showIngredients();
        meal2.showIngredients();
        meal3.showIngredients();
        meal4.showIngredients();
    }
}
