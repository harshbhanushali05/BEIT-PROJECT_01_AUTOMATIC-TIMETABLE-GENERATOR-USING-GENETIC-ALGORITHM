package com.timetable.utility;
public class RandomPassword
{
	public static String getAlphaNumbericRandom(int length) 
	{
		String chars = "0123456789";
		int numberOfCodes = 0;//controls the length of alpha numberic string
		String code = "";
		while (numberOfCodes < length) 
		{
			char c = chars.charAt((int) (Math.random() * chars.length()));
			code += c;
			numberOfCodes++;
		}
		return code;
	}
	public static String getAlphaNumbericRandomUserName(int length) 
	{
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int numberOfCodes = 0;//controls the length of alpha numberic string
		String code = "";
		while (numberOfCodes < length) 
		{
			char c = chars.charAt((int) (Math.random() * chars.length()));
			code += c;
			numberOfCodes++;
		}
		return code;
	}
	public static void main(String args[])
	{
		RandomPassword aa = new RandomPassword();
		String pass=aa.getAlphaNumbericRandomUserName(8);
		String name = aa.getAlphaNumbericRandomUserName(5);
		System.out.println("your User Name:"+name);
		System.out.println("Your Password is:"+pass);
	}
}