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
 * The extended model interface for the SezZoneDevUnderInfo service. Represents a row in the &quot;nbp_sez_zone_dev_under_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneDevUnderInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.form.service.model.impl.SezZoneDevUnderInfoImpl"
)
@ProviderType
public interface SezZoneDevUnderInfo
	extends PersistedModel, SezZoneDevUnderInfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneDevUnderInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezZoneDevUnderInfo, Long>
		SEZ_ZONE_DEV_UNDER_INFO_ID_ACCESSOR =
			new Accessor<SezZoneDevUnderInfo, Long>() {

				@Override
				public Long get(SezZoneDevUnderInfo sezZoneDevUnderInfo) {
					return sezZoneDevUnderInfo.getSezZoneDevUnderInfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezZoneDevUnderInfo> getTypeClass() {
					return SezZoneDevUnderInfo.class;
				}

			};

}