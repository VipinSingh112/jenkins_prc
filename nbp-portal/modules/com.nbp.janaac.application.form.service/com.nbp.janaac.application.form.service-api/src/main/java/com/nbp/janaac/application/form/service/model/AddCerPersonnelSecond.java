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
 * The extended model interface for the AddCerPersonnelSecond service. Represents a row in the &quot;nbp_janaac_add_cer_per_sec&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AddCerPersonnelSecondModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelSecondImpl"
)
@ProviderType
public interface AddCerPersonnelSecond
	extends AddCerPersonnelSecondModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelSecondImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AddCerPersonnelSecond, Long>
		ADD_CER_PERSONNEL_SECOND_ID_ACCESSOR =
			new Accessor<AddCerPersonnelSecond, Long>() {

				@Override
				public Long get(AddCerPersonnelSecond addCerPersonnelSecond) {
					return addCerPersonnelSecond.getAddCerPersonnelSecondId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AddCerPersonnelSecond> getTypeClass() {
					return AddCerPersonnelSecond.class;
				}

			};

}