/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.model.impl;

import com.nbp.medical.stages.service.model.MedicalApplicationStages;
import com.nbp.medical.stages.service.service.MedicalApplicationStagesLocalServiceUtil;

/**
 * The extended model base implementation for the MedicalApplicationStages service. Represents a row in the &quot;nbp_medical_app_stage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MedicalApplicationStagesImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalApplicationStagesImpl
 * @see MedicalApplicationStages
 * @generated
 */
public abstract class MedicalApplicationStagesBaseImpl
	extends MedicalApplicationStagesModelImpl
	implements MedicalApplicationStages {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a medical application stages model instance should use the <code>MedicalApplicationStages</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			MedicalApplicationStagesLocalServiceUtil.
				addMedicalApplicationStages(this);
		}
		else {
			MedicalApplicationStagesLocalServiceUtil.
				updateMedicalApplicationStages(this);
		}
	}

}