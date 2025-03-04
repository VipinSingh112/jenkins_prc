/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.model.impl;

import com.nbp.agriculture.stages.services.model.AgricultureApplicationStages;
import com.nbp.agriculture.stages.services.service.AgricultureApplicationStagesLocalServiceUtil;

/**
 * The extended model base implementation for the AgricultureApplicationStages service. Represents a row in the &quot;nbp_agriculture_app_stages&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AgricultureApplicationStagesImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApplicationStagesImpl
 * @see AgricultureApplicationStages
 * @generated
 */
public abstract class AgricultureApplicationStagesBaseImpl
	extends AgricultureApplicationStagesModelImpl
	implements AgricultureApplicationStages {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a agriculture application stages model instance should use the <code>AgricultureApplicationStages</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			AgricultureApplicationStagesLocalServiceUtil.
				addAgricultureApplicationStages(this);
		}
		else {
			AgricultureApplicationStagesLocalServiceUtil.
				updateAgricultureApplicationStages(this);
		}
	}

}