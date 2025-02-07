/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model.impl;

import com.nbp.wra.application.form.service.model.RenewLicAbstractAndWater;
import com.nbp.wra.application.form.service.service.RenewLicAbstractAndWaterLocalServiceUtil;

/**
 * The extended model base implementation for the RenewLicAbstractAndWater service. Represents a row in the &quot;nbp_wra_renew_abstract&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RenewLicAbstractAndWaterImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RenewLicAbstractAndWaterImpl
 * @see RenewLicAbstractAndWater
 * @generated
 */
public abstract class RenewLicAbstractAndWaterBaseImpl
	extends RenewLicAbstractAndWaterModelImpl
	implements RenewLicAbstractAndWater {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a renew lic abstract and water model instance should use the <code>RenewLicAbstractAndWater</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			RenewLicAbstractAndWaterLocalServiceUtil.
				addRenewLicAbstractAndWater(this);
		}
		else {
			RenewLicAbstractAndWaterLocalServiceUtil.
				updateRenewLicAbstractAndWater(this);
		}
	}

}