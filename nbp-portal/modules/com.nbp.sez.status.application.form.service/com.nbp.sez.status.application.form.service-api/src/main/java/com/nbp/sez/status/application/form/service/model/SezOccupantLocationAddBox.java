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
 * The extended model interface for the SezOccupantLocationAddBox service. Represents a row in the &quot;nbp_sez_occ_location_add_box&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantLocationAddBoxModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.form.service.model.impl.SezOccupantLocationAddBoxImpl"
)
@ProviderType
public interface SezOccupantLocationAddBox
	extends PersistedModel, SezOccupantLocationAddBoxModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantLocationAddBoxImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezOccupantLocationAddBox, Long>
		SEZ_OCC_LOCATION_ID_ACCESSOR =
			new Accessor<SezOccupantLocationAddBox, Long>() {

				@Override
				public Long get(
					SezOccupantLocationAddBox sezOccupantLocationAddBox) {

					return sezOccupantLocationAddBox.getSezOccLocationId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezOccupantLocationAddBox> getTypeClass() {
					return SezOccupantLocationAddBox.class;
				}

			};

}