package com.Arunima.exceldump.service;

import com.Arunima.exceldump.entity.Product;
import com.Arunima.exceldump.helper.Helper;
import com.Arunima.exceldump.repo.PorductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {
	
	 @Autowired
	    private PorductRepo productRepo;

	    public void save(MultipartFile file) {

	        try {
	            List<Product> products = Helper.convertExcelToListOfProduct(file.getInputStream());
	            this.productRepo.saveAll(products);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    }

	    public List<Product> getAllProducts() {
	        return this.productRepo.findAll();
	    }


}
