/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.nbp.hsra.application.service.model.RadionuclideAdd;
import com.nbp.hsra.application.service.service.RadionuclideAddLocalServiceUtil;

/**
 * The extended model base implementation for the RadionuclideAdd service. Represents a row in the &quot;nbp_hsra_radionuclide_add&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RadionuclideAddImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadionuclideAddImpl
 * @see RadionuclideAdd
 * @generated
 */
public abstract class RadionuclideAddBaseImpl
	extends RadionuclideAddModelImpl implements RadionuclideAdd {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a radionuclide add model instance should use the <code>RadionuclideAdd</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			RadionuclideAddLocalServiceUtil.addRadionuclideAdd(this);
		}
		else {
			RadionuclideAddLocalServiceUtil.updateRadionuclideAdd(this);
		}
	}

}