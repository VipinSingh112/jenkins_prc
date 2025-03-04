/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model.impl;

import com.nbp.acquire.application.form.service.model.AcquirePropertyDetails;
import com.nbp.acquire.application.form.service.service.AcquirePropertyDetailsLocalServiceUtil;

/**
 * The extended model base implementation for the AcquirePropertyDetails service. Represents a row in the &quot;nbp_acquire_prop_details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AcquirePropertyDetailsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquirePropertyDetailsImpl
 * @see AcquirePropertyDetails
 * @generated
 */
public abstract class AcquirePropertyDetailsBaseImpl
	extends AcquirePropertyDetailsModelImpl implements AcquirePropertyDetails {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a acquire property details model instance should use the <code>AcquirePropertyDetails</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			AcquirePropertyDetailsLocalServiceUtil.addAcquirePropertyDetails(
				this);
		}
		else {
			AcquirePropertyDetailsLocalServiceUtil.updateAcquirePropertyDetails(
				this);
		}
	}

}