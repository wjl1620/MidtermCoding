package pkgShape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

class SortByArea implements Comparator<Cuboid>{
	public SortByArea() {

	}

	public int compare(Cuboid c1, Cuboid c2) {
		return Double.compare(c1.area(), c2.area());
	}
}

class SortByVolume implements Comparator<Cuboid> {
	public SortByVolume() {

	}

	public int compare(Cuboid c1, Cuboid c2) {
		return Double.compare(c1.volume(), c2.volume());
	}
}

public class Cuboid extends Rectangle {
	private int iDepth;

	@Override
	public String toString() {
		return "" + this.getiWidth();
	}
	
	public Cuboid(int width, int length, int depth) {
		super(width, length);
		if (depth <= 0) {
			throw new IllegalArgumentException();
		}
		this.setiDepth(depth);
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}

	public double volume() {
		return this.getiDepth() * this.getiLength() * this.getiWidth();
	}

	public double area() {
		return 2 * (this.getiDepth() * this.getiLength() + this.getiDepth() * this.getiWidth()
				+ this.getiLength() * this.getiWidth());
	}

	public double perimeter() {
		boolean notSupport = true;
		if (notSupport) {
			throw new UnsupportedOperationException();
		}
		return 0;
	}

	public int compareTo(Object o2) {
		return 1;
	}

	
	@Test
	public void testSortByArea() {
		List<Cuboid> cuboidList = new ArrayList<Cuboid>();
		cuboidList.add(new Cuboid(3, 3, 7));
		cuboidList.add(new Cuboid(5, 5, 2));
		cuboidList.add(new Cuboid(4, 4, 4));
		
		Collections.sort(cuboidList, new SortByArea());
		
		Assert.assertEquals(5,cuboidList.get(0).getiWidth());
		Assert.assertEquals(4,cuboidList.get(1).getiWidth());
		Assert.assertEquals(3,cuboidList.get(2).getiWidth());
	}
}