public class Dog {
    private String breed;
    private char gender; 
    private String color; 

    public Dog(char gender, String color) {
        this.breed = "Golden Retriever"; 
        setGender(gender);
        setColor(color);  
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public void setGender(char gender) {
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        } else {
            this.gender = 'm';
        }
    }

    public void setColor(String color) {
        if (color.equalsIgnoreCase("gold") || color.equalsIgnoreCase("brown")) {
            this.color = color.toLowerCase();
        } else {
            this.color = "gold";
        }
    }

    public void bark(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Woof");
        }
    }

    @Override
    public String toString() {
        String genderStr = (gender == 'm') ? "male" : "female";
        return "My " + genderStr + ", " + color + " " + breed;
    }
}