package com.ecom.security;

import java.util.Date;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {
	
	private final String secret="testkeysecret10337474";
	
	private final long EXPIRATION=86400000;
	
	@SuppressWarnings("deprecation")
	private String generateToken(String email) {
		return Jwts.builder().
				setSubject(secret).
				setIssuedAt(new Date()).
				setExpiration(new Date(System.currentTimeMillis()+EXPIRATION)).
				signWith(SignatureAlgorithm.HS256,secret).
				compact();
	}
	
	@SuppressWarnings("deprecation")
	public String extractEmail(String token) {
		return Jwts.parser().
				setSigningKey(secret).
				parseClaimsJwt(token).
				getBody().
				getSubject();
	}
	
	public boolean validateToken(String token) {
		try {
			Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
			return true;
		} catch (Exception e) {
			return false;
			// TODO: handle exception
		}
	}

}
