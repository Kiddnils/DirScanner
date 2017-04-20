package dirscanner.logic;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import dirscanner.model.FileInfo;

public class DirScanner {
	
	public DirScanner(){
		
	}

    public void scan( final File startDir, final String suffix ) {
        List<FileInfo> foundFiles = new LinkedList<>();

        foundFiles = scanAll( startDir);
       
        
        for(int i = 0; i < foundFiles.size(); i++){
        	System.out.println(foundFiles.get(i).toString());
        }
    }
    
    private List<FileInfo> scanAll( final File startDir){
    	
    	File[] files = startDir.listFiles();
    	List<FileInfo> fileInfos = new LinkedList<>();
    	
    	if(files != null && files.length > 0){   		
    		for(int i = 0; i < files.length; i++){   			
    			if(files[i].isDirectory()){				
    				fileInfos.addAll( scanAll(files[i]));
    			}else{
    				fileInfos.add(new FileInfo(files[i].getAbsolutePath(), files[i].length(), files[i].lastModified()));
    			}
    		}
    	}
    	return fileInfos;
    }
}
