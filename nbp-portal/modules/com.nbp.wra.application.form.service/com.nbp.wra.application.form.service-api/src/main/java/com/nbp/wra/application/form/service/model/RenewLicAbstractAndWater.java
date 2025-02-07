/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the RenewLicAbstractAndWater service. Represents a row in the &quot;nbp_wra_renew_abstract&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see RenewLicAbstractAndWaterModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.wra.application.form.service.model.impl.RenewLicAbstractAndWaterImpl"
)
@ProviderType
public interface RenewLicAbstractAndWater
	extends PersistedModel, RenewLicAbstractAndWaterModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.wra.application.form.service.model.impl.RenewLicAbstractAndWaterImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<RenewLicAbstractAndWater, Long>
		RENEW_LIC_ABSTRACT_AND_WATER_ID_ACCESSOR =
			new Accessor<RenewLicAbstractAndWater, Long>() {

				@Override
				public Long get(
					RenewLicAbstractAndWater renewLicAbstractAndWater) {

					return renewLicAbstractAndWater.
						getRenewLicAbstractAndWaterId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<RenewLicAbstractAndWater> getTypeClass() {
					return RenewLicAbstractAndWater.class;
				}

			};

}