/*
 * COPYRIGHT:
 *
 * TITLE TO THE CODE REMAIN WITH ZEB/INFORMATION.TECHNOLOGY. THE CODE IS COPYRIGHTED AND PROTECTED BY LAW. YOU WILL NOT
 * REMOVE ANY COPYRIGHT NOTICE FROM THE CODE. REASSEMBLING, RECOMPILATION, TRANSFER, DISTRIBUTION OR MODIFICATION OF
 * PART OR ALL OF THE CODE IN ANY FORM WITHOUT THE PRIOR WRITTEN PERMISSION OF ZEB/INFORMATION.TECHNOLOGY IS PROHIBITED.
 *
 * created: 18.04.2017 - 15:57:38
 */
package dirscanner.core;


import java.io.File;
import java.util.LinkedList;
import java.util.List;


/**
 * @author nueter
 *
 */
public class DirScanner {

    /**
     * @param inputParser
     */
    public void scan( final InputParser inputParser ) {
        List<File> foundFiles = new LinkedList<>();

        // foundFiles = scanDir( inputParser.getIn() );
        foundFiles = scanDir( new File( "C:\\" ) ); //$NON-NLS-1$

        System.out.println( "Files found: " + foundFiles.size() ); //$NON-NLS-1$
    }

    private List<File> scanDir( final File dir ) {
        File[] foundFilesAndDirectories = dir.listFiles();
        List<File> allFiles = new LinkedList<>();

        if ( ( foundFilesAndDirectories != null ) && ( ( foundFilesAndDirectories.length ) > 0 ) ) {
            for ( int i = 0; i < foundFilesAndDirectories.length; i++ ) {
                if ( foundFilesAndDirectories[i].isDirectory() ) {
                    allFiles.addAll( scanDir( foundFilesAndDirectories[i] ) );
                } else {
                    allFiles.add( foundFilesAndDirectories[i] );
                }
            }
        }
        return allFiles;
    }

}
