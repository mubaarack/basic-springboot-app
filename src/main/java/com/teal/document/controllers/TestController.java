package com.teal.document.controllers;

import org.json.simple.JSONArray;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@RestController
public class TestController {

	@SuppressWarnings("unchecked")
	@RequestMapping("/getDocuments")
	public JSONArray DataAccess(HttpServletResponse response) {

		JSONArray array = new JSONArray();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establishing Connection
			String db_username = "koc3";
			String db_password = "CS684Database!";
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://sql.njit.edu:3306/koc3?useTimezone=true&serverTimezone=UTC", db_username,
					db_password);
			if (con != null) {
				System.out.println("Connected");

				Statement select = con.createStatement();
				ResultSet rs = select.executeQuery("select * from document");
				if (rs.next() == false) {
					response.setStatus(204);
				} else {
					// JSONObject jsonObject = new JSONObject();
					while (rs.next()) {
						JSONObject record = new JSONObject();
						// Inserting key-value pairs into the json object
						record.put("DOCID", rs.getInt("DOCID"));
						record.put("TITLE", rs.getString("TITLE"));
						record.put("PDATE", rs.getDate("PDATE"));
						record.put("PUBLISHERID", rs.getInt("PUBLISHERID"));
						array.add(record);
					}
				}
			} else
				System.out.println("Not Connected");

			con.close();
			return array;
		} catch (Exception e) {
			e.printStackTrace();
			return array;
		}
	}

}
