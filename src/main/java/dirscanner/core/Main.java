package dirscanner.core;


import java.io.File;
import java.util.HashMap;
import java.util.Map;

import dirscanner.logic.DirScanner;


public class Main {

    public static void main( final String[] args ) {

        Map<String, String> parsedArgs = parseArgs( args );

        if ( parsedArgs.get( "-in" ) == null ) {
            System.out.println( "No input parameter given" );
            return;
        }
        DirScanner dirScanner = new DirScanner();
        dirScanner.scan( new File( parsedArgs.get( "-in" ) ), parsedArgs.get( "-fileType" ) );
    }

    private static Map<String, String> parseArgs( final String[] args ) {

        Map<String, String> argPairs = new HashMap<>();
        if ( ( args == null ) || ( args.length <= 0 ) ) {
            // TODO ERROR
        } else {
            for ( int i = 0; i < args.length; i = i + 2 ) {

                switch ( args[i] ) {
                    case "-in": {
                        extractArgumentPair( args, argPairs, i );
                        break;
                    }
                    case "-fileType": {
                        extractArgumentPair( args, argPairs, i );
                        break;
                    }
                    default: {
                        System.out.println( "Unkown arg" );
                        break;
                    }
                }
            }
        }

        if ( argPairs.isEmpty() ) {
            return null;
        }
        return argPairs;
    }

    private static void extractArgumentPair( final String[] args, final Map<String, String> argPairs, final int i ) {
        if ( ( i + 1 ) >= args.length ) {
            argPairs.put( args[i], null );
        } else {
            argPairs.put( args[i], args[i + 1] );
        }
    }
}
