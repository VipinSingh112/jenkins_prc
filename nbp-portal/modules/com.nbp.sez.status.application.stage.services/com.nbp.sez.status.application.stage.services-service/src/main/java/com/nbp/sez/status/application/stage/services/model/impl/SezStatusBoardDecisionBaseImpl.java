/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model.impl;

import com.nbp.sez.status.application.stage.services.model.SezStatusBoardDecision;
import com.nbp.sez.status.application.stage.services.service.SezStatusBoardDecisionLocalServiceUtil;

/**
 * The extended model base implementation for the SezStatusBoardDecision service. Represents a row in the &quot;nbp_sez_status_board_deci&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SezStatusBoardDecisionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusBoardDecisionImpl
 * @see SezStatusBoardDecision
 * @generated
 */
public abstract class SezStatusBoardDecisionBaseImpl
	extends SezStatusBoardDecisionModelImpl implements SezStatusBoardDecision {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sez status board decision model instance should use the <code>SezStatusBoardDecision</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			SezStatusBoardDecisionLocalServiceUtil.addSezStatusBoardDecision(
				this);
		}
		else {
			SezStatusBoardDecisionLocalServiceUtil.updateSezStatusBoardDecision(
				this);
		}
	}

}