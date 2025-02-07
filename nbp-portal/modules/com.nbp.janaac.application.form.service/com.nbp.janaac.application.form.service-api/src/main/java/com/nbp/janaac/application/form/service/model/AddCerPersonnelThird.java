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
 * The extended model interface for the AddCerPersonnelThird service. Represents a row in the &quot;nbp_janaac_add_cer_per_third&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AddCerPersonnelThirdModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelThirdImpl"
)
@ProviderType
public interface AddCerPersonnelThird
	extends AddCerPersonnelThirdModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelThirdImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AddCerPersonnelThird, Long>
		ADD_CER_PERSONNEL_THIRD_ID_ACCESSOR =
			new Accessor<AddCerPersonnelThird, Long>() {

				@Override
				public Long get(AddCerPersonnelThird addCerPersonnelThird) {
					return addCerPersonnelThird.getAddCerPersonnelThirdId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AddCerPersonnelThird> getTypeClass() {
					return AddCerPersonnelThird.class;
				}

			};

}