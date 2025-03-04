/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.model.impl;

import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationFullLicense;
import com.nbp.pharmaceutical.stages.services.service.PharmaApplicationFullLicenseLocalServiceUtil;

/**
 * The extended model base implementation for the PharmaApplicationFullLicense service. Represents a row in the &quot;nbp_pharma_full_license&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PharmaApplicationFullLicenseImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationFullLicenseImpl
 * @see PharmaApplicationFullLicense
 * @generated
 */
public abstract class PharmaApplicationFullLicenseBaseImpl
	extends PharmaApplicationFullLicenseModelImpl
	implements PharmaApplicationFullLicense {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a pharma application full license model instance should use the <code>PharmaApplicationFullLicense</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			PharmaApplicationFullLicenseLocalServiceUtil.
				addPharmaApplicationFullLicense(this);
		}
		else {
			PharmaApplicationFullLicenseLocalServiceUtil.
				updatePharmaApplicationFullLicense(this);
		}
	}

}