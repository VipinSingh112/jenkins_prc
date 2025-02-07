/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the RadionuclideAdd service. Represents a row in the &quot;nbp_hsra_radionuclide_add&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see RadionuclideAddModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.hsra.application.service.model.impl.RadionuclideAddImpl"
)
@ProviderType
public interface RadionuclideAdd extends PersistedModel, RadionuclideAddModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.hsra.application.service.model.impl.RadionuclideAddImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<RadionuclideAdd, Long>
		RADIONUCLIDE_ADD_ID_ACCESSOR = new Accessor<RadionuclideAdd, Long>() {

			@Override
			public Long get(RadionuclideAdd radionuclideAdd) {
				return radionuclideAdd.getRadionuclideAddId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<RadionuclideAdd> getTypeClass() {
				return RadionuclideAdd.class;
			}

		};

}