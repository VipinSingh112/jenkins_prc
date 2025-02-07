/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the NcbjApplication service. Represents a row in the &quot;nbp_ncbj_application&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.ncbj.application.form.service.model.impl.NcbjApplicationImpl"
)
@ProviderType
public interface NcbjApplication extends NcbjApplicationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.ncbj.application.form.service.model.impl.NcbjApplicationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<NcbjApplication, Long>
		NCBJ_APPLICATION_ID_ACCESSOR = new Accessor<NcbjApplication, Long>() {

			@Override
			public Long get(NcbjApplication ncbjApplication) {
				return ncbjApplication.getNcbjApplicationId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<NcbjApplication> getTypeClass() {
				return NcbjApplication.class;
			}

		};

}