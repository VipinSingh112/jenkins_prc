/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.nbp.osi.insolvency.application.form.services.model.CompanyDetails;
import com.nbp.osi.insolvency.application.form.services.service.CompanyDetailsLocalServiceUtil;

/**
 * The extended model base implementation for the CompanyDetails service. Represents a row in the &quot;nbp_osi_company_details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CompanyDetailsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanyDetailsImpl
 * @see CompanyDetails
 * @generated
 */
public abstract class CompanyDetailsBaseImpl
	extends CompanyDetailsModelImpl implements CompanyDetails {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a company details model instance should use the <code>CompanyDetails</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			CompanyDetailsLocalServiceUtil.addCompanyDetails(this);
		}
		else {
			CompanyDetailsLocalServiceUtil.updateCompanyDetails(this);
		}
	}

}