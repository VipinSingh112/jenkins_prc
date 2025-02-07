/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo;
import com.nbp.ncbj.application.form.service.service.NcbjOrgDetailInfoLocalServiceUtil;

/**
 * The extended model base implementation for the NcbjOrgDetailInfo service. Represents a row in the &quot;nbp_ncbj_org_detail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NcbjOrgDetailInfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjOrgDetailInfoImpl
 * @see NcbjOrgDetailInfo
 * @generated
 */
public abstract class NcbjOrgDetailInfoBaseImpl
	extends NcbjOrgDetailInfoModelImpl implements NcbjOrgDetailInfo {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a ncbj org detail info model instance should use the <code>NcbjOrgDetailInfo</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			NcbjOrgDetailInfoLocalServiceUtil.addNcbjOrgDetailInfo(this);
		}
		else {
			NcbjOrgDetailInfoLocalServiceUtil.updateNcbjOrgDetailInfo(this);
		}
	}

}