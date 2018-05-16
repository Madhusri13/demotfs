package com.junit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
public class Testadd {
   @Test
	public void test() {
		Add s=new Add(2,3,4);
		Assert.assertEquals(9,s.sum());
		}
   }



