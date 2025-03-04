/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.nbp.sez.status.application.form.service.model.SezStatusApplication;
import com.nbp.sez.status.application.form.service.service.SezStatusApplicationLocalServiceUtil;

/**
 * The extended model base implementation for the SezStatusApplication service. Represents a row in the &quot;nbp_sez_status_application&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SezStatusApplicationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusApplicationImpl
 * @see SezStatusApplication
 * @generated
 */
public abstract class SezStatusApplicationBaseImpl
	extends SezStatusApplicationModelImpl implements SezStatusApplication {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sez status application model instance should use the <code>SezStatusApplication</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			SezStatusApplicationLocalServiceUtil.addSezStatusApplication(this);
		}
		else {
			SezStatusApplicationLocalServiceUtil.updateSezStatusApplication(
				this);
		}
	}

}