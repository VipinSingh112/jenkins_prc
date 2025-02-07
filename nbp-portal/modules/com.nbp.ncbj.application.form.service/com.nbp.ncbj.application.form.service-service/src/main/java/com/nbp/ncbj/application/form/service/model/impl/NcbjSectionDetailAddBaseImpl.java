/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd;
import com.nbp.ncbj.application.form.service.service.NcbjSectionDetailAddLocalServiceUtil;

/**
 * The extended model base implementation for the NcbjSectionDetailAdd service. Represents a row in the &quot;nbp_ncbj_section_detail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NcbjSectionDetailAddImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionDetailAddImpl
 * @see NcbjSectionDetailAdd
 * @generated
 */
public abstract class NcbjSectionDetailAddBaseImpl
	extends NcbjSectionDetailAddModelImpl implements NcbjSectionDetailAdd {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a ncbj section detail add model instance should use the <code>NcbjSectionDetailAdd</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			NcbjSectionDetailAddLocalServiceUtil.addNcbjSectionDetailAdd(this);
		}
		else {
			NcbjSectionDetailAddLocalServiceUtil.updateNcbjSectionDetailAdd(
				this);
		}
	}

}