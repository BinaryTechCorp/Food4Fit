package br.com.binarytech.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.oreilly.servlet.MultipartRequest;

public class Foto {

	public static String salvarFoto(String pasta, MultipartRequest multipartRequest) {
		try {
			/* Resgata a foto e as coordenadas para cortar */
			File fotoTemporaria = multipartRequest.getFile("foto"); 
			int x = Integer.parseInt(multipartRequest.getParameter("x"));
			int y = Integer.parseInt(multipartRequest.getParameter("y"));
			int w = Integer.parseInt(multipartRequest.getParameter("w"));
			int h = Integer.parseInt(multipartRequest.getParameter("h"));
			/* Pega o nome da foto e separa a extensão */
			String nomeFoto = fotoTemporaria.getName();
			String extensao = nomeFoto.substring((nomeFoto.length() - 4), nomeFoto.length());
			nomeFoto = nomeFoto.replace(".", "");
			/* Geral o MD5 do nome da foto e coloca extensão */
			nomeFoto = Utilidade.criptografar() + "." + extensao;
			/* Monta o caminho da foto */
			String caminhoFoto = pasta + File.separator + nomeFoto;
			/* Abre a foto temporária, corta, grava na pasta desejada e deleta a foto temporária */
			BufferedImage imagem = ImageIO.read(new File(fotoTemporaria.getPath()));
			BufferedImage novaImagem = imagem.getSubimage(x, y, w, h);
			ImageIO.write(novaImagem, extensao, new File(caminhoFoto));
			//fotoTemporaria.delete();
			/* Retorna o caminho da foto */
			return caminhoFoto;
		} catch (IOException erro) {
			erro.printStackTrace();
		}
		/* Retorna vazio se der errado */
		return "";
	}

}
