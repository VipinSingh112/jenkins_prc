/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model.impl;

import com.nbp.miic.application.form.services.model.MiicApplication;
import com.nbp.miic.application.form.services.service.MiicApplicationLocalServiceUtil;

/**
 * The extended model base implementation for the MiicApplication service. Represents a row in the &quot;nbp_miic_application&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MiicApplicationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicationImpl
 * @see MiicApplication
 * @generated
 */
public abstract class MiicApplicationBaseImpl
	extends MiicApplicationModelImpl implements MiicApplication {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a miic application model instance should use the <code>MiicApplication</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			MiicApplicationLocalServiceUtil.addMiicApplication(this);
		}
		else {
			MiicApplicationLocalServiceUtil.updateMiicApplication(this);
		}
	}

}