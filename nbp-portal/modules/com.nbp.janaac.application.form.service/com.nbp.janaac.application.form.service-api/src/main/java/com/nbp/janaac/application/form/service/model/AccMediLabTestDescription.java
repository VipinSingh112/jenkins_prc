/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AccMediLabTestDescription service. Represents a row in the &quot;nbp_janaac_acc_med_test_desc&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestDescriptionModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.application.form.service.model.impl.AccMediLabTestDescriptionImpl"
)
@ProviderType
public interface AccMediLabTestDescription
	extends AccMediLabTestDescriptionModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabTestDescriptionImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AccMediLabTestDescription, Long>
		ACC_MEDI_LAB_TEST_DESCRIPTION_ID_ACCESSOR =
			new Accessor<AccMediLabTestDescription, Long>() {

				@Override
				public Long get(
					AccMediLabTestDescription accMediLabTestDescription) {

					return accMediLabTestDescription.
						getAccMediLabTestDescriptionId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AccMediLabTestDescription> getTypeClass() {
					return AccMediLabTestDescription.class;
				}

			};

}