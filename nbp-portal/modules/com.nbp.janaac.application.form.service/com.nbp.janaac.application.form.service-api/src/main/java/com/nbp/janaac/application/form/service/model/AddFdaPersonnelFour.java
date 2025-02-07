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
 * The extended model interface for the AddFdaPersonnelFour service. Represents a row in the &quot;nbp_janaac_add_fda_per_four&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelFourModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelFourImpl"
)
@ProviderType
public interface AddFdaPersonnelFour
	extends AddFdaPersonnelFourModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.application.form.service.model.impl.AddFdaPersonnelFourImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AddFdaPersonnelFour, Long>
		ADD_FDA_PERSONNEL_FOUR_ID_ACCESSOR =
			new Accessor<AddFdaPersonnelFour, Long>() {

				@Override
				public Long get(AddFdaPersonnelFour addFdaPersonnelFour) {
					return addFdaPersonnelFour.getAddFdaPersonnelFourId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AddFdaPersonnelFour> getTypeClass() {
					return AddFdaPersonnelFour.class;
				}

			};

}