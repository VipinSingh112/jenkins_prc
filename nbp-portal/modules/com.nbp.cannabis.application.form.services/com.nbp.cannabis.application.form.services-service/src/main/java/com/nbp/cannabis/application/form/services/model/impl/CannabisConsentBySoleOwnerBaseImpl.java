/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model.impl;

import com.nbp.cannabis.application.form.services.model.CannabisConsentBySoleOwner;
import com.nbp.cannabis.application.form.services.service.CannabisConsentBySoleOwnerLocalServiceUtil;

/**
 * The extended model base implementation for the CannabisConsentBySoleOwner service. Represents a row in the &quot;nbp_cannabis_cso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CannabisConsentBySoleOwnerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConsentBySoleOwnerImpl
 * @see CannabisConsentBySoleOwner
 * @generated
 */
public abstract class CannabisConsentBySoleOwnerBaseImpl
	extends CannabisConsentBySoleOwnerModelImpl
	implements CannabisConsentBySoleOwner {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a cannabis consent by sole owner model instance should use the <code>CannabisConsentBySoleOwner</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			CannabisConsentBySoleOwnerLocalServiceUtil.
				addCannabisConsentBySoleOwner(this);
		}
		else {
			CannabisConsentBySoleOwnerLocalServiceUtil.
				updateCannabisConsentBySoleOwner(this);
		}
	}

}