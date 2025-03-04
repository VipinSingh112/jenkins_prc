/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.nbp.osi.insolvency.application.form.services.model.CompanyUnsecuredCreditor;
import com.nbp.osi.insolvency.application.form.services.service.CompanyUnsecuredCreditorLocalServiceUtil;

/**
 * The extended model base implementation for the CompanyUnsecuredCreditor service. Represents a row in the &quot;nbp_osi_unsecured_cred&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CompanyUnsecuredCreditorImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanyUnsecuredCreditorImpl
 * @see CompanyUnsecuredCreditor
 * @generated
 */
public abstract class CompanyUnsecuredCreditorBaseImpl
	extends CompanyUnsecuredCreditorModelImpl
	implements CompanyUnsecuredCreditor {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a company unsecured creditor model instance should use the <code>CompanyUnsecuredCreditor</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			CompanyUnsecuredCreditorLocalServiceUtil.
				addCompanyUnsecuredCreditor(this);
		}
		else {
			CompanyUnsecuredCreditorLocalServiceUtil.
				updateCompanyUnsecuredCreditor(this);
		}
	}

}