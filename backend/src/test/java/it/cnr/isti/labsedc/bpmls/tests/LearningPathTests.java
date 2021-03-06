package it.cnr.isti.labsedc.bpmls.tests;

import java.util.List;

import org.camunda.bpm.engine.task.Task;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import it.cnr.isti.labsedc.bpmls.BpmlsApp;
import it.cnr.isti.labsedc.bpmls.LearningProcessEngine;
import it.cnr.isti.labsedc.bpmls.Exceptions.LearningPathException;
import it.cnr.isti.labsedc.bpmls.learningpathspec.LearningPath;
import it.cnr.isti.labsedc.bpmls.persistance.LearningPathInstance;
import it.cnr.isti.labsedc.bpmls.persistance.LearningScenarioInstance;

/*@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BpmlsApp.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)*/
public class LearningPathTests {

/*	@Autowired
	private LearningProcessEngine learningProcessEngine;*/

	/*@Test
	public void t1learningPathtest() throws LearningPathException {
		// there should be only one deployed learning process
		List<LearningPath> deployedLps = learningProcessEngine.getLearningEngineRepositoryService()
				.getDeployedLearningPaths();
		Assert.assertEquals(2, deployedLps.size());

		// start a learningpath
		learningProcessEngine.getLearningEngineRuntimeService().startaLearningPathById(deployedLps.get(0).getId());

		// check if only one running learning path is there
		Assert.assertEquals(1,
				learningProcessEngine.getLearningEngineRuntimeService().getRunningLearningPaths().size());

		// check if the id is the same
		Assert.assertEquals(deployedLps.get(0).getId(),
				learningProcessEngine.getLearningEngineRuntimeService().getRunningLearningPaths().get(0).getLpId());

	}*/

	/*@Test(expected = LearningPathException.class)
	public void t2startAnotherLearningProcessInstance() throws LearningPathException {
		// start a learningpath- will throw an exception
		learningProcessEngine.getLearningEngineRuntimeService().startaLearningPathById(learningProcessEngine.getLearningEngineRuntimeService().getRunningLearningPaths().get(0).getLpId());
	}

	@Test
	public void t3learningScenarioTest() throws LearningPathException {
		// get the running learningpath
		List<LearningPath> deployedLps = learningProcessEngine.getLearningEngineRepositoryService()
				.getDeployedLearningPaths();
		LearningPathInstance lpInst = learningProcessEngine.getLearningEngineRuntimeService()
				.getRunningLearningPathBylpId(deployedLps.get(0).getId());

		LearningScenarioInstance nextLsInst = learningProcessEngine.getLearningEngineRuntimeService()
				.getNextLearningScenarioByLpInstId(Integer.toString(lpInst.getLpInstId()));

		// Should be the first learningscenario
		Assert.assertEquals("learningscenario1", nextLsInst.getLsId());

		// since no learningscenario started should be null
		LearningScenarioInstance currentLsInst = learningProcessEngine.getLearningEngineRuntimeService()
				.getRunningLearningScenarioByIpInstId(Integer.toString(lpInst.getLpInstId()));
		Assert.assertNull(currentLsInst);
	}

	@Test
	public void t4startingLearningScenarioTest() throws LearningPathException {
		// start a learningScenario
		// get the running learningpath
//		List<LearningPath> deployedLps = learningProcessEngine.getLearningEngineRepositoryService()
//				.getDeployedLearningPaths();
//		LearningPathInstance lpInst = learningProcessEngine.getLearningEngineRuntimeService()
//				.getRunningLearningPathBylpId(deployedLps.get(0).getId());
//		learningProcessEngine.getLearningEngineRuntimeService()
//				.startNextLearningScenario(Integer.toString(lpInst.getLpInstId()));
//		
		//Assert Missing
		
	}

	@Test(expected = LearningPathException.class)
	public void t5startingIllegalLearningScenarioTest() throws LearningPathException {
		throw new LearningPathException();
//		// start a learningScenario
//		// get the running learningpath
//		List<LearningPath> deployedLps = learningProcessEngine.getLearningEngineRepositoryService()
//				.getDeployedLearningPaths();
//		LearningPathInstance lpInst = learningProcessEngine.getLearningEngineRuntimeService()
//				.getRunningLearningPathBylpId(deployedLps.get(0).getId());
//		learningProcessEngine.getLearningEngineRuntimeService()
//				.startNextLearningScenario(Integer.toString(lpInst.getLpInstId()));
		

	}

	@Test
	public void t6checkRunningLearningScenario() throws LearningPathException {
		// get the running learningpath
		List<LearningPath> deployedLps = learningProcessEngine.getLearningEngineRepositoryService()
				.getDeployedLearningPaths();
		LearningPathInstance lpInst = learningProcessEngine.getLearningEngineRuntimeService()
				.getRunningLearningPathBylpId(deployedLps.get(0).getId());
		// since no learningscenario started should be null
		LearningScenarioInstance currentLsInst = learningProcessEngine.getLearningEngineRuntimeService()
				.getRunningLearningScenarioByIpInstId(Integer.toString(lpInst.getLpInstId()));
		
		// Should be the first learningscenario
				Assert.assertEquals("learningscenario1", currentLsInst.getLsId());

				// Should be the first learningscenario
				//Assert.assertEquals("learningscenario2", nextLsInst.getLsId());
	}
	
	@Test
	public void t7checkLearningTasks() throws LearningPathException{
//		List<LearningPath> deployedLps = learningProcessEngine.getLearningEngineRepositoryService()
//				.getDeployedLearningPaths();
//		LearningPathInstance lpInst = learningProcessEngine.getLearningEngineRuntimeService()
//				.getRunningLearningPathBylpId(deployedLps.get(0).getId());
//		Task task=learningProcessEngine.getLearningEngineTaskService().getCurrentLearningTask(Integer.toString(lpInst.getLpInstId()));
//		
//		LearningScenarioInstance currentLsInst = learningProcessEngine.getLearningEngineRuntimeService()
//				.getRunningLearningScenarioByIpInstId(Integer.toString(lpInst.getLpInstId()));
//		
//		//task id should be same as the next learning activity
//		Assert.assertEquals(currentLsInst.getNextLearningTask(), task.getTaskDefinitionKey());
	}*/

}
