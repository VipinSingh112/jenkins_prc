/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.nbp.janaac.application.form.service.model.AddFdaAppliInfo;
import com.nbp.janaac.application.form.service.service.AddFdaAppliInfoLocalServiceUtil;

/**
 * The extended model base implementation for the AddFdaAppliInfo service. Represents a row in the &quot;nbp_janaac_add_fda_Appli_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AddFdaAppliInfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaAppliInfoImpl
 * @see AddFdaAppliInfo
 * @generated
 */
public abstract class AddFdaAppliInfoBaseImpl
	extends AddFdaAppliInfoModelImpl implements AddFdaAppliInfo {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a add fda appli info model instance should use the <code>AddFdaAppliInfo</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			AddFdaAppliInfoLocalServiceUtil.addAddFdaAppliInfo(this);
		}
		else {
			AddFdaAppliInfoLocalServiceUtil.updateAddFdaAppliInfo(this);
		}
	}

}