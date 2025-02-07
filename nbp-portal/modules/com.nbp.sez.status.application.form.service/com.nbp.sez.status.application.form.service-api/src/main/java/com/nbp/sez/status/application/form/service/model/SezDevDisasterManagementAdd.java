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
 * The extended model interface for the SezDevDisasterManagementAdd service. Represents a row in the &quot;nbp_sez_dev_disast_manag_add&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevDisasterManagementAddModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.form.service.model.impl.SezDevDisasterManagementAddImpl"
)
@ProviderType
public interface SezDevDisasterManagementAdd
	extends PersistedModel, SezDevDisasterManagementAddModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.form.service.model.impl.SezDevDisasterManagementAddImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezDevDisasterManagementAdd, Long>
		SEZ_DEV_DISASTER_MANAGEMENT_ADD_ID_ACCESSOR =
			new Accessor<SezDevDisasterManagementAdd, Long>() {

				@Override
				public Long get(
					SezDevDisasterManagementAdd sezDevDisasterManagementAdd) {

					return sezDevDisasterManagementAdd.
						getSezDevDisasterManagementAddId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezDevDisasterManagementAdd> getTypeClass() {
					return SezDevDisasterManagementAdd.class;
				}

			};

}