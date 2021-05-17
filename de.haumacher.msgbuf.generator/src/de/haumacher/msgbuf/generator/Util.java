/*
 * Copyright (c) 2021 Bernhard Haumacher et al. All Rights Reserved.
 */
package de.haumacher.msgbuf.generator;

import java.util.List;
import java.util.stream.Collectors;

import de.haumacher.msgbuf.generator.ast.QName;

/**
 * TODO
 */
public class Util {

	/** 
	 * TODO
	 */
	public static String last(QName qName) {
		List<String> names = qName.getNames();
		return names.get(names.size() - 1);
	}

	/** 
	 * TODO
	 */
	public static String qName(QName qName) {
		return qName.getNames().stream().collect(Collectors.joining("."));
	}

}
