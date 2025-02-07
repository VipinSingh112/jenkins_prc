/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the RadiationDevicesAdd service. Represents a row in the &quot;nbp_hsra_radiation_dev&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see RadiationDevicesAddModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.hsra.application.service.model.impl.RadiationDevicesAddImpl"
)
@ProviderType
public interface RadiationDevicesAdd
	extends PersistedModel, RadiationDevicesAddModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.hsra.application.service.model.impl.RadiationDevicesAddImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<RadiationDevicesAdd, Long>
		RADIATION_DEVICES_ADD_ID_ACCESSOR =
			new Accessor<RadiationDevicesAdd, Long>() {

				@Override
				public Long get(RadiationDevicesAdd radiationDevicesAdd) {
					return radiationDevicesAdd.getRadiationDevicesAddId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<RadiationDevicesAdd> getTypeClass() {
					return RadiationDevicesAdd.class;
				}

			};

}