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
 * The extended model interface for the SezOccupantShareHoldingInfo service. Represents a row in the &quot;nbp_sez_occ_share_hold_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantShareHoldingInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.form.service.model.impl.SezOccupantShareHoldingInfoImpl"
)
@ProviderType
public interface SezOccupantShareHoldingInfo
	extends PersistedModel, SezOccupantShareHoldingInfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantShareHoldingInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezOccupantShareHoldingInfo, Long>
		SEZ_OCC_SHARE_HOLDER_ID_ACCESSOR =
			new Accessor<SezOccupantShareHoldingInfo, Long>() {

				@Override
				public Long get(
					SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo) {

					return sezOccupantShareHoldingInfo.getSezOccShareHolderId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezOccupantShareHoldingInfo> getTypeClass() {
					return SezOccupantShareHoldingInfo.class;
				}

			};

}