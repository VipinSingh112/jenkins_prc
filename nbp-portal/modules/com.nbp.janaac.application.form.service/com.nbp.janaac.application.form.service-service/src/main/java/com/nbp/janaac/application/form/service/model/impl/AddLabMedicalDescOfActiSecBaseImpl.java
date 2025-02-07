/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.nbp.janaac.application.form.service.model.AddLabMedicalDescOfActiSec;
import com.nbp.janaac.application.form.service.service.AddLabMedicalDescOfActiSecLocalServiceUtil;

/**
 * The extended model base implementation for the AddLabMedicalDescOfActiSec service. Represents a row in the &quot;nbp_janaac_add_lab_med_dec_sec&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AddLabMedicalDescOfActiSecImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalDescOfActiSecImpl
 * @see AddLabMedicalDescOfActiSec
 * @generated
 */
public abstract class AddLabMedicalDescOfActiSecBaseImpl
	extends AddLabMedicalDescOfActiSecModelImpl
	implements AddLabMedicalDescOfActiSec {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a add lab medical desc of acti sec model instance should use the <code>AddLabMedicalDescOfActiSec</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			AddLabMedicalDescOfActiSecLocalServiceUtil.
				addAddLabMedicalDescOfActiSec(this);
		}
		else {
			AddLabMedicalDescOfActiSecLocalServiceUtil.
				updateAddLabMedicalDescOfActiSec(this);
		}
	}

}