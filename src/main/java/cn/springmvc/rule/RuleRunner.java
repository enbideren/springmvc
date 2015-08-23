package cn.springmvc.rule;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.compiler.DroolsParserException;
import org.drools.definition.KnowledgePackage;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;

public class RuleRunner {
	public StatefulKnowledgeSession getDrlSession(String rule)
			throws DroolsParserException {

		final KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
				.newKnowledgeBuilder();
		Reader strReader = null;
		try {
			strReader = new StringReader(rule);
			// TODO 添加规则流
			kbuilder.add(ResourceFactory.newReaderResource(strReader),
					ResourceType.DRL);
		} catch (Exception e) {
			try {
				strReader.close();// 关闭�?
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		/*if (kbuilder.hasErrors()) {
			System.out.println(kbuilder.getErrors().toString());
			throw new RuntimeException("Unable to compile drool rules.");
		}*/
		Collection<KnowledgePackage> pkgs = kbuilder.getKnowledgePackages();
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		kbase.addKnowledgePackages(pkgs);
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		return ksession;
	}
}
