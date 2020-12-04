package com.astronomy.API.admin;

import java.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.astronomy.Utils.UploadFileUtils;
import com.astronomy.dto.UploadFileDTO;

@RestController
@RequestMapping(value = "api")
public class ProductUploadAPI {

	@Autowired
	UploadFileUtils uploadFileUtils;
	// Đọc file lên khi upload
	@PostMapping(value = "Product1")
	public ResponseEntity<Void> uploadFile(@RequestBody UploadFileDTO uploadFileDTO){
		byte[] decodeBase64 = Base64.getDecoder().decode(uploadFileDTO.getBase64().getBytes());
		uploadFileUtils.writeOrUpdate(decodeBase64, "/" + uploadFileDTO.getName());
		return ResponseEntity.noContent().build();
	}
}
