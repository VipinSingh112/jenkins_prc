/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model.impl;

import com.nbp.creative.application.form.service.model.CreativeIndividualDetailsAddress;
import com.nbp.creative.application.form.service.service.CreativeIndividualDetailsAddressLocalServiceUtil;

/**
 * The extended model base implementation for the CreativeIndividualDetailsAddress service. Represents a row in the &quot;nbp_creative_ida&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CreativeIndividualDetailsAddressImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualDetailsAddressImpl
 * @see CreativeIndividualDetailsAddress
 * @generated
 */
public abstract class CreativeIndividualDetailsAddressBaseImpl
	extends CreativeIndividualDetailsAddressModelImpl
	implements CreativeIndividualDetailsAddress {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a creative individual details address model instance should use the <code>CreativeIndividualDetailsAddress</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			CreativeIndividualDetailsAddressLocalServiceUtil.
				addCreativeIndividualDetailsAddress(this);
		}
		else {
			CreativeIndividualDetailsAddressLocalServiceUtil.
				updateCreativeIndividualDetailsAddress(this);
		}
	}

}