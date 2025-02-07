/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.nbp.ncbj.application.form.service.model.NcbjSectionFour;
import com.nbp.ncbj.application.form.service.service.NcbjSectionFourLocalServiceUtil;

/**
 * The extended model base implementation for the NcbjSectionFour service. Represents a row in the &quot;nbp_ncbj_section_four&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NcbjSectionFourImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionFourImpl
 * @see NcbjSectionFour
 * @generated
 */
public abstract class NcbjSectionFourBaseImpl
	extends NcbjSectionFourModelImpl implements NcbjSectionFour {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a ncbj section four model instance should use the <code>NcbjSectionFour</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			NcbjSectionFourLocalServiceUtil.addNcbjSectionFour(this);
		}
		else {
			NcbjSectionFourLocalServiceUtil.updateNcbjSectionFour(this);
		}
	}

}