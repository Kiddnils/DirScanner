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


/**
 * @author nueter
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main( final String[] args ) {

        InputParser inputParser = new InputParser();
        inputParser.parse( args );

        DirScanner dirScanner = new DirScanner();
        dirScanner.scan( inputParser );
    }

}
