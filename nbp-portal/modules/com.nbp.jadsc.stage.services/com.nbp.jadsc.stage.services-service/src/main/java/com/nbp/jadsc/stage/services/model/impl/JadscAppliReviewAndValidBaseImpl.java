/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.model.impl;

import com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValid;
import com.nbp.jadsc.stage.services.service.JadscAppliReviewAndValidLocalServiceUtil;

/**
 * The extended model base implementation for the JadscAppliReviewAndValid service. Represents a row in the &quot;nbp_jadsc_appli_review_veri&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JadscAppliReviewAndValidImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliReviewAndValidImpl
 * @see JadscAppliReviewAndValid
 * @generated
 */
public abstract class JadscAppliReviewAndValidBaseImpl
	extends JadscAppliReviewAndValidModelImpl
	implements JadscAppliReviewAndValid {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a jadsc appli review and valid model instance should use the <code>JadscAppliReviewAndValid</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			JadscAppliReviewAndValidLocalServiceUtil.
				addJadscAppliReviewAndValid(this);
		}
		else {
			JadscAppliReviewAndValidLocalServiceUtil.
				updateJadscAppliReviewAndValid(this);
		}
	}

}