package org.metaborg.example.externalref.expressions.strategies;

import org.metaborg.example.externalref.context.get_external_type_0_0;
import org.strategoxt.lang.JavaInteropRegisterer;
import org.strategoxt.lang.Strategy;

public class InteropRegisterer extends JavaInteropRegisterer {
	public InteropRegisterer() {
		
		super(new Strategy[] { get_external_type_0_0.instance });
	}
}
