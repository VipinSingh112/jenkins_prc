/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.model.impl;

import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationCommitteeDecision;
import com.nbp.pharmaceutical.stages.services.service.PharmaApplicationCommitteeDecisionLocalServiceUtil;

/**
 * The extended model base implementation for the PharmaApplicationCommitteeDecision service. Represents a row in the &quot;nbp_pharma_comm_decision&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PharmaApplicationCommitteeDecisionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationCommitteeDecisionImpl
 * @see PharmaApplicationCommitteeDecision
 * @generated
 */
public abstract class PharmaApplicationCommitteeDecisionBaseImpl
	extends PharmaApplicationCommitteeDecisionModelImpl
	implements PharmaApplicationCommitteeDecision {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a pharma application committee decision model instance should use the <code>PharmaApplicationCommitteeDecision</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			PharmaApplicationCommitteeDecisionLocalServiceUtil.
				addPharmaApplicationCommitteeDecision(this);
		}
		else {
			PharmaApplicationCommitteeDecisionLocalServiceUtil.
				updatePharmaApplicationCommitteeDecision(this);
		}
	}

}