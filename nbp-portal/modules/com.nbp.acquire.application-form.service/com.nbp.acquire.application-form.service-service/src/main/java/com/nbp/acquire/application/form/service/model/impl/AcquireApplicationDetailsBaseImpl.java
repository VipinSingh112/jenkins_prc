/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model.impl;

import com.nbp.acquire.application.form.service.model.AcquireApplicationDetails;
import com.nbp.acquire.application.form.service.service.AcquireApplicationDetailsLocalServiceUtil;

/**
 * The extended model base implementation for the AcquireApplicationDetails service. Represents a row in the &quot;nbp_acquire_details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AcquireApplicationDetailsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireApplicationDetailsImpl
 * @see AcquireApplicationDetails
 * @generated
 */
public abstract class AcquireApplicationDetailsBaseImpl
	extends AcquireApplicationDetailsModelImpl
	implements AcquireApplicationDetails {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a acquire application details model instance should use the <code>AcquireApplicationDetails</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			AcquireApplicationDetailsLocalServiceUtil.
				addAcquireApplicationDetails(this);
		}
		else {
			AcquireApplicationDetailsLocalServiceUtil.
				updateAcquireApplicationDetails(this);
		}
	}

}