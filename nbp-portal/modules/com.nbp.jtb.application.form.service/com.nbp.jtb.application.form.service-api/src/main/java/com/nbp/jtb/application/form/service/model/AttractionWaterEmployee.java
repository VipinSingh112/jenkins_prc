/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AttractionWaterEmployee service. Represents a row in the &quot;nbp_jtb_water_employee&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterEmployeeModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.jtb.application.form.service.model.impl.AttractionWaterEmployeeImpl"
)
@ProviderType
public interface AttractionWaterEmployee
	extends AttractionWaterEmployeeModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.jtb.application.form.service.model.impl.AttractionWaterEmployeeImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AttractionWaterEmployee, Long>
		ATTRACTION_WATER_EMP_LIC_ID_ACCESSOR =
			new Accessor<AttractionWaterEmployee, Long>() {

				@Override
				public Long get(
					AttractionWaterEmployee attractionWaterEmployee) {

					return attractionWaterEmployee.getAttractionWaterEmpLicId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AttractionWaterEmployee> getTypeClass() {
					return AttractionWaterEmployee.class;
				}

			};

}