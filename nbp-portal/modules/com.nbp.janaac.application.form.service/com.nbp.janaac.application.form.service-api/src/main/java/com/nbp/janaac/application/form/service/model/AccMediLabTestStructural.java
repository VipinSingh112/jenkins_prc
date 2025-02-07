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
 * The extended model interface for the AccMediLabTestStructural service. Represents a row in the &quot;nbp_janaac_acc_med_test_struct&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestStructuralModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.application.form.service.model.impl.AccMediLabTestStructuralImpl"
)
@ProviderType
public interface AccMediLabTestStructural
	extends AccMediLabTestStructuralModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabTestStructuralImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AccMediLabTestStructural, Long>
		ACC_MEDI_LAB_TEST_STRUCTURAL_ID_ACCESSOR =
			new Accessor<AccMediLabTestStructural, Long>() {

				@Override
				public Long get(
					AccMediLabTestStructural accMediLabTestStructural) {

					return accMediLabTestStructural.
						getAccMediLabTestStructuralId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AccMediLabTestStructural> getTypeClass() {
					return AccMediLabTestStructural.class;
				}

			};

}