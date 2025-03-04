/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo;
import com.nbp.janaac.application.form.service.service.AccCerBodyMngReqTwoLocalServiceUtil;

/**
 * The extended model base implementation for the AccCerBodyMngReqTwo service. Represents a row in the &quot;nbp_janaac_acc_cer_manage_2&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AccCerBodyMngReqTwoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyMngReqTwoImpl
 * @see AccCerBodyMngReqTwo
 * @generated
 */
public abstract class AccCerBodyMngReqTwoBaseImpl
	extends AccCerBodyMngReqTwoModelImpl implements AccCerBodyMngReqTwo {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a acc cer body mng req two model instance should use the <code>AccCerBodyMngReqTwo</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			AccCerBodyMngReqTwoLocalServiceUtil.addAccCerBodyMngReqTwo(this);
		}
		else {
			AccCerBodyMngReqTwoLocalServiceUtil.updateAccCerBodyMngReqTwo(this);
		}
	}

}