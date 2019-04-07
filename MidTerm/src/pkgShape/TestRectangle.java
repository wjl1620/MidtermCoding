package pkgShape;

import org.junit.Test;

import org.junit.Assert;

public class TestRectangle {
	@Test
	public void testConstruction() {
		new Rectangle(3, 2);
	}

	@Test
	public void testGetterSetter() {
		int width = 2;
		int length = 3;
		Rectangle r = new Rectangle(width, length);
		Assert.assertEquals(width, r.getiWidth());
		Assert.assertEquals(length, r.getiLength());

		r.setiWidth(21);
		r.setiLength(31);
		Assert.assertEquals(21, r.getiWidth());
		Assert.assertEquals(31, r.getiLength());
	}

	@Test
	public void testArea() {
		Rectangle r = new Rectangle(3, 2);
		Assert.assertEquals(6, r.area(), 0.0001);
	}

	@Test
	public void testPerimeter() {
		Rectangle r = new Rectangle(2, 3);
		Assert.assertEquals(10, r.perimeter(), 0.0001);
	}
	
	@Test
	public void testCompareTo() {
		Rectangle r1 = new Rectangle(3, 3);
		Rectangle r2 = new Rectangle(4, 4);
		Assert.assertTrue(r1.compareTo(r2) < 0);
		Assert.assertTrue(r2.compareTo(r1) > 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIllegalArgumentException() {
		new Rectangle(-1, 0);
	}

}
