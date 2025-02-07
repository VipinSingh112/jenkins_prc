/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.model.impl;

import com.nbp.ncbj.stages.services.model.NcbjAppBoardDecision;
import com.nbp.ncbj.stages.services.service.NcbjAppBoardDecisionLocalServiceUtil;

/**
 * The extended model base implementation for the NcbjAppBoardDecision service. Represents a row in the &quot;nbp_ncbj_board_decision&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NcbjAppBoardDecisionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjAppBoardDecisionImpl
 * @see NcbjAppBoardDecision
 * @generated
 */
public abstract class NcbjAppBoardDecisionBaseImpl
	extends NcbjAppBoardDecisionModelImpl implements NcbjAppBoardDecision {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a ncbj app board decision model instance should use the <code>NcbjAppBoardDecision</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			NcbjAppBoardDecisionLocalServiceUtil.addNcbjAppBoardDecision(this);
		}
		else {
			NcbjAppBoardDecisionLocalServiceUtil.updateNcbjAppBoardDecision(
				this);
		}
	}

}