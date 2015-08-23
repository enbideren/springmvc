package cn.springmvc.test;

import java.io.IOException;
import java.io.Reader;
import java.util.Collection;
import java.util.Iterator;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.compiler.DroolsParserException;
import org.drools.definition.KnowledgePackage;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.rule.QueryResults;
import org.drools.runtime.rule.QueryResultsRow;
import org.junit.Test;

import com.hxrainbow.rule.model.Apply;
import com.hxrainbow.rule.model.Business;

public class RuleTest {
	public static void main(String[] args) throws Exception {
		RuleTest ruleTest = new RuleTest();
		ruleTest.addUser();
	}
	
	@Test
	public void addUser() throws Exception{
		Business business = new Business(9);
		Apply apply = new Apply();
		StatefulKnowledgeSession session = getDrlSession("rules/ApplyRule.drl");
		session.insert(business);
		session.insert(apply);
		session.fireAllRules();
		QueryResults queryResult = session.getQueryResults("end Apply");
		for (QueryResultsRow queryResultsRow : queryResult) {
			Apply loanMoney = (Apply)queryResultsRow.get("apply");
			System.out.println(loanMoney.getResult());
		}
		session.dispose();
	}
	public StatefulKnowledgeSession getDrlSession(String rule)
			throws DroolsParserException {

		final KnowledgeBuilder kbuilder = KnowledgeBuilderFactory
				.newKnowledgeBuilder();
		Reader strReader = null;
		try {
			// TODO 添加规则流
			kbuilder.add(ResourceFactory.newClassPathResource(rule),
					ResourceType.DRL);
		} catch (Exception e) {
			try {
				strReader.close();// 关闭�?
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		if (kbuilder.hasErrors()) {
//			System.out.println(kbuilder.getErrors().toString());
//			throw new RuntimeException("Unable to compile drool rules.");
			System.out.println("规则中存在错误，错误消息如下：");
			KnowledgeBuilderErrors kbuidlerErrors=kbuilder.getErrors();
			for(Iterator iter=kbuidlerErrors.iterator();iter.hasNext();){
			System.out.println(iter.next());
			}
		}
		Collection<KnowledgePackage> pkgs = kbuilder.getKnowledgePackages();
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		kbase.addKnowledgePackages(pkgs);
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		return ksession;
	}
}
