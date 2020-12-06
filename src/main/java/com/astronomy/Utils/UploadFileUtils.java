package com.astronomy.Utils;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class UploadFileUtils {
	
	public final String root ="uploads/"; 
//	public String writeOrUpdate(byte[] bytes, String path) throws IOException {
//		FileOutputStream fileOutputStream = null;
//		File file = new File(StringUtils.substringBeforeLast(root + path, "/"));
//		if (!file.exists()) {
//			file.mkdir();
//		}
//		try {
//			fileOutputStream = new FileOutputStream(new File(root+path));
//			fileOutputStream.write(bytes);
//			return root+path;
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			if(fileOutputStream != null){
//				fileOutputStream.close();
//			}
//		}
//		return null; 
//	}
	
	public String writeOrUpdate(MultipartFile file) throws IOException{
        try {
        	if(file == null || file.isEmpty()) return null;
        	String fileName = file.getOriginalFilename();
        	String extension = fileName.substring(fileName.indexOf("."));
        	String fileLatest = root + UUID.randomUUID().toString() + extension;
            // Copy file to the target location (Replacing existing file with the same name)
            Path targetLocation = Path.of(fileLatest);
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
            return fileLatest;
        } catch (IOException ex) {
            throw new IOException("Could not store file " + ". Please try again!", ex);
        }
	}
}
