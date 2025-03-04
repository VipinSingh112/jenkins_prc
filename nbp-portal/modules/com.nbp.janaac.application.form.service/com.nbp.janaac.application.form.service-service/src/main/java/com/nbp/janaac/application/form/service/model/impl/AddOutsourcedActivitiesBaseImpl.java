/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.nbp.janaac.application.form.service.model.AddOutsourcedActivities;
import com.nbp.janaac.application.form.service.service.AddOutsourcedActivitiesLocalServiceUtil;

/**
 * The extended model base implementation for the AddOutsourcedActivities service. Represents a row in the &quot;nbp_janaac_add_out_src_act&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AddOutsourcedActivitiesImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddOutsourcedActivitiesImpl
 * @see AddOutsourcedActivities
 * @generated
 */
public abstract class AddOutsourcedActivitiesBaseImpl
	extends AddOutsourcedActivitiesModelImpl
	implements AddOutsourcedActivities {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a add outsourced activities model instance should use the <code>AddOutsourcedActivities</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			AddOutsourcedActivitiesLocalServiceUtil.addAddOutsourcedActivities(
				this);
		}
		else {
			AddOutsourcedActivitiesLocalServiceUtil.
				updateAddOutsourcedActivities(this);
		}
	}

}