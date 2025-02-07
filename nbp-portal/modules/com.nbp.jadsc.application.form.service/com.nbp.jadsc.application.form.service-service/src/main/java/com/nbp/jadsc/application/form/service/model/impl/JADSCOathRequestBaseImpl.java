/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model.impl;

import com.nbp.jadsc.application.form.service.model.JADSCOathRequest;
import com.nbp.jadsc.application.form.service.service.JADSCOathRequestLocalServiceUtil;

/**
 * The extended model base implementation for the JADSCOathRequest service. Represents a row in the &quot;nbp_jadsc_oath_request&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JADSCOathRequestImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCOathRequestImpl
 * @see JADSCOathRequest
 * @generated
 */
public abstract class JADSCOathRequestBaseImpl
	extends JADSCOathRequestModelImpl implements JADSCOathRequest {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a jadsc oath request model instance should use the <code>JADSCOathRequest</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			JADSCOathRequestLocalServiceUtil.addJADSCOathRequest(this);
		}
		else {
			JADSCOathRequestLocalServiceUtil.updateJADSCOathRequest(this);
		}
	}

}