/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the SezDevGeneralBusinessIfo service. Represents a row in the &quot;nbp_sez_dev_gen_business_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevGeneralBusinessIfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.form.service.model.impl.SezDevGeneralBusinessIfoImpl"
)
@ProviderType
public interface SezDevGeneralBusinessIfo
	extends PersistedModel, SezDevGeneralBusinessIfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.form.service.model.impl.SezDevGeneralBusinessIfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezDevGeneralBusinessIfo, Long>
		SEZ_DEV_GENERAL_BUSINESS_IFO_ID_ACCESSOR =
			new Accessor<SezDevGeneralBusinessIfo, Long>() {

				@Override
				public Long get(
					SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo) {

					return sezDevGeneralBusinessIfo.
						getSezDevGeneralBusinessIfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezDevGeneralBusinessIfo> getTypeClass() {
					return SezDevGeneralBusinessIfo.class;
				}

			};

}