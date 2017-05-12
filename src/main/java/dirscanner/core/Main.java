/*
 * COPYRIGHT:
 *
 * TITLE TO THE CODE REMAIN WITH ZEB/INFORMATION.TECHNOLOGY. THE CODE IS COPYRIGHTED AND PROTECTED BY LAW. YOU WILL NOT
 * REMOVE ANY COPYRIGHT NOTICE FROM THE CODE. REASSEMBLING, RECOMPILATION, TRANSFER, DISTRIBUTION OR MODIFICATION OF
 * PART OR ALL OF THE CODE IN ANY FORM WITHOUT THE PRIOR WRITTEN PERMISSION OF ZEB/INFORMATION.TECHNOLOGY IS PROHIBITED.
 *
 * created: 18.04.2017 - 15:55:36
 */
package dirscanner.core;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import dirscanner.logic.DirScanner;

public class Main {

	public static void main(final String[] args) {

		Map<String, String> parsedArgs = parseArgs(args);

		DirScanner dirScanner = new DirScanner();
		dirScanner.scan(new File(parsedArgs.get("-in")), parsedArgs.get("-fileType"));
	}

	private static Map<String, String> parseArgs(String[] args) {

		Map<String, String> agrPairs = new HashMap<String, String>();
		if (args == null || args.length <= 0) {
			System.out.println("No args given please specify -in <directory>");
		} else {
			for (int i = 0; i < args.length; i = i + 2) {

				switch (args[i]) {
				case "-in": {
					agrPairs.put(args[i], args[i + 1]);
					break;
				}
				case "-fileType": {
					if ((i + 1) >= args.length) {
						agrPairs.put(args[i], "");
					} else {
						agrPairs.put(args[i], args[i + 1]);
					}
					break;
				}
				default: {
					System.out.println("Unkown arg");
					break;
				}
				}
			}
		}

		if (agrPairs.isEmpty()) {
			return null;
		}
		return agrPairs;
	}
}
