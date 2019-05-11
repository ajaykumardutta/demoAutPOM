package com.tours.mercury.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utilities {

	public static boolean dropdownValueSelection(WebElement dd, String text) {
		Select selectObject = new Select(dd);
		if (dd.isDisplayed()) {
			selectObject.selectByVisibleText(text);
			return true;
		}
		return false;
	}
}
