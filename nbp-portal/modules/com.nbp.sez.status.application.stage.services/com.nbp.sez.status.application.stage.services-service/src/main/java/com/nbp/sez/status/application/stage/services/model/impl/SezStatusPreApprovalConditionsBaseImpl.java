/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model.impl;

import com.nbp.sez.status.application.stage.services.model.SezStatusPreApprovalConditions;
import com.nbp.sez.status.application.stage.services.service.SezStatusPreApprovalConditionsLocalServiceUtil;

/**
 * The extended model base implementation for the SezStatusPreApprovalConditions service. Represents a row in the &quot;nbp_sez_pre_approval&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SezStatusPreApprovalConditionsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusPreApprovalConditionsImpl
 * @see SezStatusPreApprovalConditions
 * @generated
 */
public abstract class SezStatusPreApprovalConditionsBaseImpl
	extends SezStatusPreApprovalConditionsModelImpl
	implements SezStatusPreApprovalConditions {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sez status pre approval conditions model instance should use the <code>SezStatusPreApprovalConditions</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			SezStatusPreApprovalConditionsLocalServiceUtil.
				addSezStatusPreApprovalConditions(this);
		}
		else {
			SezStatusPreApprovalConditionsLocalServiceUtil.
				updateSezStatusPreApprovalConditions(this);
		}
	}

}