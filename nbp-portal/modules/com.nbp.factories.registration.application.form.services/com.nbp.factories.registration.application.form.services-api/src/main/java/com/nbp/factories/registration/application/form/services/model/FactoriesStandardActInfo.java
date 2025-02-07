/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the FactoriesStandardActInfo service. Represents a row in the &quot;nbp_factories_stand_act_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesStandardActInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.factories.registration.application.form.services.model.impl.FactoriesStandardActInfoImpl"
)
@ProviderType
public interface FactoriesStandardActInfo
	extends FactoriesStandardActInfoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesStandardActInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<FactoriesStandardActInfo, Long>
		FACTORIES_STANDARD_ACT_ID_ACCESSOR =
			new Accessor<FactoriesStandardActInfo, Long>() {

				@Override
				public Long get(
					FactoriesStandardActInfo factoriesStandardActInfo) {

					return factoriesStandardActInfo.getFactoriesStandardActId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<FactoriesStandardActInfo> getTypeClass() {
					return FactoriesStandardActInfo.class;
				}

			};

}