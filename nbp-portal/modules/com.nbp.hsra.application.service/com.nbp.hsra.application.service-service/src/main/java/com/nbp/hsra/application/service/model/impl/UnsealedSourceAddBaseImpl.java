/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.nbp.hsra.application.service.model.UnsealedSourceAdd;
import com.nbp.hsra.application.service.service.UnsealedSourceAddLocalServiceUtil;

/**
 * The extended model base implementation for the UnsealedSourceAdd service. Represents a row in the &quot;nbp_hsra_unsealed_sources&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UnsealedSourceAddImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UnsealedSourceAddImpl
 * @see UnsealedSourceAdd
 * @generated
 */
public abstract class UnsealedSourceAddBaseImpl
	extends UnsealedSourceAddModelImpl implements UnsealedSourceAdd {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a unsealed source add model instance should use the <code>UnsealedSourceAdd</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			UnsealedSourceAddLocalServiceUtil.addUnsealedSourceAdd(this);
		}
		else {
			UnsealedSourceAddLocalServiceUtil.updateUnsealedSourceAdd(this);
		}
	}

}