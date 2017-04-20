package dirscanner.model;

import java.time.LocalDateTime;

import dirscanner.core.Util;

public class FileInfo {

	private String path;
	private long bytes;
	private LocalDateTime lastModifiedTime; //TODO AUsgabe in Millisekunden, DAtum oder Datum + Zeit?
	
	public FileInfo(String path, long bytes, long millis){
		
		this.path = path;
		this.bytes = bytes;
		this.lastModifiedTime = Util.longToLocalDate(millis);
	}

	@Override
	public String toString() {
		return this.path + ", " + bytes + ", " + lastModifiedTime;
	}
}
