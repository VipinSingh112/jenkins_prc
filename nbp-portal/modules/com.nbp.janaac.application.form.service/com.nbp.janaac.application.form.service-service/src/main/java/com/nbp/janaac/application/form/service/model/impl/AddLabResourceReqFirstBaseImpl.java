/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.nbp.janaac.application.form.service.model.AddLabResourceReqFirst;
import com.nbp.janaac.application.form.service.service.AddLabResourceReqFirstLocalServiceUtil;

/**
 * The extended model base implementation for the AddLabResourceReqFirst service. Represents a row in the &quot;nbp_janaac_add_lab_res_req_fir&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AddLabResourceReqFirstImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabResourceReqFirstImpl
 * @see AddLabResourceReqFirst
 * @generated
 */
public abstract class AddLabResourceReqFirstBaseImpl
	extends AddLabResourceReqFirstModelImpl implements AddLabResourceReqFirst {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a add lab resource req first model instance should use the <code>AddLabResourceReqFirst</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			AddLabResourceReqFirstLocalServiceUtil.addAddLabResourceReqFirst(
				this);
		}
		else {
			AddLabResourceReqFirstLocalServiceUtil.updateAddLabResourceReqFirst(
				this);
		}
	}

}