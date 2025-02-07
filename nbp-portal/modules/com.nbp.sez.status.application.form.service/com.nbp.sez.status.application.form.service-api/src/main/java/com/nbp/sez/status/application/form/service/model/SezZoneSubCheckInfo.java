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
 * The extended model interface for the SezZoneSubCheckInfo service. Represents a row in the &quot;nbp_sez_zone_sub_check_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneSubCheckInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.form.service.model.impl.SezZoneSubCheckInfoImpl"
)
@ProviderType
public interface SezZoneSubCheckInfo
	extends PersistedModel, SezZoneSubCheckInfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneSubCheckInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezZoneSubCheckInfo, Long>
		SEZ_ZONE_SUB_CHECK_INFO_ID_ACCESSOR =
			new Accessor<SezZoneSubCheckInfo, Long>() {

				@Override
				public Long get(SezZoneSubCheckInfo sezZoneSubCheckInfo) {
					return sezZoneSubCheckInfo.getSezZoneSubCheckInfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezZoneSubCheckInfo> getTypeClass() {
					return SezZoneSubCheckInfo.class;
				}

			};

}