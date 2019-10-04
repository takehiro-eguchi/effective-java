package effective.java;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.EnumSet;


public class EnumAndAnnotation {

	private static enum Style {
		BOLD, ITALIC, UNDERLINE, STRIKETHROUGH;
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)
	@Repeatable(ExceptionTestContainer.class)
	private static @interface ExceptionTest {
		Class<? extends Throwable> value();
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)
	private static @interface ExceptionTestContainer {
		ExceptionTest[] value();
	}

	public static void main(String[] args) {
		EnumSet<Style> enumSet = EnumSet.of(Style.BOLD, Style.ITALIC);
		System.out.println(enumSet);

		testAnnotation();
	}

	@ExceptionTest(NullPointerException.class)
	@ExceptionTest(IllegalArgumentException.class)
	private static void testAnnotation() {
		// TODO 自動生成されたメソッド・スタブ

		Method method = null;

	}

}
