package dirscanner.core;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Util {

	public static LocalDateTime longToLocalDate(long date) {
		return Instant.ofEpochMilli(date).atZone(ZoneId.systemDefault()).toLocalDateTime();
	}
}
