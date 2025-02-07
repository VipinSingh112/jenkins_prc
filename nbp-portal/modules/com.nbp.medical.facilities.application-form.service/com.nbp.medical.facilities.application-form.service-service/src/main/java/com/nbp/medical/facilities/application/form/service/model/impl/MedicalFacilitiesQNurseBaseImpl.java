/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model.impl;

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesQNurse;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesQNurseLocalServiceUtil;

/**
 * The extended model base implementation for the MedicalFacilitiesQNurse service. Represents a row in the &quot;nbp_medical_nurse_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MedicalFacilitiesQNurseImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesQNurseImpl
 * @see MedicalFacilitiesQNurse
 * @generated
 */
public abstract class MedicalFacilitiesQNurseBaseImpl
	extends MedicalFacilitiesQNurseModelImpl
	implements MedicalFacilitiesQNurse {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a medical facilities q nurse model instance should use the <code>MedicalFacilitiesQNurse</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			MedicalFacilitiesQNurseLocalServiceUtil.addMedicalFacilitiesQNurse(
				this);
		}
		else {
			MedicalFacilitiesQNurseLocalServiceUtil.
				updateMedicalFacilitiesQNurse(this);
		}
	}

}