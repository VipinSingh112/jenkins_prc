/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model.impl;

import com.nbp.wra.application.form.service.model.WRAReqIrrigation;
import com.nbp.wra.application.form.service.service.WRAReqIrrigationLocalServiceUtil;

/**
 * The extended model base implementation for the WRAReqIrrigation service. Represents a row in the &quot;nbp_wra_req_irrigation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WRAReqIrrigationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WRAReqIrrigationImpl
 * @see WRAReqIrrigation
 * @generated
 */
public abstract class WRAReqIrrigationBaseImpl
	extends WRAReqIrrigationModelImpl implements WRAReqIrrigation {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a wra req irrigation model instance should use the <code>WRAReqIrrigation</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			WRAReqIrrigationLocalServiceUtil.addWRAReqIrrigation(this);
		}
		else {
			WRAReqIrrigationLocalServiceUtil.updateWRAReqIrrigation(this);
		}
	}

}