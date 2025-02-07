/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo;
import com.nbp.jtb.application.form.service.service.AttractionGenDeclareInfoLocalServiceUtil;

/**
 * The extended model base implementation for the AttractionGenDeclareInfo service. Represents a row in the &quot;nbp_jtb_attract_gen_dec&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AttractionGenDeclareInfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionGenDeclareInfoImpl
 * @see AttractionGenDeclareInfo
 * @generated
 */
public abstract class AttractionGenDeclareInfoBaseImpl
	extends AttractionGenDeclareInfoModelImpl
	implements AttractionGenDeclareInfo {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a attraction gen declare info model instance should use the <code>AttractionGenDeclareInfo</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			AttractionGenDeclareInfoLocalServiceUtil.
				addAttractionGenDeclareInfo(this);
		}
		else {
			AttractionGenDeclareInfoLocalServiceUtil.
				updateAttractionGenDeclareInfo(this);
		}
	}

}