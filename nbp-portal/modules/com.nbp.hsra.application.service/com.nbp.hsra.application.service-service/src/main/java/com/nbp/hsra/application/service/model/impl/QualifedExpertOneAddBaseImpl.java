/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.nbp.hsra.application.service.model.QualifedExpertOneAdd;
import com.nbp.hsra.application.service.service.QualifedExpertOneAddLocalServiceUtil;

/**
 * The extended model base implementation for the QualifedExpertOneAdd service. Represents a row in the &quot;nbp_hsra_quali_expert_one_add&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QualifedExpertOneAddImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualifedExpertOneAddImpl
 * @see QualifedExpertOneAdd
 * @generated
 */
public abstract class QualifedExpertOneAddBaseImpl
	extends QualifedExpertOneAddModelImpl implements QualifedExpertOneAdd {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a qualifed expert one add model instance should use the <code>QualifedExpertOneAdd</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			QualifedExpertOneAddLocalServiceUtil.addQualifedExpertOneAdd(this);
		}
		else {
			QualifedExpertOneAddLocalServiceUtil.updateQualifedExpertOneAdd(
				this);
		}
	}

}