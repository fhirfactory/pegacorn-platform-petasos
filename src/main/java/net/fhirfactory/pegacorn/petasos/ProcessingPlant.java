/*
 * Copyright (c) 2020 MAHun
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package net.fhirfactory.pegacorn.petasos;

import java.util.HashMap;

import net.fhirfactory.pegacorn.common.model.FDN;
import net.fhirfactory.pegacorn.petasos.model.servicemodule.MapElement;
import net.fhirfactory.pegacorn.petasos.model.wupcontainer.WUPContainerDefinition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fhirfactory.pegacorn.common.model.FDNToken;
import net.fhirfactory.pegacorn.petasos.core.itops.model.PegacornCI;

import javax.enterprise.context.ApplicationScoped;

/**
 * 
 * <b> Pegacorn System Component Hierarchy </b>
 * PegacornSubsytem contains PegacornService(s)
 * PegacornService contains ProcessingFactory(ies)
 * ProcessingFactory contains ProcessingPlant(s)
 * ProcessingPlant contains WorkUnitProcessor
 *
 * @author Mark A. Hunter
 *
 */

@ApplicationScoped
public class ProcessingPlant  extends PegacornCI {
	private static final Logger LOG = LoggerFactory.getLogger(ProcessingPlant.class);
	
	private HashMap<FDNToken, WUPContainerDefinition> containedContraptionSet;
	private HashMap<FDNToken, MapElement> containedProcessingPathSet;

	public ProcessingPlant(){
		this.containedContraptionSet = new HashMap<FDNToken, WUPContainerDefinition>();
		this.containedProcessingPathSet = new HashMap<FDNToken, MapElement>();
	}

	public void register(FDN wupTypeID, FDN wupInstanceID){

	}




}
