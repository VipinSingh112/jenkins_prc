/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.nbp.jtb.application.form.service.model.AttractionTravelHaltApp;
import com.nbp.jtb.application.form.service.service.AttractionTravelHaltAppLocalServiceUtil;

/**
 * The extended model base implementation for the AttractionTravelHaltApp service. Represents a row in the &quot;nbp_jtb_travel_halt_app&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AttractionTravelHaltAppImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionTravelHaltAppImpl
 * @see AttractionTravelHaltApp
 * @generated
 */
public abstract class AttractionTravelHaltAppBaseImpl
	extends AttractionTravelHaltAppModelImpl
	implements AttractionTravelHaltApp {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a attraction travel halt app model instance should use the <code>AttractionTravelHaltApp</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			AttractionTravelHaltAppLocalServiceUtil.addAttractionTravelHaltApp(
				this);
		}
		else {
			AttractionTravelHaltAppLocalServiceUtil.
				updateAttractionTravelHaltApp(this);
		}
	}

}