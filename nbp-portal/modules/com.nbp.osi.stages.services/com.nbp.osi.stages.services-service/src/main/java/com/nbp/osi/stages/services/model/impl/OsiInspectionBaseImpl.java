/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.model.impl;

import com.nbp.osi.stages.services.model.OsiInspection;
import com.nbp.osi.stages.services.service.OsiInspectionLocalServiceUtil;

/**
 * The extended model base implementation for the OsiInspection service. Represents a row in the &quot;osi_application_inspec&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OsiInspectionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInspectionImpl
 * @see OsiInspection
 * @generated
 */
public abstract class OsiInspectionBaseImpl
	extends OsiInspectionModelImpl implements OsiInspection {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a osi inspection model instance should use the <code>OsiInspection</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			OsiInspectionLocalServiceUtil.addOsiInspection(this);
		}
		else {
			OsiInspectionLocalServiceUtil.updateOsiInspection(this);
		}
	}

}