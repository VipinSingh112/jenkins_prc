/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.nbp.janaac.application.form.service.model.AddFdaScopeClient;
import com.nbp.janaac.application.form.service.service.AddFdaScopeClientLocalServiceUtil;

/**
 * The extended model base implementation for the AddFdaScopeClient service. Represents a row in the &quot;nbp_janaac_add_fda_scop_client&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AddFdaScopeClientImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaScopeClientImpl
 * @see AddFdaScopeClient
 * @generated
 */
public abstract class AddFdaScopeClientBaseImpl
	extends AddFdaScopeClientModelImpl implements AddFdaScopeClient {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a add fda scope client model instance should use the <code>AddFdaScopeClient</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			AddFdaScopeClientLocalServiceUtil.addAddFdaScopeClient(this);
		}
		else {
			AddFdaScopeClientLocalServiceUtil.updateAddFdaScopeClient(this);
		}
	}

}