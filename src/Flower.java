import javax.xml.namespace.QName;

public class Flower {
    public int getLife;
    private String name;
    private String flowerColor;
    private String country;
    private float cost;
    int lifeSpan;

    Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        setFlowerColor(flowerColor);
        setName(name);
        setCost((float) cost);
        setCountry(country);
        setLifeSpan(lifeSpan);
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = ValidationUtils.validOrDefault(flowerColor," белый ");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = ValidationUtils.validOrDefault(country, " Россия ");
    }

    public double getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost >= 0 ? (float) cost : 1.00f;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = ValidationUtils.validOrDefault(name, "информация не указана");
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan>0 ? lifeSpan:3;
    }

    @Override
    public String toString() {
        return " Наименование: " + name + ", цвет: " + flowerColor + ", страна происхождения " + country + ", стоимость " + cost + ", срок стояния " + lifeSpan + " дней ";
    }
    
    
}
