/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.nbp.jtb.application.form.service.model.AttractionWaterGenDeclare;
import com.nbp.jtb.application.form.service.service.AttractionWaterGenDeclareLocalServiceUtil;

/**
 * The extended model base implementation for the AttractionWaterGenDeclare service. Represents a row in the &quot;nbp_jtb_water_general&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AttractionWaterGenDeclareImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterGenDeclareImpl
 * @see AttractionWaterGenDeclare
 * @generated
 */
public abstract class AttractionWaterGenDeclareBaseImpl
	extends AttractionWaterGenDeclareModelImpl
	implements AttractionWaterGenDeclare {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a attraction water gen declare model instance should use the <code>AttractionWaterGenDeclare</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			AttractionWaterGenDeclareLocalServiceUtil.
				addAttractionWaterGenDeclare(this);
		}
		else {
			AttractionWaterGenDeclareLocalServiceUtil.
				updateAttractionWaterGenDeclare(this);
		}
	}

}