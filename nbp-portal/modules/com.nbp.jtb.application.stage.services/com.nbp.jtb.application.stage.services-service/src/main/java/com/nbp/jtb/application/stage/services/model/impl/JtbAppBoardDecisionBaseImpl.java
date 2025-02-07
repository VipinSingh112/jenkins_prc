/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.model.impl;

import com.nbp.jtb.application.stage.services.model.JtbAppBoardDecision;
import com.nbp.jtb.application.stage.services.service.JtbAppBoardDecisionLocalServiceUtil;

/**
 * The extended model base implementation for the JtbAppBoardDecision service. Represents a row in the &quot;nbp_jtb_board_decision&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JtbAppBoardDecisionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbAppBoardDecisionImpl
 * @see JtbAppBoardDecision
 * @generated
 */
public abstract class JtbAppBoardDecisionBaseImpl
	extends JtbAppBoardDecisionModelImpl implements JtbAppBoardDecision {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a jtb app board decision model instance should use the <code>JtbAppBoardDecision</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			JtbAppBoardDecisionLocalServiceUtil.addJtbAppBoardDecision(this);
		}
		else {
			JtbAppBoardDecisionLocalServiceUtil.updateJtbAppBoardDecision(this);
		}
	}

}