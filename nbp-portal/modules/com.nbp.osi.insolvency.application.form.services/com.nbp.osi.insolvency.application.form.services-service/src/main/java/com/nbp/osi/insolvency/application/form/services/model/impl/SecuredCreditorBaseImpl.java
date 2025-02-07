/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.nbp.osi.insolvency.application.form.services.model.SecuredCreditor;
import com.nbp.osi.insolvency.application.form.services.service.SecuredCreditorLocalServiceUtil;

/**
 * The extended model base implementation for the SecuredCreditor service. Represents a row in the &quot;nbp_osi_liability_detail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SecuredCreditorImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SecuredCreditorImpl
 * @see SecuredCreditor
 * @generated
 */
public abstract class SecuredCreditorBaseImpl
	extends SecuredCreditorModelImpl implements SecuredCreditor {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a secured creditor model instance should use the <code>SecuredCreditor</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			SecuredCreditorLocalServiceUtil.addSecuredCreditor(this);
		}
		else {
			SecuredCreditorLocalServiceUtil.updateSecuredCreditor(this);
		}
	}

}