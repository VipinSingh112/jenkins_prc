/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model.impl;

import com.nbp.creative.application.form.service.model.CreativeIndividualDetails;
import com.nbp.creative.application.form.service.service.CreativeIndividualDetailsLocalServiceUtil;

/**
 * The extended model base implementation for the CreativeIndividualDetails service. Represents a row in the &quot;nbp_creative_individual_detail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CreativeIndividualDetailsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualDetailsImpl
 * @see CreativeIndividualDetails
 * @generated
 */
public abstract class CreativeIndividualDetailsBaseImpl
	extends CreativeIndividualDetailsModelImpl
	implements CreativeIndividualDetails {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a creative individual details model instance should use the <code>CreativeIndividualDetails</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			CreativeIndividualDetailsLocalServiceUtil.
				addCreativeIndividualDetails(this);
		}
		else {
			CreativeIndividualDetailsLocalServiceUtil.
				updateCreativeIndividualDetails(this);
		}
	}

}