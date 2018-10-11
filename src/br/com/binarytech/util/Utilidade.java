package br.com.binarytech.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilidade {

	public static String criptografar() {
		String palavra = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(palavra.getBytes(), 0, palavra.length());
			palavra = new BigInteger(1,  messageDigest.digest()).toString(16);
		} catch (NoSuchAlgorithmException erro) {
			erro.printStackTrace();
		}
		return palavra;
	}


	public static String criptografarSenha(String senha) {
		String palavra = senha;
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(palavra.getBytes(), 0, palavra.length());
			palavra = new BigInteger(1,  messageDigest.digest()).toString(16);
		} catch (NoSuchAlgorithmException erro) {
			erro.printStackTrace();
		}
		return palavra;
	}
	
}	
	