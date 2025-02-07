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
 * The extended model interface for the SezOccupantUserUndertakingInfo service. Represents a row in the &quot;nbp_sez_occ_user_under_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantUserUndertakingInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.form.service.model.impl.SezOccupantUserUndertakingInfoImpl"
)
@ProviderType
public interface SezOccupantUserUndertakingInfo
	extends PersistedModel, SezOccupantUserUndertakingInfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantUserUndertakingInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezOccupantUserUndertakingInfo, Long>
		SEZ_OCC_USERUNDER_ID_ACCESSOR =
			new Accessor<SezOccupantUserUndertakingInfo, Long>() {

				@Override
				public Long get(
					SezOccupantUserUndertakingInfo
						sezOccupantUserUndertakingInfo) {

					return sezOccupantUserUndertakingInfo.
						getSezOccUserunderId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezOccupantUserUndertakingInfo> getTypeClass() {
					return SezOccupantUserUndertakingInfo.class;
				}

			};

}