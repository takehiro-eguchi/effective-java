package effective.java;

import java.io.Closeable;
import java.io.IOException;

/** try-with-resources を検証する */
public class TryWithResource {

	/** 仮想リソース */
	private static class Resource implements Closeable {

		/** 失敗するread */
		public int read() throws IOException {
			throw new IOException("Failed to read.");
		}

		/** 失敗するclose */
		@Override
		public void close() throws IOException {
			throw new IOException("Failed to close.");
		}
	}

	public static void main(String[] args) throws IOException {
		// 一般的なtry-catch-finally
		try {
			tryCatchFinally();
		} catch (Throwable th) {
			th.printStackTrace();
		}

		// 改善したtry-catch-finally
		try {
			tryCatchFinallyImprove();
		} catch (Throwable th) {
			th.printStackTrace();
		}

		// try-with-resourceによる実行
		try {
			tryWithResource();
		} catch (Throwable th) {
			th.printStackTrace();
		}
	}

	private static void tryCatchFinally() throws IOException {
		Resource resource = null;
		try {
			resource = new Resource();
			resource.read();
		} finally {
			if (resource != null) {
				resource.close();
			}
		}

	}

	private static void tryCatchFinallyImprove() throws Exception {
		Exception eCache = null;
		Resource resource = null;
		try {
			resource = new Resource();
			resource.read();
		} catch (IOException e) {
			eCache = e;
		} finally {
			if (resource != null) {
				try {
					resource.close();
				} catch (IOException e) {
					if (eCache != null) {
						eCache.addSuppressed(e);
					} else {
						eCache = e;
					}
				}
			}
			if (eCache != null) {
				throw eCache;
			}
		}
	}

	private static void tryWithResource() throws IOException {
		try (Resource resource = new Resource()) {
			resource.read();
		} catch (IOException e) {
			throw e;
		}
	}
}
