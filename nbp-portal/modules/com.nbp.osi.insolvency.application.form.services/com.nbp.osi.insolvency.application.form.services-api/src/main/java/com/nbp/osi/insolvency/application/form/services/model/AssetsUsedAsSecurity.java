/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AssetsUsedAsSecurity service. Represents a row in the &quot;nbp_osi_used_as_security&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AssetsUsedAsSecurityModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.insolvency.application.form.services.model.impl.AssetsUsedAsSecurityImpl"
)
@ProviderType
public interface AssetsUsedAsSecurity
	extends AssetsUsedAsSecurityModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.insolvency.application.form.services.model.impl.AssetsUsedAsSecurityImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AssetsUsedAsSecurity, Long>
		ASSETS_USED_AS_SECURITY_ID_ACCESSOR =
			new Accessor<AssetsUsedAsSecurity, Long>() {

				@Override
				public Long get(AssetsUsedAsSecurity assetsUsedAsSecurity) {
					return assetsUsedAsSecurity.getAssetsUsedAsSecurityId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AssetsUsedAsSecurity> getTypeClass() {
					return AssetsUsedAsSecurity.class;
				}

			};

}