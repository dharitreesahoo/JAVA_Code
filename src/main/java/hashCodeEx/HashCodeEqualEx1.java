package hashCodeEx;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
class Car{
	String name;
	String model;
	String color;
	public Car(String name, String model, String color) {
		super();
		this.name = name;
		this.model = model;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
}

public class HashCodeEqualEx1 {
@Test
public void primitiveShouldequal()
{
	int i=4;
	int j=4;
	assertTrue(i==j);
}
@Test
public void stringShouldequal()
{
	String s1= "Hello";
	String s2= "Hello";
	assertTrue(s1.equals(s2));
}
@Test
public void objectShouldequal()
{
	Car car1  = new Car("Swift","VXI","white");
	Car car2  = new Car("Swift","VXI","white");
	assertTrue(car1.equals(car2));
}




}
