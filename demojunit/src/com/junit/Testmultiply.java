package com.junit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Testmultiply {

	@Test
	public void test() {
		Add m=new Add(2,3,4);
		Assert.assertEquals(24,m.multiply());
		}
	}

