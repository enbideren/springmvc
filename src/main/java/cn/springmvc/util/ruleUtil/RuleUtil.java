package cn.springmvc.util.ruleUtil;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

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
import org.springframework.util.StringUtils;

public class RuleUtil {
	public static void doRule(String flowName,String rule,Object[] objects){
		List<String> list = new ArrayList<String>();
		list.add(rule);
		doRuleQuery(flowName,list,objects).dispose();
	}
	public static void doRule(String flowName,List<String> rule,Object[] objects){
		doRuleQuery(flowName,rule,objects).dispose();
	}
	public static StatefulKnowledgeSession doRuleQuery(String flowName,String rule,Object[] objects){
		List<String> list = new ArrayList<String>();
		list.add(rule);
		return doRuleQuery(flowName,list,objects);
	}
	public static StatefulKnowledgeSession doRuleQuery(String flowName,List<String> rule,Object[] objects){
		StatefulKnowledgeSession session = null;
		try {
			session = getDrlSession(rule);
		} catch (DroolsParserException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < objects.length; i++) {
			session.insert(objects[i]);
		}
		if (!StringUtils.isEmpty(flowName)) {
			session.startProcess(flowName);
		}
		session.fireAllRules();
		return session;
	}
	public static StatefulKnowledgeSession getDrlSession(List<String> rule)
			throws DroolsParserException {
		final KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		Reader strReader = null;
		try {
			for (int i = 0; i < rule.size(); i++) {
				if (rule.get(i).endsWith("drl")) {
					kbuilder.add(ResourceFactory.newClassPathResource(rule.get(i)),
							ResourceType.DRL);
				}else if(rule.get(i).endsWith("rf")){
					kbuilder.add(ResourceFactory.newClassPathResource(rule.get(i)),
							ResourceType.DRF);
				}
			}
		} catch (Exception e) {
			try {
				strReader.close();// 关闭
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		if (kbuilder.hasErrors()) {
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
	public static void main(String[] args) {
		String name = "rules/baseFlow.rf";
		String name2 ="rules/CreditMPostionRule.drl"; 
		System.out.println(name.endsWith("drl"));
		System.out.println(name2.endsWith("drl"));
	}
}
