package com.abhi.service;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import com.abhi.Dto.AdminDto;
import com.abhi.globalException.AdminException;
import com.abhi.model.Admin;

public interface AdminService {
    public Admin saveAdminDetails(Admin admin) throws InvalidKeyException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException;
    public Admin loginAdmin(String email,String password) throws AdminException,InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException;
}
