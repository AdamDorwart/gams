/*********************************************************************
 * Copyright (c) 2013-2015 Carnegie Mellon University. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following acknowledgments and disclaimers.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * 
 * 3. The names "Carnegie Mellon University," "SEI" and/or
 * "Software Engineering Institute" shall not be used to endorse or promote
 * products derived from this software without prior written permission. For
 * written permission, please contact permission@sei.cmu.edu.
 * 
 * 4. Products derived from this software may not be called "SEI" nor may "SEI"
 * appear in their names without prior written permission of
 * permission@sei.cmu.edu.
 *
 * 5. Redistributions of any form whatsoever must retain the following
 * acknowledgment:
 *
 * This material is based upon work funded and supported by the Department of
 * Defense under Contract No. FA8721-05-C-0003 with Carnegie Mellon University
 * for the operation of the Software Engineering Institute, a federally funded
 * research and development center. Any opinions, findings and conclusions or
 * recommendations expressed in this material are those of the author(s) and
 * do not necessarily reflect the views of the United States Department of
 * Defense.
 * 
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING
 * INSTITUTE MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON
 * UNIVERSITY MAKES NO WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED,
 * AS TO ANY MATTER INCLUDING, BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR
 * PURPOSE OR MERCHANTABILITY, EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE
 * MATERIAL. CARNEGIE MELLON UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND
 * WITH RESPECT TO FREEDOM FROM PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 * 
 * This material has been approved for public release and unlimited
 * distribution.
 * 
 * @author James Edmondson <jedmondson@gmail.com>
 *********************************************************************/

package com.gams.tests;
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.madara.KnowledgeBase;
import com.gams.controllers.BaseController;
import com.gams.utility.Logging;
import com.madara.KnowledgeList;

import com.gams.algorithms.DebugAlgorithmFactory;

public class TestDebuggerLoop
{ 
  public static void main (String...args) throws Exception
  {
    Logging.setLevel(6);
  	  
    System.out.println("Creating knowledge base...");
    KnowledgeBase knowledge = new KnowledgeBase();
    System.out.println("Passing knowledge base to base controller...");
    BaseController controller = new BaseController(knowledge);
    
    System.out.println("Creating debug algorithm factory...");
    DebugAlgorithmFactory debugFactory = new DebugAlgorithmFactory();
    
    System.out.println("Adding debug algorithm factory as 'java-debug'...");
    controller.addAlgorithmFactory("java-debug", debugFactory);
 
    KnowledgeList list = new KnowledgeList();
    
    System.out.println("Initializing 'java-debug' algorithm...");
    controller.initAlgorithm("java-debug", list);
    
    System.out.println("Running controller every 1s for 10s...");
    controller.run(1.0, 200.0);
    
    controller.free();
    knowledge.free();
  }
  
  
}