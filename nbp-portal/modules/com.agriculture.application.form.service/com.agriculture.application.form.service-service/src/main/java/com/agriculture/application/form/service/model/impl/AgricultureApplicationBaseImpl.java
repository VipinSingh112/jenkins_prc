/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model.impl;

import com.agriculture.application.form.service.model.AgricultureApplication;
import com.agriculture.application.form.service.service.AgricultureApplicationLocalServiceUtil;

/**
 * The extended model base implementation for the AgricultureApplication service. Represents a row in the &quot;agriculture_application&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AgricultureApplicationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApplicationImpl
 * @see AgricultureApplication
 * @generated
 */
public abstract class AgricultureApplicationBaseImpl
	extends AgricultureApplicationModelImpl implements AgricultureApplication {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a agriculture application model instance should use the <code>AgricultureApplication</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			AgricultureApplicationLocalServiceUtil.addAgricultureApplication(
				this);
		}
		else {
			AgricultureApplicationLocalServiceUtil.updateAgricultureApplication(
				this);
		}
	}

}