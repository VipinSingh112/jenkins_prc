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
 * The extended model interface for the SezZoneLocationAdd service. Represents a row in the &quot;nbp_sez_zone_location_add&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneLocationAddModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.form.service.model.impl.SezZoneLocationAddImpl"
)
@ProviderType
public interface SezZoneLocationAdd
	extends PersistedModel, SezZoneLocationAddModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneLocationAddImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezZoneLocationAdd, Long>
		SEZ_ZONE_LOCATION_ADD_ID_ACCESSOR =
			new Accessor<SezZoneLocationAdd, Long>() {

				@Override
				public Long get(SezZoneLocationAdd sezZoneLocationAdd) {
					return sezZoneLocationAdd.getSezZoneLocationAddId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezZoneLocationAdd> getTypeClass() {
					return SezZoneLocationAdd.class;
				}

			};

}