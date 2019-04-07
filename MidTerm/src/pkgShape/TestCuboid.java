package pkgShape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestCuboid {
	@Test
	public void testConstruction() {
		new Cuboid(3, 2, 6);
	}

	@Test
	public void testGetterSetter() {
		int width = 2;
		int length = 3;
		int depth = 6;
		Cuboid r = new Cuboid(width, length,depth);
		Assert.assertEquals(width, r.getiWidth());
		Assert.assertEquals(length, r.getiLength());
		Assert.assertEquals(depth, r.getiDepth());

		r.setiWidth(21);
		r.setiLength(31);
		r.setiDepth(36);
		Assert.assertEquals(21, r.getiWidth());
		Assert.assertEquals(31, r.getiLength());
		Assert.assertEquals(36, r.getiDepth());
	}

	@Test
	public void testArea() {
		Cuboid r = new Cuboid(2, 3, 4);
		Assert.assertEquals(52, r.area(), 0.0001);
	}

	@Test
	public void testVolume() {
		Cuboid r = new Cuboid(2, 3, 4);
		Assert.assertEquals(24, r.volume(), 0.0001);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testPerimeter() {
		Cuboid r = new Cuboid(2, 3, 4);
		r.perimeter();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testIllegalArgumentException() {
		new Cuboid(2, 3,-5);
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
	
	@Test
	public void testSortByVolume() {
		List<Cuboid> cuboidList = new ArrayList<Cuboid>();
		cuboidList.add(new Cuboid(3, 3, 7));
		cuboidList.add(new Cuboid(5, 5, 2));
		cuboidList.add(new Cuboid(4, 4, 4));
		
		Collections.sort(cuboidList, new SortByVolume());
		
		Assert.assertEquals(5,cuboidList.get(0).getiWidth());
		Assert.assertEquals(3,cuboidList.get(1).getiWidth());
		Assert.assertEquals(4,cuboidList.get(2).getiWidth());
	}
}
