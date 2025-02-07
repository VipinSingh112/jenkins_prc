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
 * The extended model interface for the SezZoneUserUnderInfo service. Represents a row in the &quot;nbp_sez_zone_user_under_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneUserUnderInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.form.service.model.impl.SezZoneUserUnderInfoImpl"
)
@ProviderType
public interface SezZoneUserUnderInfo
	extends PersistedModel, SezZoneUserUnderInfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneUserUnderInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezZoneUserUnderInfo, Long>
		SEZ_ZONE_USER_UNDER_INFO_ID_ACCESSOR =
			new Accessor<SezZoneUserUnderInfo, Long>() {

				@Override
				public Long get(SezZoneUserUnderInfo sezZoneUserUnderInfo) {
					return sezZoneUserUnderInfo.getSezZoneUserUnderInfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezZoneUserUnderInfo> getTypeClass() {
					return SezZoneUserUnderInfo.class;
				}

			};

}