/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.model.impl;

import com.nbp.osi.stages.services.model.OsiApplicationStages;
import com.nbp.osi.stages.services.service.OsiApplicationStagesLocalServiceUtil;

/**
 * The extended model base implementation for the OsiApplicationStages service. Represents a row in the &quot;nbp_osi_app_stages&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OsiApplicationStagesImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiApplicationStagesImpl
 * @see OsiApplicationStages
 * @generated
 */
public abstract class OsiApplicationStagesBaseImpl
	extends OsiApplicationStagesModelImpl implements OsiApplicationStages {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a osi application stages model instance should use the <code>OsiApplicationStages</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			OsiApplicationStagesLocalServiceUtil.addOsiApplicationStages(this);
		}
		else {
			OsiApplicationStagesLocalServiceUtil.updateOsiApplicationStages(
				this);
		}
	}

}