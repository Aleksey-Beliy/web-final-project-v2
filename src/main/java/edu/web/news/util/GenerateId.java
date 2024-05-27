package edu.web.news.util;

public final class GenerateId {

	public GenerateId() {
	}

	private static int nextId = 1;

	public static int nextId() {
		return nextId++;
	}
}
