/**
 * Copyright (c) 2019 Fred Bricon
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Fred Bricon. - initial API and implementation
 */
package io.sidespin.eclipse.m2e.chromatic.internal;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant;
import org.eclipse.m2e.internal.launch.IMavenLaunchParticipant;

public class ColoredMavenLaunchParticipant implements IMavenLaunchParticipant {

	@Override
	public String getProgramArguments(ILaunchConfiguration configuration, ILaunch launch, IProgressMonitor monitor) {
		return "-Dstyle.color=always";
	}

	@Override
	public String getVMArguments(ILaunchConfiguration configuration, ILaunch launch, IProgressMonitor monitor) {
		return "-Djansi.force=true";
	}

	@Override
	public List<ISourceLookupParticipant> getSourceLookupParticipants(ILaunchConfiguration configuration,
			ILaunch launch, IProgressMonitor monitor) {
		return Collections.emptyList();
	}

}
