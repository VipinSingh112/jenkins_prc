/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the NcraApplication service. Represents a row in the &quot;nbp_ncra_applications&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see NcraApplicationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.ncra.application.form.service.model.impl.NcraApplicationImpl"
)
@ProviderType
public interface NcraApplication extends NcraApplicationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.ncra.application.form.service.model.impl.NcraApplicationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<NcraApplication, Long>
		NCRA_APPLICATION_ID_ACCESSOR = new Accessor<NcraApplication, Long>() {

			@Override
			public Long get(NcraApplication ncraApplication) {
				return ncraApplication.getNcraApplicationId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<NcraApplication> getTypeClass() {
				return NcraApplication.class;
			}

		};

}