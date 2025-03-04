/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model.impl;

import com.nbp.osi.application.form.services.model.OsiCurrentStage;
import com.nbp.osi.application.form.services.service.OsiCurrentStageLocalServiceUtil;

/**
 * The extended model base implementation for the OsiCurrentStage service. Represents a row in the &quot;nbp_osi_current_stage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OsiCurrentStageImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiCurrentStageImpl
 * @see OsiCurrentStage
 * @generated
 */
public abstract class OsiCurrentStageBaseImpl
	extends OsiCurrentStageModelImpl implements OsiCurrentStage {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a osi current stage model instance should use the <code>OsiCurrentStage</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			OsiCurrentStageLocalServiceUtil.addOsiCurrentStage(this);
		}
		else {
			OsiCurrentStageLocalServiceUtil.updateOsiCurrentStage(this);
		}
	}

}