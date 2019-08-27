package effective.java;

public class Sample {

//	public static interface X {
//		void foo();
//		default void bar() {
//			System.out.println("bar");
//		}
//	}
//
//	public static interface Y {
//		void bar();
//	}
//
//	public static class Z implements X, Y {
//
//		@Override
//		public void foo() {
//			System.out.println("z foo");
//		}
//
//		@Override
//		public void bar() {
//			System.out.println("z bar");
//		}
//	}

	public static void main(String[] args) {
//		List.of(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10)
//		new Z().bar();
//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("value", "value");
//		Connection con = DriverManager.getConnection("", "", "");

//		Runnable runnable1 = () -> {
//			System.out.println("go1");
//		};
//		runnable1.run();
//
//		Runnable runnable2 = new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("go2");
//			}
//		};
//		runnable2.run();

//		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
//		BigInteger bInteger = BigInteger.valueOf(10000L);
//
//		int i = 0;
//		int result = 0;
//		while ((result = -1 << i) != 0) {
//			if (i < 10) {
//				System.out.println(result);
//			}
//			i++;
//		}
//		System.out.println(i);

		double i = 123456789101234567890123456.0;
		double up = Math.nextUp(i);
		System.out.println(up);
		while (i == i + 1) {

		}
	}
}
