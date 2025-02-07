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
 * The extended model interface for the SezDevSharePrincipalAdd service. Represents a row in the &quot;nbp_sez_dev_share_pricipal_add&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevSharePrincipalAddModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.form.service.model.impl.SezDevSharePrincipalAddImpl"
)
@ProviderType
public interface SezDevSharePrincipalAdd
	extends PersistedModel, SezDevSharePrincipalAddModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.form.service.model.impl.SezDevSharePrincipalAddImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezDevSharePrincipalAdd, Long>
		SEZ_DEV_SHARE_PRINCIPAL_ADD_ID_ACCESSOR =
			new Accessor<SezDevSharePrincipalAdd, Long>() {

				@Override
				public Long get(
					SezDevSharePrincipalAdd sezDevSharePrincipalAdd) {

					return sezDevSharePrincipalAdd.
						getSezDevSharePrincipalAddId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezDevSharePrincipalAdd> getTypeClass() {
					return SezDevSharePrincipalAdd.class;
				}

			};

}