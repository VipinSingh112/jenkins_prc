/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model.impl;

import com.nbp.manufacturing.application.form.service.model.ProductiveInputsFormAdd;
import com.nbp.manufacturing.application.form.service.service.ProductiveInputsFormAddLocalServiceUtil;

/**
 * The extended model base implementation for the ProductiveInputsFormAdd service. Represents a row in the &quot;nbp_manu_pro_input_add&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ProductiveInputsFormAddImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductiveInputsFormAddImpl
 * @see ProductiveInputsFormAdd
 * @generated
 */
public abstract class ProductiveInputsFormAddBaseImpl
	extends ProductiveInputsFormAddModelImpl
	implements ProductiveInputsFormAdd {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a productive inputs form add model instance should use the <code>ProductiveInputsFormAdd</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			ProductiveInputsFormAddLocalServiceUtil.addProductiveInputsFormAdd(
				this);
		}
		else {
			ProductiveInputsFormAddLocalServiceUtil.
				updateProductiveInputsFormAdd(this);
		}
	}

}