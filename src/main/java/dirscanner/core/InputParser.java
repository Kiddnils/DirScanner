/*
 * COPYRIGHT:
 *
 * TITLE TO THE CODE REMAIN WITH ZEB/INFORMATION.TECHNOLOGY. THE CODE IS COPYRIGHTED AND PROTECTED BY LAW. YOU WILL NOT
 * REMOVE ANY COPYRIGHT NOTICE FROM THE CODE. REASSEMBLING, RECOMPILATION, TRANSFER, DISTRIBUTION OR MODIFICATION OF
 * PART OR ALL OF THE CODE IN ANY FORM WITHOUT THE PRIOR WRITTEN PERMISSION OF ZEB/INFORMATION.TECHNOLOGY IS PROHIBITED.
 *
 * created: 18.04.2017 - 15:58:22
 */
package dirscanner.core;


import java.io.File;


/**
 * @author nueter
 *
 */
public class InputParser {

    File   in;
    String fileType;

    /**
     * @param args
     */
    public void parse( final String[] args ) {
        // TODO Auto-generated method stub

    }

    /**
     * @return the in
     */
    public File getIn() {
        return this.in;
    }

    /**
     * @param in the in to set
     */
    public void setIn( final File in ) {
        this.in = in;
    }

    /**
     * @return the fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @param fileType the fileType to set
     */
    public void setFileType( final String fileType ) {
        this.fileType = fileType;
    }

}
