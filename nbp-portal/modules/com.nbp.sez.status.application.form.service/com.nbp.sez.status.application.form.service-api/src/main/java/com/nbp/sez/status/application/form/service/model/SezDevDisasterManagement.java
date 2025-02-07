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
 * The extended model interface for the SezDevDisasterManagement service. Represents a row in the &quot;nbp_sez_dev_disaster_manage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevDisasterManagementModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.form.service.model.impl.SezDevDisasterManagementImpl"
)
@ProviderType
public interface SezDevDisasterManagement
	extends PersistedModel, SezDevDisasterManagementModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.form.service.model.impl.SezDevDisasterManagementImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezDevDisasterManagement, Long>
		SEZ_DEV_DISASTER_MANAGEMENT_ID_ACCESSOR =
			new Accessor<SezDevDisasterManagement, Long>() {

				@Override
				public Long get(
					SezDevDisasterManagement sezDevDisasterManagement) {

					return sezDevDisasterManagement.
						getSezDevDisasterManagementId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezDevDisasterManagement> getTypeClass() {
					return SezDevDisasterManagement.class;
				}

			};

}