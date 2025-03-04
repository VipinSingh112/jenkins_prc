/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.model.impl;

import com.nbp.janaac.stages.services.model.JanaacApplicationStages;
import com.nbp.janaac.stages.services.service.JanaacApplicationStagesLocalServiceUtil;

/**
 * The extended model base implementation for the JanaacApplicationStages service. Represents a row in the &quot;nbp_janaac_app_stages&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JanaacApplicationStagesImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JanaacApplicationStagesImpl
 * @see JanaacApplicationStages
 * @generated
 */
public abstract class JanaacApplicationStagesBaseImpl
	extends JanaacApplicationStagesModelImpl
	implements JanaacApplicationStages {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a janaac application stages model instance should use the <code>JanaacApplicationStages</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			JanaacApplicationStagesLocalServiceUtil.addJanaacApplicationStages(
				this);
		}
		else {
			JanaacApplicationStagesLocalServiceUtil.
				updateJanaacApplicationStages(this);
		}
	}

}