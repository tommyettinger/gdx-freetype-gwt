
package java.nio;

import com.google.gwt.typedarrays.shared.ArrayBuffer;

public class FreeTypeUtil {

	public static DirectReadWriteByteBuffer newDirectReadWriteByteBuffer (ArrayBuffer backingArray) {
		return new DirectReadWriteByteBuffer(backingArray);
	}

	public static DirectReadWriteByteBuffer newDirectReadWriteByteBuffer (ArrayBuffer backingArray, int capacity,
		int arrayOffset) {
		return new DirectReadWriteByteBuffer(backingArray, capacity, arrayOffset);
	}
}
