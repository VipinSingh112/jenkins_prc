/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil;

/**
 * The extended model base implementation for the JTBApplication service. Represents a row in the &quot;nbp_jtb_applications&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JTBApplicationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JTBApplicationImpl
 * @see JTBApplication
 * @generated
 */
public abstract class JTBApplicationBaseImpl
	extends JTBApplicationModelImpl implements JTBApplication {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a jtb application model instance should use the <code>JTBApplication</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			JTBApplicationLocalServiceUtil.addJTBApplication(this);
		}
		else {
			JTBApplicationLocalServiceUtil.updateJTBApplication(this);
		}
	}

}